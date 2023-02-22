package com.helpsystems.intermapperreport.uitest.apps;

import com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants;
import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.*;
import com.helpsystems.intermapperreport.uitest.base.AppsBaseTest;


/**
 * class for testing Manage Apps page content
 * 
 * @author Lilit Grigoryan
 * 
 */
public class TestManageApps extends AppsBaseTest {

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
