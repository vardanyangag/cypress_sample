package com.helpsystems.intermapperreport.uitest.apps;

import com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants;
import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.*;
import com.helpsystems.intermapperreport.uitest.base.AppsBaseTest;
import static com.helpsystems.intermapperreport.uitest.utils.LocatorsConstants.*;

/**
 * class for testing Dismissing Remove App functionality 
 * 
 * @author Lilit Grigoryan
 * 
 */
public class TestDismissRemoveApp extends AppsBaseTest {

	@Override
	public void init() throws Exception {
		
		interMapperReportBaseValidator.login(DEFAULT_USERNAME, DEFAULT_PASSWORD);
	}

	@Override
	public void testBody() throws Exception {
		
		// Go to Manage Apps page
		interMapperReportBaseValidator.openManageApps();
		
		// Click Remove button		
		interMapperReportBaseValidator.clickOnItem(REMOVE_AUTH_BUTTON_XPATH);
		
	}

	@Override
	public void validation() throws Exception {
		
		// Validate alert message
		appsValidator.validateRemoveAppAlert();
		
		// Dismiss alert
		interMapperReportBaseValidator.dismissAlert();

		// Validate the links/headers on the page.
		appsValidator.validateManageAppsPage();
	}

	@Override
	public void cleanUp() throws Exception {
		
		// Go to home page
		interMapperReportBaseValidator.openHome();
		
		// Log out from the server
		interMapperReportBaseValidator.logout();
	}

	@Override
	public String getOwner() {
		return InterMapperReportConstants.LILIT;
	}
}
