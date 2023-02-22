package com.helpsystems.intermapperreport.uitest.validators;

import static com.helpsystems.intermapperreport.uitest.utils.LocatorsConstants.*;
import static com.helpsystems.intermapperreport.uitest.utils.UiDataConstants.*;
import com.helpsystems.common.util.TestUtils;

/**
 * the class includes methods for Intermapper Database package.
 * 
 * @author Armen Torunyan
 * 
 */

public class IntermapperDatabaseValidator extends InterMapperReportBaseValidator {
	/**
	 * 
	 * @param testUtils
	 */
	public IntermapperDatabaseValidator(TestUtils testUtils) {
		super(testUtils);
	}

	/**
	 * A method to click on More Details button to open the table
	 * 
	 * @throws InterruptedException
	 */

	public void clickOnMoreDetailsButton() throws InterruptedException {
		testUtils.waitByXpath(HOME_MORE_DETAILS_XPATH);
		testUtils.getElementByXPath(HOME_MORE_DETAILS_XPATH).click();
	}

	/**
	 * A method to validate the More Details Table items
	 * 
	 * @throws InterruptedException
	 */

	public void validateMoreDetailsItems() throws InterruptedException {
		testUtils.waitByXpath(HOME_MORE_DETAILS_NAME_XPATH);
		testUtils.waitByXpath(HOME_MORE_DETAILS_ID_XPATH);
		testUtils.waitByXpath(HOME_MORE_DETAILS_SERVER_EXPORT_STATUS_XPATH);
		testUtils.waitByXpath(HOME_MORE_DETAILS_SERVER_EXPORT_STATUS_CONTENT_XPATH);
	}

	/**
	 * A method to click on imdc.log text-link to download the file
	 * 
	 * @throws InterruptedException
	 */

	public void clickOnIMDCLogTextlink() throws InterruptedException {
		testUtils.getElementByXPath(IMDC_LOG_FILE_XPATH).click();
	}

	/**
	 * A method to validate Log page items
	 * 
	 * @throws InterruptedException
	 */

	public void validateLogPageItems() throws InterruptedException {
		testUtils.getElementByXPath(IMDC_LOG_FILE_XPATH);
		testUtils.getElementByXPath(CLICK_TO_DOWNLOAD_THE_FULL_LOG_XPATH);
		testUtils.getElementByXPath(LOG_LEVEL_FOOTER_XPATH);
		testUtils.getElementByXPath(REFRESH_SECONDS_FOOTER_XPATH);
		testUtils.getElementByXPath(LINES_FOOTER_XPATH);
		testUtils.getElementByXPath(SAVE_BUTTON_FOOTER_XPATH);
	}

	/**
	 * A method to click on View the log text-link to go to the View The log page
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnViewTheLogButton() throws InterruptedException {
		testUtils.waitByXpath(VIEW_THE_LOG_TEXT_LINK_XPATH, 10);
		testUtils.getElementByXPath(VIEW_THE_LOG_TEXT_LINK_XPATH).click();
	}

	/**
	 * A method to click on Home button to go to the Home page
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnHomeButton() throws InterruptedException {
		testUtils.getElementByXPath(HOME_LINK_XPATH).click();
	}

	/**
	 * A method to click on imdatabase.log ink to download the file
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnImdatabaseLogTextlink() throws InterruptedException {
		testUtils.getElementByXPath(VIEW_THE_LOG_TEXT_LINK_XPATH).click();
	}

	/**
	 * A method to click on Log Level dropdown
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnLogLevelDropdown() throws InterruptedException {
		testUtils.getElementByXPath(LOG_LEVEL_DROPDOWN_XPATH).click();
	}

	/**
	 * A method to validate Log page items
	 * 
	 * @throws InterruptedException
	 */
	
	public void validateViewLogPageItems() throws InterruptedException {
		testUtils.getElementByXPath(IMDATABASE_LOG_XPATH);
		testUtils.getElementByXPath(CLICK_TO_DOWNLOAD_THE_FULL_LOG_XPATH);
		testUtils.getElementByXPath(LOG_LEVEL__XPATH);
		testUtils.getElementByXPath(REFRESH_SECONDS_XPATH);
		testUtils.getElementByXPath(LINES_XPATH);
		testUtils.getElementByXPath(SAVE_BUTTON_XPATH);
	}

	/**
	 * A method to click on Overview button
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnOverviewButton() throws InterruptedException {
		testUtils.waitByXpath(OVERVIEW_BUTTON_XPATH, 10);
		testUtils.getElementByXPath(OVERVIEW_BUTTON_XPATH).click();
	}

	/**
	 * A method to validate Overview page items
	 * 
	 * @throws InterruptedException
	 */
	
	public void validateOverviewPageItems() throws InterruptedException {
		testUtils.getElementByXPath(DATABASE_OVERVIEW_HEADER_XPATH);
		testUtils.getElementByXPath(DATABASE_OVERVIEW_PARAGRAPH_XPATH);
		testUtils.getElementByXPath(ESTIMATED_FUTURE_DISK_USAGE_XPATH);
		testUtils.getElementByXPath(MAPS_XPATH);
		testUtils.getElementByXPath(DEVICES_XPATH);
		testUtils.getElementByXPath(INTERFACES_XPATH);
		testUtils.getElementByXPath(DATASETS_XPATH);
		testUtils.getElementByXPath(DATAPOINTS_XPATH);
		testUtils.getElementByXPath(FIVE_MINUTE_DATA_SAMPLES_XPATH);
		testUtils.getElementByXPath(HOURLY_DATA_SAMPLES_XPATH);
		testUtils.getElementByXPath(DAYLY_DATA_SAMPLES_XPATH);
		testUtils.getElementByXPath(EVENTS_XPATH);
		testUtils.getElementByXPath(NOTIFICATIONS_XPATH);
		testUtils.getElementByXPath(ACHKNOWLEDGMENTS_XPATH);
		testUtils.getElementByXPath(CURRENT_ROW_COUNTS_FOOTER_XPATH);
	}

	/**
	 * A method to click on Maintenance text-link
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnMaintenanceButton() throws InterruptedException {
		testUtils.waitByXpath(MAINTENANCE_LINK_XPATH, 10);
		testUtils.getElementByXPath(MAINTENANCE_LINK_XPATH).click();
	}

	/**
	 * A method to validate Maintenance page items
	 * 
	 * @throws InterruptedException
	 */
	
	public void validateMaintenancePageItems() throws InterruptedException {
		testUtils.getElementByXPath(MAINTENANCE_TASKS_HEADER_XPATH);
		testUtils.getElementByXPath(MAINTENANCE_TASKS_PARAGRAPH_XPATH);
		testUtils.getElementByXPath(PAUSE_OPERATIONS_XPATH);
		testUtils.getElementByXPath(FOR_XPATH);
		testUtils.getElementByXPath(PAUSE_OPERATIONS_INPUT_FIELD_DEFAULT_XPATH);
		testUtils.getElementByXPath(PAUSE_OPERATIONS_DROPDOWN_XPATH);
		testUtils.getElementByXPath(HOURS_PAUSE_OPERATIONS_XPATH);
		testUtils.getElementByXPath(DAYS_PAUSE_OPERATIONS_XPATH);
		testUtils.getElementByXPath(INDEFINITELY_PAUSE_OPERATIONS_XPATH);
		testUtils.getElementByXPath(RECLAIMING_DISK_SPACE_XPATH);
		testUtils.getElementByXPath(RECLAIMING_DISK_SPACE_PARAGRAPH_XPATH);
		testUtils.getElementByXPath(MAINTENANCE_ESTIMATED_FUTURE_DISK_XPATH);
		testUtils.getElementByXPath(DATA_TO_DELETE_XPATH);
		testUtils.getElementByXPath(DATA_TO_DELETE_DROPDOWN_XPATH);
		testUtils.getElementByXPath(RAW_DATA_DATA_TO_DELETE_DROPDOWN_XPATH);
		testUtils.getElementByXPath(FIVE_MINUTE_DATA_TO_DELETE_DROPDOWN_XPATH);
		testUtils.getElementByXPath(EVENTS_DATA_TO_DELETE_DROPDOWN_XPATH);
		testUtils.getElementByXPath(DATA_FROM_DELETED_DATA_TO_DELETE_DROPDOWN_XPATH);
		testUtils.getElementByXPath(OLDER_THAN_XPATH);
		testUtils.getElementByXPath(OLDER_THAN_INPUT_FIELD_DEFAULT_XPATH);
		testUtils.getElementByXPath(OLDER_THAN_DROPDOWN_XPATH);
		testUtils.getElementByXPath(DAYS_OLDER_THAN_DROPDOWN_XPATH);
		testUtils.getElementByXPath(MONTHS_OLDER_THAN_DROPDOWN_XPATH);
		testUtils.getElementByXPath(YEARS_OLDER_THAN_DROPDOWN_XPATH);
		testUtils.getElementByXPath(DELETE_BUTTON_XPATH);
		testUtils.getElementByXPath(RETENTION_POLICIES_PARAGRAPH_XPATH);
		testUtils.getElementByXPath(APPLY_RETENTION_POLICIES_BUTTON_XPATH);
		testUtils.getElementByXPath(RECLAIM_DISC_SPACE_BUTTON_XPATH);
	}
	
	/**
	 * A method to click on Change settings text-link
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnChangeSettingsButton() throws InterruptedException {
		testUtils.waitByXpath(CHANGE_SETTINGS_LINK_XPATH, 10);
		testUtils.getElementByXPath(CHANGE_SETTINGS_LINK_XPATH).click();
	}
	
	/**
	 * A method to click on show help text-link
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnShowHelpButton() throws InterruptedException {
		testUtils.getElementById(INTERNAL_DATABASE_SHOW_HIDE_HELP).click();
	}
	
	/**
	 * A method to click on hide help text-link
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnHideHelpButton() throws InterruptedException {
		testUtils.getElementById(INTERNAL_DATABASE_SHOW_HIDE_HELP).click();
	}
	
	/**
	 * A method to validate Change Settings page items
	 * 
	 * @throws InterruptedException
	 */
	
	public void validateChangeSettingsPageItems() throws InterruptedException {
		testUtils.getElementByXPath(DATABASE_TYPE_DROPDOWN_XPATH);
		testUtils.getElementByXPath(BUILT_IN_DATABASE_TYPE_XPATH);
		testUtils.getElementByXPath(POSTGRE_SQL_DATABASE_TYPE_XPATH);
		testUtils.getElementByXPath(INTERNAL_DATABASE_USERS_XPATH);
		testUtils.getElementByXPath(CREATE_BOLD_XPATH);
		testUtils.getElementByXPath(DELETE_BOLD_XPATH);
		testUtils.getElementByXPath(USER_LIST_XPATH);
		testUtils.getElementByXPath(SETTINGS_CREATE_BUTTON_XPATH);
		testUtils.getElementByXPath(SETTINGS_DELETE_BUTTON_XPATH);
		testUtils.getElementByXPath(SETTINGS_USERNAME_XPATH);
		testUtils.getElementByXPath(SETTINGS_PASSWORD_XPATH);
		testUtils.getElementByXPath(RE_ENTER_PASSWORD_XPATH);
		testUtils.getElementByXPath(WRITE_ACCESS_XPATH);
		testUtils.getElementByXPath(REMOTE_LOGIN_XPATH);
		testUtils.getElementByXPath(SETTINGS_USERNAME_FIELD_XPATH);
		testUtils.getElementByXPath(SETTINGS_PASSWORD_FIELD_XPATH);
		testUtils.getElementByXPath(RE_ENTER_PASSWORD_FIELD_XPATH);
		testUtils.getElementByXPath(WRITE_ACCESS_FIELD_XPATH);
		testUtils.getElementByXPath(REMOTE_LOGIN_FIELD_XPATH);
		testUtils.getElementByXPath(SETTINGS_SAVE_BUTTON_XPATH);
	}
	
	/**
	 * A method to validate Change Settings page's show help items
	 * 
	 * @throws InterruptedException
	 */
	
	public void validateChangeSettingsShowHelpItems() throws InterruptedException {
		testUtils.getElementByXPath(CREATE_BOLD_XPATH);
		testUtils.getElementByXPath(CREATE_PARAGRAPH_XPATH);
		testUtils.getElementByXPath(DELETE_BOLD_XPATH);
		testUtils.getElementByXPath(DELETE_PARAGRAPH_XPATH);
		testUtils.getElementByXPath(USERNAME_BOLD_XPATH);
		testUtils.getElementByXPath(USERNAME_PARAGRAPH_XPATH);
		testUtils.getElementByXPath(PASSWORD_BOLD_XPATH);
		testUtils.getElementByXPath(PASSWORD_PARAGRAPH_XPATH);
		testUtils.getElementByXPath(WRITE_ACCESS_BOLD_XPATH);
		testUtils.getElementByXPath(WRITE_ACCESS_PARAGRAPH_XPATH);
		testUtils.getElementByXPath(REMOTE_LOGIN_BOLD_XPATH);
		testUtils.getElementByXPath(REMOTE_LOGIN_PARAGRAPH_XPATH);
		testUtils.getElementByXPath(INTERNAL_DATABASE_HIDE_HELP_XPATH);
	}

}
