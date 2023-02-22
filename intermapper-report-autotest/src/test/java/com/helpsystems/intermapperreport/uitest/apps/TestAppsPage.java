package com.helpsystems.intermapperreport.uitest.apps;

import com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants;
import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.*;
import com.helpsystems.intermapperreport.uitest.base.AppsBaseTest;
import static com.helpsystems.intermapperreport.uitest.utils.UiDataConstants.*;
import static com.helpsystems.intermapperreport.uitest.utils.LocatorsConstants.*;
/**
 * class for testing Apps page
 * 
 * @author Anzhela Sarukhanyan
 * 
 */
public class TestAppsPage extends AppsBaseTest {

	@Override
	public void init() throws Exception {
		interMapperReportBaseValidator.login(DEFAULT_USERNAME, DEFAULT_PASSWORD);
	}

	@Override
	public void testBody() throws Exception {
	}

	@Override
	public void validation() throws Exception {
		
		// Validate the links/headers on the page.
		appsValidator.validateAppsPage();
		
		// Stop IM database
		interMapperReportBaseValidator.clickOnItem(String.format(IMDB_STOP_START_BUTTON_XPATH, STOP));
				
		// Validate the links/headers on the page.
		appsValidator.validateAppsPageStopped();
		
	}

	@Override
	public void cleanUp() throws Exception {
		
		// Start IM database
		interMapperReportBaseValidator.clickOnItem(String.format(IMDB_STOP_START_BUTTON_XPATH, START));
		
		// Log out from the server
		interMapperReportBaseValidator.logout();
	}

	@Override
	public String getOwner() {
		return InterMapperReportConstants.ANZHELA;
	}
}
