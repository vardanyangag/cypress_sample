package com.helpsystems.intermapperreport.uitest.intermapperdatabase;

import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.DEFAULT_PASSWORD;
import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.DEFAULT_USERNAME;
import com.helpsystems.intermapperreport.uitest.base.IntermapperDatabaseBaseTest;
import com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants;

/**
 * class for testing all elements in the IMDC Change Settings page
 * 
 * @author Armen Torunyan
 * 
 */

public class TestChangeSettingsPage extends IntermapperDatabaseBaseTest {
	@Override
	public void init() throws Exception {
		interMapperReportBaseValidator.login(DEFAULT_USERNAME, DEFAULT_PASSWORD);
	}

	@Override
	public void testBody() throws Exception {
		// Click on the Change Settings text-link in the Home page
		intermapperDatabaseValidator.clickOnChangeSettingsButton();
	}

	@Override
	public void validation() throws Exception {
		// Validate the Change settings Page items.
		intermapperDatabaseValidator.validateChangeSettingsPageItems();
		// Click on the show help text-link in the Home page
		intermapperDatabaseValidator.clickOnShowHelpButton();
		// Validate the Change settings Page's show help items.
		intermapperDatabaseValidator.validateChangeSettingsShowHelpItems();
		// Click on the hide help text-link in the Home page
		intermapperDatabaseValidator.clickOnHideHelpButton();
	}

	@Override
	public void cleanUp() throws Exception {
	}

	@Override
	public String getOwner() {
		return InterMapperReportConstants.ARMEN;
	}

}
