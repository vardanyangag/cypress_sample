package com.helpsystems.intermapperreport.uitest.settings;

import com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants;
import com.helpsystems.intermapperreport.uitest.base.SettingsBaseTest;
import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.*;
import static com.helpsystems.intermapperreport.uitest.utils.LocatorsConstants.*;


/**
 * class for testing Connections paragraph in IMDC Settings page
 * 
 * @author Lilit Grigoryan
 * 
 */
public class TestConnections extends SettingsBaseTest {

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
		
		// Validate the links/headers on the page		
		settingsValidator.validateConnectionsDefault();	
	
		//Click on 'Generate a new Certificate' button
		interMapperReportBaseValidator.clickOnItem(GEN_CERT_BUTTON);
				
		// Validate alert message
		settingsValidator.validateNewCertCreatedAlert();
			
		// Click on 'Generate a new Certificate' button
		interMapperReportBaseValidator.clickOnItem(CUSTOM_CERT_DISABLED_RADIO);
		
		// Save changes
		interMapperReportBaseValidator.clickOnItem(SAVE_CHANGES_BUTTON_XPATH);
		
		// Validate alert message
		settingsValidator.validateProvideCertAlert();
		
		// Validate the links/headers on the page	
		settingsValidator.validateConnections();
		
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
