package com.helpsystems.intermapperreport.uitest.settings;

import com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants;
import com.helpsystems.intermapperreport.uitest.base.SettingsBaseTest;
import static com.helpsystems.intermapperreport.uitest.utils.UiDataConstants.*;
import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.*;
import static com.helpsystems.intermapperreport.uitest.utils.LocatorsConstants.*;

/**
 * class for testing Error Reporting paragraph in IMDC Settings page
 * 
 * @author Lilit Grigoryan
 * 
 */
public class TestErrorReporting extends SettingsBaseTest {

	@Override
	public void init() throws Exception {
		
		// Login to IM Reports Server		
		interMapperReportBaseValidator.login(DEFAULT_USERNAME, DEFAULT_PASSWORD);
	}

	@Override
	public void testBody() throws Exception {
		
		// Go to Settings page
		interMapperReportBaseValidator.openSettings();
	}

	@Override
	public void validation() throws Exception {
		
		//Validate the links/headers on the page.		
		settingsValidator.validateErrorReporting();	
		
		//Click on 'Send Test E-mail' button
		interMapperReportBaseValidator.clickOnItem(SEND_TEST_EMAIL_XPATH);
		
		//Validate alert
		settingsValidator.validateWrongMailFormatAlert();
		
		//Input value to the field
		interMapperReportBaseValidator.inputValue(TEST_ADDRESS_INPUT_XPATH, TEST_EMAIL_WRONG_FORMAT);
			
		//Click on 'Send Test E-mail' button
		interMapperReportBaseValidator.clickOnItem(SEND_TEST_EMAIL_XPATH);
				
		//Validate alert	
		settingsValidator.validateWrongMailFormatAlert();
				
		//Clear fields
		interMapperReportBaseValidator.clearField(SMTP_TESTMAIL);
		
		interMapperReportBaseValidator.clickOnItem(SAVE_CHANGES_BUTTON_XPATH);
		
		//Input value to the field
		interMapperReportBaseValidator.inputValue(TEST_ADDRESS_INPUT_XPATH, TEST_EMAIL_CORRECT_FORMAT);
							
		//Click on 'Send Test E-mail' button
		interMapperReportBaseValidator.clickOnItem(SEND_TEST_EMAIL_XPATH);
											
		//Validate alert		
		settingsValidator.validateNoMailServerAlert();
				

		interMapperReportBaseValidator.clearField(SMTP_PPORT);		
		interMapperReportBaseValidator.clickOnItem(SEND_TEST_EMAIL_XPATH);
		
		//Validate alert
		settingsValidator.validatePrimaryPortAlert();
		
		//Input value to the field
		interMapperReportBaseValidator.inputValue(String.format(INPUT_FIELD_XPATH, SMTP_PPORT), DEFAULT_SMTP_PORT);
		
		interMapperReportBaseValidator.clearField(SMTP_SPORT);
		interMapperReportBaseValidator.clickOnItem(SAVE_CHANGES_BUTTON_XPATH);
		interMapperReportBaseValidator.clickOnItem(SEND_TEST_EMAIL_XPATH);
				
		//Validate alert		
		settingsValidator.validateBackupPortAlert();
		
		//Input value to the field
		interMapperReportBaseValidator.inputValue(String.format(INPUT_FIELD_XPATH, SMTP_SPORT), DEFAULT_SMTP_PORT);
		interMapperReportBaseValidator.clickOnItem(SAVE_CHANGES_BUTTON_XPATH);
		
		//Input value to the field
		interMapperReportBaseValidator.inputValue(PRIMARY_HOST_INPUT_XPATH, SMTP_HOST);
		
		//Click on 'Send Test E-mail' button
		interMapperReportBaseValidator.clickOnItem(SEND_TEST_EMAIL_XPATH);
		
		//Validate alert	
		settingsValidator.validateNoFromAddressAlert();
		
		//
		interMapperReportBaseValidator.clickOnItem(ON_ERRORS_CHECKBOX_XPATH);
		testUtils.getElementByXPath(SEND_EMAIL_TO_ENABLED_INPUT_SELECTOR);
		

	}

	@Override
	public void cleanUp() throws Exception {
		
		
		//Turn fields to defaults
		interMapperReportBaseValidator.clearField(SMTP_PHOST);
		interMapperReportBaseValidator.clearField(SMTP_TESTMAIL);
		interMapperReportBaseValidator.clearField(SMTP_FADDRESS);
		interMapperReportBaseValidator.clickOnItem(SAVE_CHANGES_BUTTON_XPATH);
				
		//Go  to home page
		interMapperReportBaseValidator.openHome();
		
		// Log out from the server
		interMapperReportBaseValidator.logout();
		
		
		
	}

	@Override
	public String getOwner() {
		return InterMapperReportConstants.LILIT;
	}
}
