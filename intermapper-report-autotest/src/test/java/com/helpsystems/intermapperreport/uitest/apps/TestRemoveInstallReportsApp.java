package com.helpsystems.intermapperreport.uitest.apps;

import com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants;
import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.*;
import com.helpsystems.intermapperreport.uitest.base.AppsBaseTest;
import static com.helpsystems.intermapperreport.uitest.utils.LocatorsConstants.*;

/**
 * class for testing  Remove IM Reports App functionality 
 * 
 * @author Lilit Grigoryan
 * 
 */
public class TestRemoveInstallReportsApp extends AppsBaseTest {

	@Override
	public void init() throws Exception {
		
		interMapperReportBaseValidator.login(DEFAULT_USERNAME, DEFAULT_PASSWORD);
	}

	@Override
	public void testBody() throws Exception {
		
		// Go to Manage Apps page
		interMapperReportBaseValidator.openManageApps();
		
		// Click Remove button		
		interMapperReportBaseValidator.clickOnItem(REMOVE_IMREPORTS_BUTTON_XPATH);
		
		// Accept alert
		interMapperReportBaseValidator.acceptAlert();
		
	}

	@Override
	public void validation() throws Exception {
		
		// Validate the links/headers on the page.
		appsValidator.validateReportsAppRemoved();
		
		// Go to Home page
		interMapperReportBaseValidator.openHome();
				
		// Validate the links/headers on the page.
		appsValidator.validateAppsPageReportsAppRemoved();
		
		// Go to Manage Apps page
		interMapperReportBaseValidator.openManageApps();
		
		// Click Install button		
		interMapperReportBaseValidator.clickOnItem(INSTALL_IMREPORTS_BUTTON_XPATH);
		
		// Accept alert
		interMapperReportBaseValidator.acceptAlert();
		
		// Validate the links/headers on the page.
		appsValidator.validateManageAppsPage();
				
		// Go to Home page
		interMapperReportBaseValidator.openHome();
				
		// Validate the links/headers on the page.
		appsValidator.validateAppsPage();	
	}

	@Override
	public void cleanUp() throws Exception {
		
		// Log out from the server
		interMapperReportBaseValidator.logout();
	}

	@Override
	public String getOwner() {
		return InterMapperReportConstants.LILIT;
	}
}
