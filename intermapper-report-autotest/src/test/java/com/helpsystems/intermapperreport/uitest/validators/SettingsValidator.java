package com.helpsystems.intermapperreport.uitest.validators;

import com.helpsystems.common.util.TestUtils;
import static com.helpsystems.intermapperreport.uitest.utils.LocatorsConstants.*;
import static com.helpsystems.intermapperreport.uitest.utils.UiDataConstants.*;

/**
 * class for Settings page validation.
 * 
 * @author Lilit Grigoryan
 * 
 */
public class SettingsValidator extends InterMapperReportBaseValidator {
	/**
	 * @param testUtils
	 */
	public SettingsValidator(TestUtils testUtils) {
		super(testUtils);
	}
	
	
	/**
	 * Method to validate name links/labels of DataCenter Administrator Account paragraph in IMDC Settings page
	 * 
	 */
	public void validateAdminAccount() {
		
		testUtils.getElementByXPath(String.format(SETTINGS_TEXTS_XPATH, INTERMAPPER_DATACENTER_SETTINGS));
		testUtils.getElementByXPath(String.format(SETTINGS_TEXTS_XPATH, DATACENTER_ADMINISTRATOR_ACCOUNT));
		testUtils.getElementByXPath(String.format(SETTINGS_TEXTS_XPATH, IMDC_SETTINGS_WEB_ADMIN_INFO));
		testUtils.getElementByXPath(String.format(SHOW_HELP_XPATH, HELP_LINK, SHOW_HELP));		
		testUtils.getElementByXPath(String.format(ADMIN_USERNAME_XPATH, USERNAME));
		testUtils.getElementByXPath(String.format(ADMIN_PASSWORD_XPATH, PASSWORD));
		testUtils.getElementByXPath(String.format(ADMIN_CONFIRM_PASSWORD_XPATH, CONFIRM_PASSWORD));
		testUtils.getElementByXPath(ADMIN_USERNAME_FIELD_XPATH);
		testUtils.getElementByXPath(ADMIN_PASSWORD_FIELD_XPATH);
		testUtils.getElementByXPath(ADMIN_CONFIRM_PASSWORD_FIELD_XPATH);
		testUtils.getElementByXPath(ALLOW_LOCAL_CHECKBOX_XPATH);
		testUtils.getElementByXPath(ALLOW_LOCAL_XPATH);
	}
	
	/**
	 * Method to validate message thrown when password and confirm password do not match in Admin Account paragraph of IMDC Settings page
	 * 
	 */
	
	public void validateWrongConfirmPasswordMessage() {
		
		testUtils.getElementByXPath(String.format(IMDC_ALERTS_XPATH,PASSWORD_DO_NOT_MATCH));
		

	}
	
	/**
	 * Method to validate message thrown when saving of IMDC Settings finished successfully
	 * 
	 */
	
	public void  validateFinishedSavingMessage() {
		
		testUtils.getElementByXPath(String.format(IMDC_ALERTS_XPATH,FINISHED_SAVING_IMDC_SETTINGS));
		
	}
	

	/**
	 * Method to validate name links/labels of Language paragraph in IMDC Settings page
	 * 
	 */
	
	public void validateLanguage() {
		
		testUtils.getElementByXPath(String.format(SETTINGS_TEXTS_XPATH, LANGUAGE_TITLE));
		testUtils.getElementByXPath(String.format(SETTINGS_TEXTS_XPATH, IMDC_SETTINGS_LANGUAGE_INFO));
		testUtils.getElementByXPath(String.format(LANGUAGE_LABELS_XPATH, LANGUAGE));
		testUtils.getElementByXPath(String.format(SELECTED_LANGUAGE_XPATH, EN, ENGLISH));
		testUtils.getElementByXPath(String.format(LANGUAGE_OPTIONS_XPATH, ES, ESPANOL));
		testUtils.getElementByXPath(String.format(LANGUAGE_OPTIONS_XPATH, JA, JAPANESE));
		testUtils.getElementByXPath(String.format(LANGUAGE_OPTIONS_XPATH, ZH_HANS, CHINESE));
		testUtils.getElementByXPath(OVERRIDE_BROWSER_LANGUAGE_XPATH);
		testUtils.getElementByXPath(OVERRIDE_LANGUAGE_CHECKBOX_LOCATOR);
	}
	
	/**
	 * Method to validate name links/labels of Error Reporting paragraph in IMDC Settings page
	 * 
	 */
	
	public void validateErrorReporting() {
		
		testUtils.getElementByXPath(String.format(SETTINGS_TEXTS_XPATH, ERROR_REPORTING));		
		testUtils.getElementByXPath(String.format(SETTINGS_TEXTS_XPATH, ERROR_REPORTING_INFO));
		testUtils.getElementByXPath(String.format(SETTINGS_TEXTS_XPATH, PRIMARY_SMTP));
		testUtils.getElementByXPath(String.format(SETTINGS_TEXTS_XPATH, BACKUP_SMTP));	
		testUtils.getElementByXPath(PRIMARY_HOST_XPATH);
		testUtils.getElementByXPath(PRIMARY_USERNAME_XPATH);
		testUtils.getElementByXPath(PRIMARY_PASSWORD_XPATH);
		testUtils.getElementByXPath(FROM_ADDRESS_XPATH);	
		testUtils.getElementByXPath(BACKUP_HOST_XPATH);
		testUtils.getElementByXPath(BACKUP_USERNAME_XPATH);
		testUtils.getElementByXPath(BACKUP_PASSWORD_XPATH);		
		testUtils.getElementByXPath(PRIMARY_PORT_XPATH);
		testUtils.getElementByXPath(BACKUP_PORT_XPATH);
		testUtils.getElementByXPath(PRIMARY_PORT_INPUT_XPATH);
		testUtils.getElementByXPath(BACKUP_PORT_INPUT_XPATH);		
		testUtils.getElementByXPath(PRIMARY_HOST_INPUT_XPATH);
		testUtils.getElementByXPath(PRIMARY_USERNAME_INPUT_XPATH);	
		testUtils.getElementByXPath(PRIMARY_PASSWORD_INPUT_XPATH);
		testUtils.getElementByXPath(PRIMARY_FROM_INPUT_XPATH);
		testUtils.getElementByXPath(BACKUP_HOST_INPUT_XPATH);		
		testUtils.getElementByXPath(BACKUP_USERNAME_INPUT_XPATH);
		testUtils.getElementByXPath(BACKUP_PASSWORD_INPUT_XPATH);
		testUtils.getElementByXPath(TEST_ADDRESS_XPATH);
		testUtils.getElementByXPath(TEST_ADDRESS_INPUT_XPATH);
		testUtils.getElementByXPath(SEND_EMAIL_TO_XPATH);
		testUtils.getElementByXPath(SEND_EMAIL_TO_DISABLED_INPUT_SELECTOR);
		testUtils.getElementByXPath(BUG_REPORTS_XPATH);
		
	}
	
	
	/**
	 * Method to validate message thrown when Send Test Email button is clicked with the empty field in Error Reporting paragraph of IMDC Settings page
	 * 
	 */
	
	public void validateWrongMailFormatAlert() {
		
		testUtils.getElementByXPath(String.format(IMDC_ALERTS_XPATH, WRONG_TEST_ADDRESS_ALERT));
			
	}
	

	/**
	 * Method to validate message thrown when Send Test Email button is clicked with the empty field in Error Reporting paragraph of IMDC Settings page
	 * 
	 */
	
	public void validateNoMailServerAlert() {
		
		testUtils.getElementByXPath(String.format(IMDC_ALERTS_XPATH, NO_MAIL_SERVER_SPECIFIED_MESSAGE));
		
	}
	
	/**
	 * Method to validate message thrown when Send Test Email button is clicked with the empty Primary SMTP port field 
	 * 
	 */
	
	public void validatePrimaryPortAlert() {
		
		testUtils.getElementByXPath(String.format(IMDC_ALERTS_XPATH, PRIMARY_SMTP_PORT_ALERT));
		
	}
	
	/**
	 * Method to validate message thrown when Send Test Email button is clicked with the empty Primary SMTP port field 
	 * 
	 */
	
	public void validateBackupPortAlert() {
		
		testUtils.getElementByXPath(String.format(IMDC_ALERTS_XPATH, BACKUP_SMTP_PORT_ALERT));
		
	}
	
	
	/**
	 * Method to validate message thrown when Send Test Email button is clicked with the empty Primary SMTP port field 
	 * 
	 */
	
	public void validateNoFromAddressAlert() {
		
		testUtils.getElementByXPath(String.format(IMDC_ALERTS_XPATH, NO_FROM_ADDRESS_ALERT));
		
	}
	
	
	
	/**
	 * Method to validate name links/labels of Connections paragraph in IMDC Settings page
	 * 
	 */
	
	public void validateConnectionsDefault() {
		
		testUtils.getElementByXPath(String.format(SETTINGS_TEXTS_XPATH, CONNECTIONS));		
		testUtils.getElementByXPath(String.format(SHOW_HELP_XPATH, HELP_LINK, SHOW_HELP));	
		testUtils.getElementByXPath(String.format(SETTINGS_TEXTS_XPATH, CONNECTIONS_INFO));
		testUtils.getElementByXPath(LISTEN_PORT_SELECTOR);
		testUtils.getElementByXPath(LISTEN_PORT_INPUT_SELECTOR);
		testUtils.getElementByXPath(AUTO_CERT_ENABLED_RADIO);
		testUtils.getElementByXPath(GEN_CERT_BUTTON_SELECTOR);
		testUtils.getElementByXPath(GEN_CERT_BUTTON);		
		testUtils.getElementByXPath(CUSTOM_CERT_DISABLED_RADIO);
		testUtils.getElementByXPath(CUSTOM_CERT_SELECTOR);
		testUtils.getElementByXPath(SSL_PRIVATE_KEY_SELECTOR);
		testUtils.getElementByXPath(SSL_KEY_INPUT_SELECTOR);
		testUtils.getElementByXPath(SSL_CERT_SELECTOR);
		testUtils.getElementByXPath(SSL_CERT_INPUT_SELECTOR);
				
	}
	
	/**
	 * Method to validate message thrown when Generate a new certificate button is clicked
	 * 
	 */
	
	public void validateNewCertCreatedAlert() {
		
		testUtils.getElementByXPath(String.format(IMDC_ALERTS_XPATH, NEW_CERT_CREATED_ALERT));
		testUtils.getElementByXPath(IMDC_ALERTS_RESTART_NOW_SELCTOR);
		
	}
	
	/**
	 * Method to validate message thrown when 'Use a custom certificate' option selected
	 * 
	 */
	
	public void validateProvideCertAlert() {
		
		testUtils.getElementByXPath(IMDC_CERT_ALERT_XPATH);
		
	}
	
	/**
	 * Method to validate name links/labels of Connections paragraph in IMDC Settings page
	 * 
	 */
	
	public void validateConnections() {
		
		
		testUtils.getElementByXPath(AUTO_CERT_DISABLED_RADIO);			
		testUtils.getElementByXPath(CUSTOM_CERT_ENABLED_RADIO);			
		testUtils.getElementByXPath(SSL_KEY_INPUT_SELECTOR);
		testUtils.getElementByXPath(SSL_CERT_INPUT_SELECTOR);
				
	}
	
	/**
	 * Method to validate login was done successfully
	 * @throws InterruptedException 
	 * 
	 */
	
	public void validateSuccessfullLogin() throws InterruptedException {
		//testUtils.waitBySelector(HOME_LINK_XPATH);
		//testUtils.waitBySelector(ADMIN_PASSWORD_FIELD_XPATH);
		testUtils.waitForInputByName("password");
		
	}
	
	/**
	 * Method to validate alert message thrown when IMDC restart complete
	 * 
	 */
	
	public void validateRestartCompleteAlert() {
		
		testUtils.getElementByXPath(RESTART_COMPLETED_ALERT_XPATH);
		
	}
	
	
	}
	
