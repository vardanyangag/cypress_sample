package com.helpsystems.intermapperreport.uitest.apps;

import com.helpsystems.intermapperreport.uitest.base.AppsBaseTest;
import com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants;
import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.*;
import static com.helpsystems.intermapperreport.uitest.utils.LocatorsConstants.*;

/**
 * class for testing Manage Apps page content
 * 
 * @author Lilit Grigoryan
 * 
 */
public class TestRemoveInstallAllApps extends AppsBaseTest {

	@Override
	public void init() throws Exception {
		
		interMapperReportBaseValidator.login(DEFAULT_USERNAME, DEFAULT_PASSWORD);
	}

	@Override
	public void testBody() throws Exception {
		
		// Go to Manage Apps page
		interMapperReportBaseValidator.openManageApps();
	}

	@Override
	public void validation() throws Exception {
		
		// Click Remove button		
		interMapperReportBaseValidator.clickOnItem(REMOVE_AUTH_BUTTON_XPATH);
				
		// Accept alert
		interMapperReportBaseValidator.acceptAlert();
		
		// Click Remove button		
		interMapperReportBaseValidator.clickOnItem(REMOVE_IMDB_BUTTON_XPATH);
						
		// Accept alert
		interMapperReportBaseValidator.acceptAlert();
			
		// Click Remove button		
		interMapperReportBaseValidator.clickOnItem(REMOVE_IMREPORTS_BUTTON_XPATH);
					
		// Accept alert
		interMapperReportBaseValidator.acceptAlert();
		
		// Validate Manage Apps page when all apps are removed		
		appsValidator.validateManageAppsPageAllAppsRemoved();
		
		// Go to home page
		interMapperReportBaseValidator.openHome();
		
		// Validate the links/headers on the page.		
		appsValidator.validateAppsPageAllAppsRemoved();
		
		// Go to Manage Apps page
		interMapperReportBaseValidator.openManageApps();
				
		// Click Install button		
		interMapperReportBaseValidator.clickOnItem(INSTALL_IMREPORTS_BUTTON_XPATH);
		
		// Accept alert
		interMapperReportBaseValidator.acceptAlert();
				
		// Click Install button		
		interMapperReportBaseValidator.clickOnItem(INSTALL_AUTH_BUTTON_XPATH);
											
		// Accept alert
		interMapperReportBaseValidator.acceptAlert();
				
		// Click Install button		
		interMapperReportBaseValidator.clickOnItem(INSTALL_IMDB_BUTTON_XPATH);
											
		// Accept alert
		interMapperReportBaseValidator.acceptAlert();
		
		// Validate the links/headers on the page.		
		appsValidator.validateManageAppsPage();
				
		// Go to home page
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
