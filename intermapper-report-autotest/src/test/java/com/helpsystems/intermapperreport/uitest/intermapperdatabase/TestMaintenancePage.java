package com.helpsystems.intermapperreport.uitest.intermapperdatabase;

import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.DEFAULT_PASSWORD;
import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.DEFAULT_USERNAME;
import com.helpsystems.intermapperreport.uitest.base.IntermapperDatabaseBaseTest;
import com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants;

/**
 * class for testing all elements in the IMDC Maintenance page
 * 
 * @author Armen Torunyan
 * 
 */

public class TestMaintenancePage extends IntermapperDatabaseBaseTest {

	
	@Override
	public void init() throws Exception {
		interMapperReportBaseValidator.login(DEFAULT_USERNAME, DEFAULT_PASSWORD);
	}

	@Override
	public void testBody() throws Exception {
		// Click on the Maintenance text-link in the Home page
		intermapperDatabaseValidator.clickOnMaintenanceButton();
	}

	@Override
	public void validation() throws Exception {
		// Validate the Maintenance Page items.
		intermapperDatabaseValidator.validateMaintenancePageItems();
	}

	@Override
	public void cleanUp() throws Exception {
	}

	@Override
	public String getOwner() {
		return InterMapperReportConstants.ARMEN;
	}

}
