package com.helpsystems.intermapperreport.uitest.general;

import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.*;
import com.helpsystems.intermapperreport.uitest.base.GeneralBaseTest;
import com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants;

public class TestReportBug extends GeneralBaseTest {
	
	@Override
	public void init() throws Exception {
    interMapperReportBaseValidator.login(DEFAULT_USERNAME, DEFAULT_PASSWORD);
	}

	@Override
	public void testBody() throws Exception {
		generalValidator.clickOnReportBugButton();
		testUtils.switchToNewWindow();
	}

	@Override
	public void validation() throws Exception {
		generalValidator.validateReportBugContents();		
	}

	@Override
	public void cleanUp() throws Exception {
	}

	@Override
	public String getOwner() {
		return InterMapperReportConstants.HOVHANNESM;
	}

}