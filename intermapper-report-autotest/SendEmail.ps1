$subject = “Intermapper-Report-Autotest Regression run is Completed."
$body = “Hi Everyone,</br></br>The Intermapper Report Regression run is Completed. Please find the report <a href='http://autotest.helpsystems.com:8083/RegressionFramework/regression.jsp?regId=IntermapperReport&regName=Intermapper%20Report&redirect=true'>here</a>"

[string]$userName = 'imqasvc@helpsysdev.com'
[string]$userPassword = 'HelpSysdev2022!@#'
[securestring]$secStringPassword = ConvertTo-SecureString $userPassword -AsPlainText -Force
[pscredential]$credObject = New-Object System.Management.Automation.PSCredential ($userName, $secStringPassword)

send-MailMessage -To "anzhela.sarukhanyan@helpsystems.com", "Armen.Torunyan@helpsystems.com", "Sargis.Vasilyan@helpsystems.com", "Hovhannes.Mkrtchyan@helpsystems.com" -From “imqasvc@helpsysdev.com”  -Subject $subject -Body $body -BodyAsHtml -Credential $credObject -SmtpServer “smtp.helpsysdev.com”