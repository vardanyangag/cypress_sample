package com.helpsystems.intermapperreport.uitest.intermapperdatabase;

import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.DEFAULT_PASSWORD;
import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.DEFAULT_USERNAME;
import com.helpsystems.intermapperreport.uitest.base.IntermapperDatabaseBaseTest;
import com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants;

/**
 * class for testing all elements in the IMDC Overview page
 * 
 * @author Armen Torunyan
 * 
 */

public class TestOverviewPage extends IntermapperDatabaseBaseTest {
	@Override
	public void init() throws Exception {
		interMapperReportBaseValidator.login(DEFAULT_USERNAME, DEFAULT_PASSWORD);
	}

	@Override
	public void testBody() throws Exception {
		// Click on the Overview text-link in the Home page
		intermapperDatabaseValidator.clickOnOverviewButton();
	}
	
	@Override
	public void validation() throws Exception {
		// Validate the Overview Page items.
		intermapperDatabaseValidator.validateOverviewPageItems();
	}

	@Override
	public void cleanUp() throws Exception {
	}

	@Override
	public String getOwner() {
		return InterMapperReportConstants.ARMEN;
	}

}
