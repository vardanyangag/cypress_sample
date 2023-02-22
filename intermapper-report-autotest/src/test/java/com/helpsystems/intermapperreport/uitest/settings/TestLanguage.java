package com.helpsystems.intermapperreport.uitest.settings;

import com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants;
import com.helpsystems.intermapperreport.uitest.base.SettingsBaseTest;
import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.*;

/**
 * class for testing Language paragraph in IMDC Settings page
 * 
 * @author Lilit Grigoryan
 * 
 */
public class TestLanguage extends SettingsBaseTest {

	@Override
	public void init() throws Exception {
		
		// login to IM Reports Server		
		interMapperReportBaseValidator.login(DEFAULT_USERNAME, DEFAULT_PASSWORD);
	}

	@Override
	public void testBody() throws Exception {
		interMapperReportBaseValidator.openSettings();
	}

	@Override
	public void validation() throws Exception {
		
		// Validate the links/headers on the page.		
		settingsValidator.validateLanguage();	
		
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
