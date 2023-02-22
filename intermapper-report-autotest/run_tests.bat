call taskkill /F /IM chromedriver.exe >nul 2>&1

echo "Starting InterMapper Report Primary Run"

::  ############################ InterMapper regression primary run #######################
call mvn exec:java -D"exec.mainClass"="com.helpsystems.common.util.ClearLastRunResults"
call mvn exec:java -D"exec.mainClass"="com.helpsystems.common.util.ChangeProperty" -Dexec.args="test.properties regression.run.type 'InterMapper Report Primary Run'"

call mvn surefire-report:report -Dtest=com.helpsystems.intermapperreport.uitest.apps.Test* -DforkCnt=2
call mvn surefire-report:report -Dtest=com.helpsystems.intermapperreport.uitest.settings.Test* -DforkCnt=2
call mvn surefire-report:report -Dtest=com.helpsystems.intermapperreport.uitest.intermapperdatabase.Test* -DforkCnt=2
call mvn surefire-report:report -Dtest=com.helpsystems.intermapperreport.uitest.general.Test* -DforkCnt=2

::  ############################ InterMapper regression rerun #######################
call mvn exec:java -D"exec.mainClass"="com.helpsystems.common.util.ChangeProperty" -Dexec.args="test.properties regression.run.type 'InterMapper Report Rerun'"
call mvn exec:java -D"exec.mainClass"="com.helpsystems.common.util.GetFailedTests"

echo "Starting InterMapper Report Rerun"
call rerun.bat

call mvn exec:java -D"exec.mainClass"="com.helpsystems.common.util.ChangeProperty" -Dexec.args="test.properties regression.run.type 'trash'"
::  ############################ Generate email #######################
REM call mvn exec:java -D"exec.mainClass"="com.helpsystems.common.util.GenerateEmail"

powershell -executionpolicy bypass -File .\SendEmail.ps1