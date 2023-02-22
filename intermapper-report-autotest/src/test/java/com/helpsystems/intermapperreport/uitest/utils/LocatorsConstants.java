package com.helpsystems.intermapperreport.uitest.utils;

import static com.helpsystems.intermapperreport.uitest.utils.UiDataConstants.*;
import static com.helpsystems.common.util.Constants.*;
import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.*;

public final class LocatorsConstants {

	private LocatorsConstants() {
    }
	
	// ################################ GENERAL #################################
	public static final String USERNAME_XPATH = "//input[@name='username']";
	public static final String PASSWORD_XPATH = "//input[@name='password']";
	public static final String LOGIN_BUTTON_SELECTOR = "//button[@id='defaultEnterButton']";
	public static final String HOME_LINK_XPATH = "//li/a[text()='"+HOME_TAB_NAME+"']";
	public static final String HOME_LOG_TAB_XPATH = "//li/a[text()='"+HOME_LOG_TAB_NAME+"']";
	public static final String HOME_MORE_DETAILS_XPATH = "//div/a[text()='"+HOME_MORE_DETAILS+"']";
	public static final String HOME_MORE_DETAILS_NAME_XPATH = "//tr/td[text()='"+HOME_MORE_DETAILS_NAME+"']";
	public static final String HOME_MORE_DETAILS_ID_XPATH = "//tr/td[text()='"+HOME_MORE_DETAILS_ID+"']";
	public static final String HOME_MORE_DETAILS_SERVER_EXPORT_STATUS_XPATH = "//tr/td[text()='"+HOME_MORE_DETAILS_SERVER_EXPORT_STATUS+"']";
	public static final String HOME_MORE_DETAILS_SERVER_EXPORT_STATUS_CONTENT_XPATH = "//tr/td[contains(text(),'"+HOME_MORE_DETAILS_SERVER_EXPORT_STATUS_CONTENT+"')]";
	public static final String HOME_LOG_OUT_XPATH = "//a/b[text()='"+HOME_LOG_OUT+"']";	
	public static final String REPORT_A_BUG_XPATH = "//a[text()='"+REPORT_A_BUG_TEXT+"']";
	public static final String REPORT_A_BUG_PAGE_TITLE_XPATH = "//div[text()='"+REPORT_A_BUG_TEXT+"']";
	public static final String REPORT_A_BUG_INSTRUCTIONS_XPATH = "//div[@class= 'instructions']";
	public static final String REPORT_A_BUG_CONTACT_INFORMATION_TITLE_XPATH = "//div[text()='"+CONTACT_INFORMATION_TITLE_TEXT+"']";
	public static final String REPORT_A_BUG_NAME_FIELD_TITLE_XPATH = "//span[text()='"+NAME_TEXT+"']";
	public static final String REPORT_A_BUG_PHONE_FIELD_TITLE_XPATH = "//span[text()='"+PHONE_TEXT+"']";
	public static final String REPORT_A_BUG_E_MAIL_FIELD_TITLE_XPATH = "//span[text()='"+E_MAIL_TEXT+"']";
	public static final String REPORT_A_BUG_SUBJECT_FIELD_TITLE_XPATH = "//span[text()='"+SUBJECT_TEXT+"']";
	public static final String REPORT_A_BUG_NAME_INPUT_FIELD_XPATH = "//input[@name='name']";
	public static final String REPORT_A_BUG_PHONE_INPUT_FIELD_XPATH = "//input[@name='phone']";
	public static final String REPORT_A_BUG_E_MAIL_INPUT_FIELD_XPATH = "//input[@name='email']";
	public static final String REPORT_A_BUG_SUBJECT_INPUT_FIELD_XPATH = "//input[@name='subject']";
	public static final String REPORT_A_BUG_WHAT_HAPPENED_FIELD_TITLE_XPATH = "//div[text()='"+WHAT_HAPPENED_TEXT+"']";
	public static final String REPORT_A_BUG_WHAT_HAPPENED_INPUT_FIELD_XPATH = "//textarea[@name= 'problem']";
	
	// ################################ VIEW THE LOG #################################
	public static final String VIEW_THE_LOG_TEXT_LINK_XPATH = "//div/a[text()='"+VIEW_THE_LOG_TEXT_LINK+"']";
	public static final String IMDATABASE_LOG_XPATH = "//b/a[text()='"+IMDATABASE_LOG+"']";
	public static final String CLICK_TO_DOWNLOAD_THE_FULL_LOG_XPATH = "//div/b[contains(text(),'"+CLICK_TO_DOWNLOAD_THE_FULL_LOG+"')]";
	public static final String LOG_LEVEL__XPATH = "//span/span[text()='"+LOG_LEVEL_FOOTER+"']";
	public static final String REFRESH_SECONDS_XPATH = "//span/span[text()='"+REFRESH_SECONDS_FOOTER+"']";
	public static final String LINES_XPATH = "//span/span[text()='"+LINES_FOOTER+"']";
	public static final String SAVE_BUTTON_XPATH = "//button/span[text()='"+SAVE_BUTTON_FOOTER+"']";
	
	// ################################ OVERVIEW #################################
	public static final String OVERVIEW_BUTTON_XPATH = "//div/a[text()='"+OVERVIEW_BUTTON+"']";
	public static final String DATABASE_OVERVIEW_HEADER_XPATH = "//div/div[text()='"+DATABASE_OVERVIEW_HEADER+"']";
	public static final String DATABASE_OVERVIEW_PARAGRAPH_XPATH = "//div/div[text()='"+DATABASE_OVERVIEW_PARAGRAPH+"']";
	public static final String ESTIMATED_FUTURE_DISK_USAGE_XPATH = "//div/div[text()='"+ESTIMATED_FUTURE_DISK_USAGE+"']";
	public static final String CURRENT_ROW_COUNTS_XPATH = "//div/div[text()='"+CURRENT_ROW_COUNTS+"']";
	public static final String MAPS_XPATH = "//tr/td[text()='"+MAPS+"']";
	public static final String DEVICES_XPATH = "//tr/td[text()='"+DEVICES+"']";
	public static final String INTERFACES_XPATH = "//tr/td[text()='"+INTERFACES+"']";
	public static final String DATASETS_XPATH = "//tr/td[text()='"+DATASETS+"']";
	public static final String DATAPOINTS_XPATH = "//tr/td[text()='"+DATAPOINTS+"']";
	public static final String FIVE_MINUTE_DATA_SAMPLES_XPATH = "//tr/td[text()='"+FIVE_MINUTE_DATA_SAMPLES+"']";
	public static final String HOURLY_DATA_SAMPLES_XPATH = "//tr/td[text()='"+HOURLY_DATA_SAMPLES+"']";
	public static final String DAYLY_DATA_SAMPLES_XPATH = "//tr/td[text()='"+DAYLY_DATA_SAMPLES+"']";
	public static final String EVENTS_XPATH = "//tr/td[text()='"+EVENTS+"']";
	public static final String NOTIFICATIONS_XPATH = "//tr/td[text()='"+NOTIFICATIONS+"']";
	public static final String ACHKNOWLEDGMENTS_XPATH = "//tr/td[text()='"+ACHKNOWLEDGMENTS+"']";
	public static final String CURRENT_ROW_COUNTS_FOOTER_XPATH = "//table/caption[text()='"+CURRENT_ROW_COUNTS_FOOTER+"']";
	
	//################################ MAINTENANCE #################################
	public static final String MAINTENANCE_LINK_XPATH = "//div/a[text()='"+MAINTENANCE_LINK+"']";
	public static final String MAINTENANCE_TASKS_HEADER_XPATH = "//div[text()='"+MAINTENANCE_TASKS_HEADER+"']";
	public static final String MAINTENANCE_TASKS_PARAGRAPH_XPATH = "//form/div[text()='"+MAINTENANCE_TASKS_PARAGRAPH+"']";
	public static final String PAUSE_OPERATIONS_XPATH = "//button/span[text()='"+PAUSE_OPERATIONS+"']";
	public static final String RESUME_OPERATIONS_XPATH = "//button/span[text()='"+RESUME_OPERATIONS+"']";
	public static final String FOR_XPATH = "//div/span[text()='"+FOR+"']";
	public static final String PAUSE_OPERATIONS_INPUT_FIELD_DEFAULT_XPATH = "//input[@name='pauseDuration' and @value='2']";
	public static final String PAUSE_OPERATIONS_INPUT_FIELD_XPATH = "//input[@name='pauseDuration' and @value='%s']";
	public static final String PAUSE_OPERATIONS_DROPDOWN_XPATH = "//select[@name='pauseType']";
	public static final String HOURS_PAUSE_OPERATIONS_XPATH = "//option[@value='hours' and text()='"+HOURS_PAUSE_OPERATIONS+"']";
	public static final String DAYS_PAUSE_OPERATIONS_XPATH = "//option[@value='days' and text()='"+DAYS_PAUSE_OPERATIONS+"']";
	public static final String INDEFINITELY_PAUSE_OPERATIONS_XPATH = "//option[@value='indefinitely' and text()='"+INDEFINITELY_PAUSE_OPERATIONS+"']";
	public static final String RECLAIMING_DISK_SPACE_XPATH = "//form/div[text()='"+RECLAIMING_DISK_SPACE+"']";
	public static final String RECLAIMING_DISK_SPACE_PARAGRAPH_XPATH = "//form/div[contains(text(),'"+RECLAIMING_DISK_SPACE_PARAGRAPH+"')]";
	public static final String MAINTENANCE_ESTIMATED_FUTURE_DISK_XPATH = "//div[text()='"+MAINTENANCE_ESTIMATED_FUTURE_DISK+"']";
	public static final String DATA_TO_DELETE_XPATH = "//div/span[text()='"+DATA_TO_DELETE+"']";
	public static final String DATA_TO_DELETE_DROPDOWN_XPATH = "//select[@name='deleteType']";
	public static final String RAW_DATA_DATA_TO_DELETE_DROPDOWN_XPATH = "//option[@value='data' and text()='"+RAW_DATA_DATA_TO_DELETE_DROPDOWN+"']";
	public static final String FIVE_MINUTE_DATA_TO_DELETE_DROPDOWN_XPATH = "//option[@value='samples' and text()='"+FIVE_MINUTE_DATA_TO_DELETE_DROPDOWN+"']";
	public static final String EVENTS_DATA_TO_DELETE_DROPDOWN_XPATH = "//option[@value='events' and text()='"+EVENTS_DATA_TO_DELETE_DROPDOWN+"']";
	public static final String DATA_FROM_DELETED_DATA_TO_DELETE_DROPDOWN_XPATH = "//option[@value='deleted' and text()='"+DATA_FROM_DELETED_DATA_TO_DELETE_DROPDOWN+"']";
	public static final String OLDER_THAN_XPATH = "//div/span[text()='"+OLDER_THAN+"']";
	public static final String OLDER_THAN_INPUT_FIELD_DEFAULT_XPATH = "//input[@name='deleteAmount']";
	public static final String OLDER_THAN_INPUT_FIELD_XPATH = "//input[@name='deleteAmount' and @value='%s']";
	public static final String OLDER_THAN_DROPDOWN_XPATH = "//select[@name='deleteType']";
	public static final String DAYS_OLDER_THAN_DROPDOWN_XPATH = "//option[@value='days' and text()='"+DAYS_OLDER_THAN_DROPDOWN+"']";
	public static final String MONTHS_OLDER_THAN_DROPDOWN_XPATH = "//option[@value='months' and text()='"+MONTHS_OLDER_THAN_DROPDOWN+"']";
	public static final String YEARS_OLDER_THAN_DROPDOWN_XPATH = "//option[@value='years' and text()='"+YEARS_OLDER_THAN_DROPDOWN+"']";
	public static final String DELETE_BUTTON_XPATH = "//button/span[text()='"+DELETE_BUTTON+"']";
	public static final String RETENTION_POLICIES_PARAGRAPH_XPATH = "//form/div[text()='"+RETENTION_POLICIES_PARAGRAPH+"']";
	public static final String APPLY_RETENTION_POLICIES_BUTTON_XPATH = "//button/span[text()='"+APPLY_RETENTION_POLICIES_BUTTON+"']";
	public static final String RECLAIM_DISC_SPACE_BUTTON_XPATH = "//button/span[text()='"+RECLAIM_DISC_SPACE_BUTTON+"']";
	
	//################################ CHANGE SETTINGS #################################
	public static final String CHANGE_SETTINGS_LINK_XPATH = "//div/a[text()='"+CHANGE_SETTINGS_LINK+"']";
	public static final String DATABASE_TYPE_DROPDOWN_XPATH = "//select[@id='dbtype' and @name='dbtype']";
	public static final String BUILT_IN_DATABASE_TYPE_XPATH = "//option[@value='internal' and text()='"+BUILT_IN_DATABASE_TYPE+"']";
	public static final String POSTGRE_SQL_DATABASE_TYPE_XPATH = "//option[@value='postgresql' and text()='"+POSTGRE_SQL_DATABASE_TYPE+"']";
	public static final String INTERNAL_DATABASE_USERS_XPATH = "//div[text()='"+INTERNAL_DATABASE_USERS+"']";
	public static final String INTERNAL_DATABASE_SHOW_HELP_XPATH = "//select[@id='helplink_dbusers']";
	public static final String INTERNAL_DATABASE_HIDE_HELP_XPATH = "//div/a[text()='"+INTERNAL_DATABASE_HIDE_HELP+"']";
	
	public static final String CREATE_BOLD_XPATH = "//li/b[text()='"+CREATE_BOLD+"']";
	public static final String CREATE_PARAGRAPH_XPATH = "//ul/li[text()='"+CREATE_PARAGRAPH+"']";
	public static final String DELETE_BOLD_XPATH = "//li/b[text()='"+DELETE_BOLD+"']";
	public static final String DELETE_PARAGRAPH_XPATH = "//ul/li[text()='"+DELETE_PARAGRAPH+"']";
	public static final String USERNAME_BOLD_XPATH = "//li/b[text()='"+USERNAME_BOLD+"']";
	public static final String USERNAME_PARAGRAPH_XPATH = "//ul/li[text()='"+USERNAME_PARAGRAPH+"']";
	public static final String PASSWORD_BOLD_XPATH = "//li/b[text()='"+PASSWORD_BOLD+"']";
	public static final String PASSWORD_PARAGRAPH_XPATH = "//ul/li[text()='"+PASSWORD_PARAGRAPH+"']";
	public static final String WRITE_ACCESS_BOLD_XPATH = "//li/b[text()='"+WRITE_ACCESS_BOLD+"']";
	public static final String WRITE_ACCESS_PARAGRAPH_XPATH = "//ul/li[text()='"+WRITE_ACCESS_PARAGRAPH+"']";
	public static final String REMOTE_LOGIN_BOLD_XPATH = "//li/b[text()='"+REMOTE_LOGIN_BOLD+"']";
	public static final String REMOTE_LOGIN_PARAGRAPH_XPATH = "//ul/li[text()='"+REMOTE_LOGIN_PARAGRAPH+"']";
	
	public static final String USER_LIST_XPATH = "//select[@id='userlist']";
	public static final String SETTINGS_CREATE_BUTTON_XPATH = "//button/span[text()='"+USER_LIST_CREATE_BUTTON+"']";
	public static final String SETTINGS_DELETE_BUTTON_XPATH = "//button/span[text()='"+USER_LIST_DELETE_BUTTON+"']";
	public static final String SETTINGS_USERNAME_XPATH = "//div/span[text()='"+SETTINGS_USERNAME+"']";
	public static final String SETTINGS_PASSWORD_XPATH = "//div/span[text()='"+SETTINGS_PASSWORD+"']";
	public static final String RE_ENTER_PASSWORD_XPATH = "//div/span[text()='"+RE_ENTER_PASSWORD+"']";
	public static final String WRITE_ACCESS_XPATH = "//div/span[text()='"+WRITE_ACCESS+"']";
	public static final String REMOTE_LOGIN_XPATH = "//div/span[text()='"+REMOTE_LOGIN+"']";
	public static final String SETTINGS_USERNAME_FIELD_XPATH = "//input[@id='userlistName']";
	public static final String SETTINGS_PASSWORD_FIELD_XPATH = "//input[@id='userlist-0']";
	public static final String RE_ENTER_PASSWORD_FIELD_XPATH = "//input[@id='userlist-1']";
	public static final String WRITE_ACCESS_FIELD_XPATH = "//input[@id='userlist-2']";
	public static final String REMOTE_LOGIN_FIELD_XPATH = "//input[@id='userlist-3']";
	public static final String SETTINGS_SAVE_BUTTON_XPATH = "//button/span[text()='"+SETTINGS_SAVE_BUTTON+"']";
	
	// ################################ REPORTS PAGE #################################
	public static final String VIEW_REPORTS_XPATH = "//div/a[text()='"+REPORTS_VIEW_REPORTS+"']";
	public static final String CHART_DATA_FOR_DEVICES_TITLE_XPATH = "//div[text()='"+CHART_DATA_FOR_DEVICES_TITLE+"']";
	public static final String CHART_OF_DATA_FOR_ONE_OR_MORE_DEVICES_SUMMARY_XPATH = "//div[text()='"+CHART_OF_DATA_FOR_ONE_OR_MORE_DEVICES_SUMMARY+"']";
	public static final String CREATE_A_NEW_REPORT_XPATH = "//div[text()='"+CREATE_A_NEW_REPORT+"']";
	public static final String SELECT_A_REPORT_TEMPLATE_XPATH = "//div[text()='"+SELECT_A_REPORT_TEMPLATE+"']";
	public static final String REPORT_SUMMARY_1_XPATH = "//div[text()='"+REPORT_SUMMARY_1+"']";
	public static final String REPORT_SUMMARY_2_XPATH = "//div[text()='"+REPORT_SUMMARY_2+"']";
	
	public static final String DEVICES_DROPDOWN_TITLE_XPATH = "//div[text()='"+DEVICES_DROPDOWN_TITLE+"']";
	public static final String DATASET_DROPDOWN_TITLE_XPATH = "//div[text()='"+DATASET_DROPDOWN_TITLE+"']";
	public static final String TIME_PERIOD_DROPDOWN_TITLE_XPATH = "//div[text()='"+TIME_PERIOD_DROPDOWN_TITLE+"']";
	public static final String ALL_DEVICES_DROPDOWN_XPATH = "//div[text()='"+ALL_DEVICES_DROPDOWN+"']";
	public static final String DROPDOWN_ALL_DEVICES_XPATH = "//div[text()='"+DROPDOWN_ALL_DEVICES+"']";
	public static final String DROPDOWN_DEVICES_ON_MAP_XPATH = "//div[text()='"+DROPDOWN_DEVICES_ON_MAP+"']";
	public static final String DROPDOWN_DEVICES_IN_STATE_XPATH = "//div[text()='"+DROPDOWN_DEVICES_IN_STATE+"']";
	public static final String DROPDOWN_DEVICES_WITH_XPATH = "//div[text()='"+DROPDOWN_DEVICES_WITH+"']";
	public static final String DROPDOWN_SPECIFIC_DEVICES_XPATH = "//div[text()='"+DROPDOWN_SPECIFIC_DEVICES+"']";
	public static final String DROPDOWN_DEVICES_ON_MAP_DEMO_1_XPATH = "//div[@title='"+DROPDOWN_DEVICES_ON_MAP_DEMO_1+"']";   
	public static final String DROPDOWN_DEVICES_ON_MAP_DEMO_2_XPATH = "//div[text()='"+DROPDOWN_DEVICES_ON_MAP_DEMO_2+"']";
	public static final String DROPDOWN_DEVICES_ON_MAP_DEMO_3_XPATH = "//div[text()='"+DROPDOWN_DEVICES_ON_MAP_DEMO_3+"']";
	public static final String DROPDOWN_DEVICES_ON_MAP_DEMO_4_XPATH = "//div[text()='"+DROPDOWN_DEVICES_ON_MAP_DEMO_4+"']";
	public static final String DROPDOWN_DEVICES_IN_STATE_DOWN_XPATH = "//div[text()='"+DROPDOWN_DEVICES_IN_STATE_DOWN+"']";
	public static final String DROPDOWN_DEVICES_IN_STATE_CRITICAL_XPATH = "//div[text()='"+DROPDOWN_DEVICES_IN_STATE_CRITICAL+"']";
	public static final String DROPDOWN_DEVICES_IN_STATE_ALARM_XPATH = "//div[text()='"+DROPDOWN_DEVICES_IN_STATE_ALARM+"']";
	public static final String DROPDOWN_DEVICES_IN_STATE_WARNING_XPATH = "//div[text()='"+DROPDOWN_DEVICES_IN_STATE_WARNING+"']";
	public static final String DROPDOWN_DEVICES_IN_STATE_OKAY_XPATH = "//div[text()='"+DROPDOWN_DEVICES_IN_STATE_OKAY+"']";
	public static final String DROPDOWN_DEVICES_IN_STATE_UNKNOWN_XPATH = "//div[text()='"+DROPDOWN_DEVICES_IN_STATE_UNKNOWN+"']";
	public static final String DROPDOWN_DEVICES_IN_STATE_ACKNOWLEDGED_XPATH = "//div[text()='"+DROPDOWN_DEVICES_IN_STATE_ACKNOWLEDGED+"']";
	public static final String DROPDOWN_DEVICES_WITH_TYPE_SNMP_XPATH = "//div[text()='"+DROPDOWN_DEVICES_WITH_TYPE_SNMP+"']";
	
	public static final String DROPDOWN_DEVICES_ON_MAP_DEMO_CKECKMARK_BTN_XPATH = "//div[contains(@class, 'imdc-clickable-icon imdc-clickable-icon-primary ui-noselect ui-icon ui-icon-check')]";
	public static final String DROPDOWN_DEVICES_ON_MAP_DEMO_UNCHECK_ALL_BTN_XPATH = "//div[contains(@class, 'imdc-clickable-icon imdc-clickable-icon-primary ui-noselect ui-icon ui-icon-closethick')]";
	
	public static final String DROPDOWN_DEVICES_ON_MAP_DEMO_1_CHECKED_XPATH = "//div[contains(@class, '"+DROPDOWN_DEVICES_ON_MAP_DEMO_STATE_ACTIVE+"') and text()='Demo Co-op Wireless']";   
	public static final String DROPDOWN_DEVICES_ON_MAP_DEMO_2_CHECKED_XPATH = "//div[contains(@class, '"+DROPDOWN_DEVICES_ON_MAP_DEMO_STATE_ACTIVE+"') and text()='Demo Main Map']";
	public static final String DROPDOWN_DEVICES_ON_MAP_DEMO_3_CHECKED_XPATH = "//div[contains(@class, '"+DROPDOWN_DEVICES_ON_MAP_DEMO_STATE_ACTIVE+"') and text()='Demo Network Operations']";
	public static final String DROPDOWN_DEVICES_ON_MAP_DEMO_4_CHECKED_XPATH = "//div[contains(@class, '"+DROPDOWN_DEVICES_ON_MAP_DEMO_STATE_ACTIVE+"') and text()='Demo Office Location']";
	
	public static final String AVAILABILITY_DROPDOWN_XPATH = "//div[text()='"+AVAILABILITY_DROPDOWN+"']";
	public static final String AVAILABILITY_DROPDOWN_1_XPATH = "//div[@title='"+AVAILABILITY_DROPDOWN+"']";
	public static final String DROPDOWN_AVAILABILITY_RESPONSE_TIME_XPATH = "//div[@title='"+DROPDOWN_AVAILABILITY_RESPONSE_TIME+"']"; 
	public static final String DROPDOWN_AVAILABILITY_SHORT_TERM_PACKET_LOSS_XPATH = "//div[text()='"+DROPDOWN_AVAILABILITY_SHORT_TERM_PACKET_LOSS+"']";

	public static final String PREVIOUS_24_HOURS_DROPDOWN_XPATH = "//div[contains(@class, 'imreports-timerange imdc-combo')]"; //"//div[text()='"+PREVIOUS_24_HOURS_DROPDOWN+"']";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_PREVIOUS_XPATH = "//div[text()='"+DROPDOWN_PREVIOUS_24_HOURS_PREVIOUS+"']";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_XPATH = "//div[text()='"+DROPDOWN_PREVIOUS_24_HOURS_TO_DATE+"']";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_SPECIFIC_DATE_XPATH = "//div[text()='"+DROPDOWN_PREVIOUS_24_HOURS_SPECIFIC_DATE+"']";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_ALL_DATES_BEFORE_XPATH = "//div[text()='"+DROPDOWN_PREVIOUS_24_HOURS_ALL_DATES_BEFORE+"']";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_ALL_DATES_AFTER_XPATH = "//div[text()='"+DROPDOWN_PREVIOUS_24_HOURS_ALL_DATES_AFTER+"']";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_DATE_RANGE_XPATH = "//div[text()='"+DROPDOWN_PREVIOUS_24_HOURS_DATE_RANGE+"']";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_DAY_XPATH = "//div[text()='"+DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_DAY+"']";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_WEEK_XPATH = "//div[text()='"+DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_WEEK+"']";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_MONTH_XPATH = "//div[text()='"+DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_MONTH+"']";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_YEAR_XPATH = "//div[text()='"+DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_YEAR+"']";
	
	public static final String DISPLAY_AS_DROPDOWN_TITLE_XPATH = "//div[text()='"+DISPLAY_AS_DROPDOWN_TITLE+"']";
	public static final String DISPLAY_AS_DROPDOWN_LINE_CHART_XPATH = "//div[text()='"+DISPLAY_AS_DROPDOWN_LINE_CHART+"']";
	public static final String DISPLAY_AS_DROPDOWN_TABLE_XPATH = "//div[text()='"+DISPLAY_AS_DROPDOWN_TABLE+"']";
	public static final String KEEP_IN_MIND_PARAGRAPH_XPATH = "//div[text()='"+KEEP_IN_MIND_PARAGRAPH+"']";
	public static final String SAVED_REPORTS_BUTTON_XPATH = "//div[text()='"+SAVED_REPORTS_BUTTON+"']";
	public static final String CREATE_REPORT_BUTTON_XPATH = "//div[text()='"+CREATE_REPORT_BUTTON+"']";
	public static final String FILE_MENU_BUTTON_XPATH = "//div[text()='"+FILE_MENU_BUTTON+"']";
	public static final String FILE_MENU_SAVE_BUTTON_XPATH = "//div[@class='ui-menu-entry ui-noselect' and text()='Save']";
	
	public static final String SAVE_THE_CURRENT_REPORT_HEADER_XPATH = "//div[contains(@class, 'ui-view-chooser-title') and text()='"+SAVE_THE_CURRENT_REPORT_HEADER+"']"; //div[text()='"+SAVE_THE_CURRENT_REPORT_HEADER+"']
	public static final String SELECT_AN_EXISTING_REPORT_PARAGRAPH_XPATH = "//div[text()='"+SELECT_AN_EXISTING_REPORT_PARAGRAPH+"']";
	public static final String REPORT_TITLE_XPATH = "//div[text()='"+REPORT_TITLE+"']";
	public static final String REPORT_SUMMARY_XPATH = "//div[text()='"+REPORT_SUMMARY+"']";
	public static final String REPORT_PARAGRAPH_XPATH = "//div[text()='"+REPORT_PARAGRAPH+"']";
	public static final String REPORT_NAME_XPATH = "//div[text()='"+REPORT_NAME+"']";
	public static final String CANCEL_BUTTON_XPATH = "//div[text()='"+CANCEL_BUTTON+"']";   // testUtils.getElementByXPath("//div[text()='Save Report']/../../descendant::div[1]/descendant::div[1]").click();
	public static final String DELETE_BUTTON_REPORT_XPATH = "//div[text()='"+DELETE_BUTTON_REPORT+"']";
	public static final String SAVE_REPORT_BUTTON_XPATH = "//div[text()='"+SAVE_REPORT_BUTTON+"']";
	public static final String SAVE_REPORT_BUTTON_WITH_CLASS_XPATH = "//div[contains(@class, 'imdc-clickable-label ui-noselect') and text()='"+SAVE_REPORT_BUTTON+"']";
	
	//Chart Data for Interfaces
	public static final String CHART_DATA_FOR_INTERFACES_XPATH = "//div[text()='"+CHART_DATA_FOR_INTERFACES+"']";
	
	// ################################ LOG #################################
	public static final String IMDC_LOG_FILE_XPATH = "//b/a[text()='"+IMDC_LOG_FILE+"']";
	public static final String CLICK_TO_DOWNLOAD_HEADER_XPATH = "//div/b[text()='"+CLICK_TO_DOWNLOAD_HEADER+"']";
	public static final String LOG_LEVEL_FOOTER_XPATH = "//div/b[text()='"+LOG_LEVEL_FOOTER+"']";
	public static final String REFRESH_SECONDS_FOOTER_XPATH = "//div/b[text()='"+REFRESH_SECONDS_FOOTER+"']";
	public static final String LINES_FOOTER_XPATH = "//div/b[text()='"+LINES_FOOTER+"']";
	public static final String LOG_LEVEL_DROPDOWN_XPATH = "//select[@name='logLevel']";
	public static final String FULL_DEBUG_XPATH = "//option[@value='debug' and text()='"+FULL_DEBUG+"']";
	public static final String CONNECTIONS_XPATH = "//option[@value='conn' and text()='"+CONNECTIONS_LOG_LEVEL+"']";
	public static final String INFORMATION_XPATH = "//option[@value='info' and text()='"+INFORMATION+"']";
	public static final String ERRORS_ONLY_XPATH = "//option[@value='warning' and text()='"+ERRORS_ONLY+"']";
	public static final String REFRESH_VALUE_XPATH = "//input[@name='viewRefresh']";
	public static final String LINES_VALUE_XPATH = "//input[@name='viewCount']";
	public static final String SAVE_BUTTON_FOOTER_XPATH = "//button/span[text()='"+SAVE_BUTTON_FOOTER+"']";
	public static final String REFRESH_VALUE_UPDATED_XPATH = "//input[@name='viewRefresh' and @value='%s']";
	public static final String LINES_VALUE_UPDATED_XPATH = "//input[@name='viewCount' and @value='%s']";

	// ################################ LOGOUT #################################
	public static final String LOGOUT_BUTTON_XPATH = "//b/a[text()='"+IMDC_LOG_FILE+"']";
	public static final String LOGIN_HEADER_XPATH = "//div/div[text()='"+LOGIN_HEADER+"']";
	public static final String LOGIN_USERNAME_XPATH = "//form/span[text()='"+LOGIN_USERNAME+"']";
	public static final String LOGIN_PASSWORD_XPATH = "//form/span[text()='"+LOGIN_PASSWORD+"']";
	public static final String LOGIN_BUTTON_XPATH = "//button/span[text()='"+LOGIN_BUTTON+"']";
	public static final String LOGOUT_MESSAGE_XPATH = "//div/div[text()='"+LOGOUT_MESSAGE+"']";
	public static final String LOGOUT_MESSAGE_X_BUTTON_XPATH = "//div[@id='alertClose']";
	public static final String APP_TITLE_XPATH = "//div[@class='"+IMDC_APP_TITLE+"' and text()='%s']";
	public static final String APP_STATUS_XPATH = "//div[@id='%s']//div[text()='%s']//span[text()='%s']";
	public static final String LOGOUT_BUTTON_SELECTOR ="//a/b[text()='Log Out']";
	public static final String AUTH_APP_INFO_CLICK_SELECTOR = "//div[contains(text()[1],'"+CLICK+"')]";
	public static final String AUTH_APP_INFO_DIRECTORY_SELECTOR = "//div[contains(text()[2],'"+AUTH_DIRECTORY_INFO+"')]";
	public static final String AUTH_APP_INFO_CONFIGURE_SELECTOR = "//div/b[contains(text(),'"+CONFIGURE+"')]";
	public static final String APPS_LINK_ITEMS_XPATH = "//div[@class='"+IMDC_APP_BUTTONS+"']//a[text()='%s' and @href='%s']";	
	public static final String IMDB_STOP_START_BUTTON_XPATH ="//div/a[text()='%s']";
	public static final String APP_INFO_XPATH = "//div[text()='%s']";
	public static final String MORE_DETAILS_BUTTON_XPATH = "//div[@class='"+IMDC_APP_BUTTONS+"']//a[text()='%s' and @href=%s]";
	public static final String ITALIC_TEXT = "//i[text()='start']";
	public static final String PAGE_NAME_XPATH = "//a[text()='%s']";
	public static final String LOCALE_CHOOSER_XPATH = "//div[@id='localeChooser']";
	public static final String LOCALE_CHOOSER_ENG_XPATH = "//div[@id='localeChooser']//div[@id='locale_en']";
	public static final String CONTINUE_BUTTON_XPATH = "//button[@id='defaultEnterButton']//span[text()='Continue']";
	public static final String LOGIN_FORM_XPATH = "//div[@class='title' and text()='Login']";
	public static final String IMDC_SERVICE_START_COMMAND = "net start IMDataCenter";
	public static final String IMDC_SERVICE_STOP_COMMAND = "net stop IMDataCenter";
	public static final String SET_AUTH_LOCAL_COMMAND = "\"C:\\Program Files\\InterMapper\\dwf\\core\\python3\\imdc.exe\" -OO \"C:\\Program Files\\InterMapper\\dwf\\imdc\\main.py\" authlocal";
	public static final String ALLOW_LOCAL_COMMAND = "\"C:\\Program Files\\InterMapper\\dwf\\core\\python3\\imdc.exe\" -OO \"C:\\Program Files\\InterMapper\\dwf\\imdc\\main.py\" allowlocal";
	public static final String SET_ADMIN_PASSWORD_COMMAND = "\"C:\\Program Files\\InterMapper\\dwf\\core\\python3\\imdc.exe\" -OO \"C:\\Program Files\\InterMapper\\dwf\\imdc\\main.py\" --password=HelpSystems1";
	public static final String CMD_EXE = "cmd.exe";
	public static final String PWRESET_COMMAND = "\"C:\\Program Files\\InterMapper\\dwf\\core\\python3\\imdc.exe\" -OO \"C:\\Program Files\\InterMapper\\dwf\\imdc\\main.py\" pwreset";
	
	// ################################ SETTINGS #################################
	public static final String SETTINGS_TEXTS_XPATH = "//div[text() = '%s']";
	public static final String SHOW_HELP_XPATH = "//a[@class='%s' and text()='%s']";
	public static final String ADMIN_USERNAME_XPATH = "//div[@class='row'][1]//span[text()='%s']";
	public static final String ADMIN_PASSWORD_XPATH = "//div[@class='row'][2]//span[text()='%s']";
	public static final String ADMIN_CONFIRM_PASSWORD_XPATH = "//div[@class='row'][3]//span[text()='%s']";	
	public static final String ADMIN_USERNAME_FIELD_XPATH = "//div[@class='row']//input[@name='username' and @value='"+DEFAULT_USERNAME+"']";
	public static final String ADMIN_PASSWORD_FIELD_XPATH = "//div[@class='row']//input[@name='password' and @value='']";
	public static final String ADMIN_CONFIRM_PASSWORD_FIELD_XPATH = "//div[@class='row']//input[@name='passwordc' and @value='']";
	public static final String ALLOW_LOCAL_CHECKBOX_XPATH = "//div[@class='row']//input[@name='allowLocal']";
	public static final String ALLOW_LOCAL_XPATH = "//div[@class='row']//span[text()='"+SKIP_AUTH_LOCAL+"']";	
	public static final String PRIMARY_HOST_XPATH = "//div/span[@class='aligned label' and text()='"+HOST_SETTINGS+"']";
	public static final String PRIMARY_USERNAME_XPATH = "//input[@name='smtp_puser']/../span[@class='aligned label' and text()='"+USERNAME+"']";
	public static final String PRIMARY_PASSWORD_XPATH =  "//input[@name='smtp_ppass']/../span[@class='aligned label' and text()='"+PASSWORD+"']";
	public static final String FROM_ADDRESS_XPATH = "//div[@class='row']//span[@class='aligned label' and text()='"+FROM_ADDRESS+"']";	
	public static final String BACKUP_HOST_XPATH = "//div/span[@class='smtp label' and text()='"+HOST_SETTINGS+"']";
	public static final String BACKUP_USERNAME_XPATH =  "//div//span[@class='smtp label' and text()='"+USERNAME+"']";
	public static final String BACKUP_PASSWORD_XPATH =  "//div//span[@class='smtp label' and text()='"+PASSWORD+"']";	
	public static final String PRIMARY_PORT_XPATH = "//input[@name='smtp_pport']/../span[@class='inline label' and text()='"+PORT_FIELD+"']";
	public static final String BACKUP_PORT_XPATH = "//input[@name='smtp_sport']/../span[@class='inline label' and text()='"+PORT_FIELD+"']";
	public static final String PRIMARY_PORT_INPUT_XPATH = "//div//input[@name='"+SMTP_PPORT+"' and @value='"+DEFAULT_SMTP_PORT+"']";
	public static final String BACKUP_PORT_INPUT_XPATH = "//div//input[@name='smtp_sport' and @value='"+DEFAULT_SMTP_PORT+"']";		
	public static final String PRIMARY_HOST_INPUT_XPATH = "//div//input[@name='smtp_phost' and @maxlength='255' and @type ='text' and @class='inline hostname' and  @value='']";	
	public static final String PRIMARY_USERNAME_INPUT_XPATH = "//div//input[@name='smtp_puser' and @maxlength='128' and @type ='text' and @class='inline login' and  @value='']";
	public static final String PRIMARY_PASSWORD_INPUT_XPATH = "//div//input[@name='smtp_ppass' and @maxlength='128' and @type ='password' and @class='inline login' and  @value='']";	
	public static final String PRIMARY_FROM_INPUT_XPATH = "//div//input[@name='smtp_faddress' and @maxlength='255' and @type ='text' and @class='inline email' and  @value='']";
	public static final String BACKUP_HOST_INPUT_XPATH = "//div//input[@name='smtp_shost' and @maxlength='255' and @type ='text' and @class='inline hostname' and  @value='']";	
	public static final String BACKUP_USERNAME_INPUT_XPATH = "//div//input[@name='smtp_suser' and @maxlength='128' and @type ='text' and @class='inline login' and  @value='']";
	public static final String BACKUP_PASSWORD_INPUT_XPATH = "//div//input[@name='smtp_spass' and @maxlength='128' and @type ='password' and @class='inline login' and  @value='']";
    public static final String TEST_ADDRESS_XPATH = "//div[@class='subbox']//span[text()='"+TEST_ADDRESS+"']";
	public static final String TEST_ADDRESS_INPUT_XPATH = "//div[@class='row']//input[@name='"+SMTP_TESTMAIL+"' and @maxlength='255' and @type='text' and @class='inline email' and @value='']";
	public static final String SEND_EMAIL_TO_XPATH = "//div//span[text()='"+SEND_EMAIL_TO+"']";
	public static final String SEND_EMAIL_TO_DISABLED_INPUT_SELECTOR = "//input[@name='smtp_eaddress' and @maxlength='255' and  @type='text' and  @class='inline email' and  @value='' and @disabled='']";
	public static final String BUG_REPORTS_XPATH = "//div//span[text()='"+BUG_REPORTS+"']";
	public static final String SEND_TEST_EMAIL_XPATH = "//button/span[text()='"+SEND_TEST_EMAIL+"']";
	public static final String INPUT_FIELD_XPATH = "//input[@name='%s']";	
	public static final String SAVE_CHANGES_BUTTON_XPATH = "//button/span[text()='"+SAVE_CHANGES+"']";
	public static final String IMDC_ALERTS_XPATH = "//div[@id='alertBar']//div[@id='alertBox' and text()='%s']";
	public static final String ON_ERRORS_CHECKBOX_XPATH = "//input[@name='smtp_esend' and @type='checkbox' and @class='indented' and @onclick='smtp_eaddress.disabled = !this.checked;']";
	public static final String SEND_EMAIL_TO_ENABLED_INPUT_SELECTOR = "//input[@name='smtp_eaddress' and @maxlength='255' and  @type='text' and  @class='inline email' and  @value='']";
	public static final String LISTEN_PORT_SELECTOR = "//div//span[text()='Listen Port:']";
	public static final String LISTEN_PORT_INPUT_SELECTOR= "//div//input[@name='listenPort']";
	public static final String AUTO_CERT_ENABLED_RADIO= "//div//input[@name='certDefault' and @type='radio' and @value='true' and @onclick=\"sslKey.disabled = true; sslCert.disabled = true; $('gencert').disabled = false;\" and @checked]";
	public static final String AUTO_CERT_DISABLED_RADIO ="//div//input[@name='certDefault' and @type='radio' and @value='true' and @onclick=\"sslKey.disabled = true; sslCert.disabled = true; $('gencert').disabled = false;\"] ";
	public static final String AUTO_CERT_SELECTOR = "//div//span[text()='Use the automatically-generated certificate']";
	public static final String GEN_CERT_BUTTON_SELECTOR = "//div//button[@id='gencert' and @onclick]";
	public static final String GEN_CERT_BUTTON = "//button//span[text()='Generate a new Certificate']";	
	public static final String CUSTOM_CERT_DISABLED_RADIO= "//div//input[@name='certDefault' and @type='radio' and @value='false' and @onclick=\"sslKey.disabled = false; sslCert.disabled = false; $('gencert').disabled = true;\"]";
	public static final String CUSTOM_CERT_SELECTOR = "//div//span[text()='Use a custom certificate']";
	public static final String SSL_PRIVATE_KEY_SELECTOR = "//div//span[text()='SSL Private Key:']";
	public static final String SSL_KEY_INPUT_SELECTOR= "//div//input[@name='sslKey']";
	public static final String SSL_CERT_SELECTOR = "//div//span[text()='SSL Certificate:']";
	public static final String SSL_CERT_INPUT_SELECTOR= "//div//input[@name='sslCert']";
	public static final String IMDC_ALERTS_RESTART_NOW_SELCTOR = "//div[@id='alertBar']//div[@id='alertBox']//a[@href=\"JavaScript:restart('settings');\"]//b[text()='restart now']";
	public static final String CUSTOM_CERT_ENABLED_RADIO = "//div//input[@name='certDefault' and @type='radio' and @value='false' and @onclick=\"sslKey.disabled = false; sslCert.disabled = false; $('gencert').disabled = true;\" and @checked]";
	public static final String LANGUAGE_LABELS_XPATH = "//div//span[text()='%s']";
	public static final String SELECTED_LANGUAGE_XPATH = "//select//option[@value='%s' and @selected and text()='%s']";
	public static final String LANGUAGE_OPTIONS_XPATH = "//select//option[@value='%s' and text()='%s']";
	public static final String OVERRIDE_LANGUAGE_CHECKBOX_LOCATOR = "//div//input[@type='checkbox']/../span[text()=\"Override the browser's language for web pages\"]";
	public static final String IMDC_CERT_ALERT_XPATH = "//div[@id='alertBar']//div[@id='alertBox' and text()=\"When choosing the 'use a custom certificate' option for the first time, you must provide a key and certificate file.\"]";
	public static final String OVERRIDE_BROWSER_LANGUAGE_XPATH = "//div//span[text()=\"Override the browser's language for web pages\"]";
	public static final String TEST_USERNAME_FIELD_XPATH = "//div[@class='row']//input[@name='username' and @value='test']";
	public static final String RESTART_COMPLETED_ALERT_XPATH = "//div[@id='alertBar']//div[@id='alertBox' and text()=\"InterMapper DataCenter server restart complete.\"]";
	public static final String IMDC_ALERTS_RESTART_NOW_BUTTON = "//div[@id='alertBar']//div[@id='alertBox']//a[@href=\"JavaScript:restart('settings');\"]";

	// ################################ MANAGE APPS #################################
	public static final String MANAGE_APPS_PAGE_TEXTS_XPATH = "//div[@id='content']//div[text()='%s']";
	public static final String MANAGE_APPS_INFO_XPATH = "//div[@id='content']//div[contains(text(),'%s')]";
	public static final String APP_ICONS_XPATH = "//div[@class='imdc-app-icon']//img[@src='%s']";
	public static final String REMOVE_AUTH_BUTTON_XPATH ="//button[starts-with(@onclick,\"if (confirmAppRemove('IMAuth')) this.form.action = 'https://"+ HOST + ":"+ PORT +"/manage.html?\") and contains(@onclick,\"delApp&appName=imauth\")]//span[text()='Remove']";
	public static final String REMOVE_IMDB_BUTTON_XPATH = "//button[starts-with(@onclick,\"if (confirmAppRemove('IMDatabase')) this.form.action = 'https://"+ HOST +":"+ PORT +"/manage.html?\") and contains(@onclick,'delApp&appName=imdatabase')]//span[text()='Remove']";
	public static final String REMOVE_IMREPORTS_BUTTON_XPATH = "//button[starts-with(@onclick,\"if (confirmAppRemove('IMReports')) this.form.action = 'https://"+ HOST + ":"+ PORT +"/manage.html?\") and contains(@onclick,'delApp&appName=imreports')]//span[text()='Remove']";
    public static final String INSTALL_AUTH_BUTTON_XPATH ="//button[starts-with(@onclick,\"if (confirmAppAdd('IMAuth')) this.form.action = 'https://"+ HOST + ":"+ PORT +"/manage.html?\") and contains(@onclick,\"addApp&appName=imauth\")]//span[text()='Install']";
	public static final String INSTALL_IMDB_BUTTON_XPATH = "//button[starts-with(@onclick,\"if (confirmAppAdd('IMDatabase')) this.form.action = 'https://"+ HOST +":"+ PORT +"/manage.html?\") and contains(@onclick,'addApp&appName=imdatabase')]//span[text()='Install']";
	public static final String INSTALL_IMREPORTS_BUTTON_XPATH = "//button[starts-with(@onclick,\"if (confirmAppAdd('IMReports')) this.form.action = 'https://"+ HOST + ":"+ PORT +"/manage.html?\") and contains(@onclick,'addApp&appName=imreports')]//span[text()='Install']";

}