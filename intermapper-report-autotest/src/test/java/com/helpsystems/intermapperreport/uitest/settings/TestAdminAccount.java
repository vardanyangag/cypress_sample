package com.helpsystems.intermapperreport.uitest.settings;

import com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants;
import com.helpsystems.intermapperreport.uitest.base.SettingsBaseTest;
import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.*;
import static com.helpsystems.intermapperreport.uitest.utils.LocatorsConstants.*;
import static com.helpsystems.intermapperreport.uitest.utils.UiDataConstants.*;

/**
 * class for testing DataCenter Administrator Account paragraph in the IMDC Settings page
 * 
 * @author Lilit Grigoryan
 * 
 */
public class TestAdminAccount extends SettingsBaseTest {

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
		
		// Validate the links/headers on the paragraph.		
		settingsValidator.validateAdminAccount();	
		
		// Fill the password and confirm password fields with different
		interMapperReportBaseValidator.inputValue(ADMIN_PASSWORD_FIELD_XPATH, TEST_PASSWORD_123);
		interMapperReportBaseValidator.inputValue(ADMIN_CONFIRM_PASSWORD_FIELD_XPATH, TEST_PASSWORD_1234);
		
		// Click on 'Save Changes' button
		interMapperReportBaseValidator.clickOnItem(SAVE_CHANGES_BUTTON_XPATH);
				
		// Validate the alertbox message
		settingsValidator.validateWrongConfirmPasswordMessage();
		
		// Fill the password and confirm password fields with the same value and set non-default username
		interMapperReportBaseValidator.clearField(USERNAME_FIELD_NAME);
		interMapperReportBaseValidator.inputValue(ADMIN_USERNAME_FIELD_XPATH, TEST_USERNAME);
		interMapperReportBaseValidator.inputValue(ADMIN_PASSWORD_FIELD_XPATH, TEST_PASSWORD_123);
		interMapperReportBaseValidator.inputValue(ADMIN_CONFIRM_PASSWORD_FIELD_XPATH, TEST_PASSWORD_123);
		
		// Click on 'Save Changes' button
		interMapperReportBaseValidator.clickOnItem(SAVE_CHANGES_BUTTON_XPATH);
		
		// Validate the alertbox message
		settingsValidator.validateFinishedSavingMessage();
		
		// Log out from reports server
		interMapperReportBaseValidator.logout();
		
		// Log in reports server with non-default credentials
		interMapperReportBaseValidator.login(TEST_USERNAME, TEST_PASSWORD_123);
		
		// Validate login is done with new credentials
		settingsValidator.validateSuccessfullLogin();
	}

	@Override
	public void cleanUp() throws Exception {
		
		// Reverting username and password to default values
		interMapperReportBaseValidator.clearField(USERNAME_FIELD_NAME);
		interMapperReportBaseValidator.inputValue(TEST_USERNAME_FIELD_XPATH, DEFAULT_USERNAME);
		interMapperReportBaseValidator.inputValue(ADMIN_PASSWORD_FIELD_XPATH, DEFAULT_PASSWORD);
		interMapperReportBaseValidator.inputValue(ADMIN_CONFIRM_PASSWORD_FIELD_XPATH, DEFAULT_PASSWORD);
		
		// Click on 'Save Changes' button
		interMapperReportBaseValidator.clickOnItem(SAVE_CHANGES_BUTTON_XPATH);		
		
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
