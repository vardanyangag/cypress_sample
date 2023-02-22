package com.helpsystems.intermapperreport.uitest.utils;

import static com.helpsystems.common.util.Constants.*;

public final class UiDataConstants {
	private UiDataConstants(){
	}


	// ################################ GENERAL ################################
	//public static final String HOST_NAME = HOST;
	public static final String HOME_TAB_NAME = "Home";
	public static final String HOME_LOG_TAB_NAME = "Log";
	public static final String HOME_MORE_DETAILS = "More Details";
	public static final String HOME_MORE_DETAILS_NAME = "Name";
	public static final String HOME_MORE_DETAILS_ID = "ID";
	public static final String HOME_MORE_DETAILS_SERVER_EXPORT_STATUS = "Server Export Status";
	public static final String HOME_MORE_DETAILS_SERVER_EXPORT_STATUS_CONTENT = "Next import (new data) scheduled for";	
	public static final String HOME_LOG_OUT = "Log Out";	
	public static final String MANAGE_APPS= "Manage Apps";
	public static final String REPORT_A_BUG_TEXT = "Report a Bug";
	public static final String CONTACT_INFORMATION_TITLE_TEXT = "Contact Information";
	public static final String NAME_TEXT = "Name:";
	public static final String E_MAIL_TEXT = "E-Mail:";
	public static final String SUBJECT_TEXT = "Subject:";
	public static final String PHONE_TEXT = "Phone:";
	public static final String WHAT_HAPPENED_TEXT = "What Happened";

	// ################################ LOG ################################
	public static final String VIEW_THE_LOG_TEXT_LINK = "View the log";
	public static final String IMDATABASE_LOG = "imdatabase.log";
	public static final String CLICK_TO_DOWNLOAD_THE_FULL_LOG = " (click to download the full log;";
	public static final String IMDC_LOG_FILE = "imdc.log";
	public static final String CLICK_TO_DOWNLOAD_HEADER = " (click to download the full log; 136 KB)";
	public static final String LOG_LEVEL_FOOTER = "Log Level:";
	public static final String REFRESH_SECONDS_FOOTER = "Refresh (seconds):";
	public static final String LINES_FOOTER = "Lines:";
	public static final String SAVE_BUTTON_FOOTER = "Save";
	public static final String FULL_DEBUG = "Full Debug";
	public static final String CONNECTIONS_LOG_LEVEL = "Connections";
	public static final String INFORMATION = "Information";
	public static final String ERRORS_ONLY = "Errors Only";
	public static final String REFRESH_VALUE_DEFAULT = "5";
	public static final String LINES_VALUE_DEFAULT = "20";
	
	// ################################ OVERVIEW ################################
	public static final String OVERVIEW_BUTTON = "Overview";
	public static final String DATABASE_OVERVIEW_HEADER = "Database Overview";
	public static final String DATABASE_OVERVIEW_PARAGRAPH = "These charts show the estimated current and future disk usage, "
			+ "and the number of rows in each of the major storage tables. Projected usage is a rough estimate based on "
			+ "the number of devices currently stored, and their retention policies. If you plan to add more devices, "
			+ "you will either need more disk space, or need to modify your data retention policies to throw away old data sooner.";
	public static final String ESTIMATED_FUTURE_DISK_USAGE = "Estimated Future Disk Usage";
	public static final String CURRENT_ROW_COUNTS = "Current row counts";
	public static final String MAPS = "Maps";
	public static final String DEVICES = "Devices";
	public static final String INTERFACES = "Interfaces";
	public static final String DATASETS = "Datasets";
	public static final String DATAPOINTS = "Datapoints";
	public static final String FIVE_MINUTE_DATA_SAMPLES = "5-minute data samples";
	public static final String HOURLY_DATA_SAMPLES = "Hourly data samples";
	public static final String DAYLY_DATA_SAMPLES = "Daily data samples";
	public static final String EVENTS = "Events";
	public static final String NOTIFICATIONS = "Notifications";
	public static final String ACHKNOWLEDGMENTS = "Acknowledgments";
	public static final String CURRENT_ROW_COUNTS_FOOTER = "Counts are estimated for tables containing more than 1000 rows.";
	
	//################################ MAINTENANCE #################################
	public static final String MAINTENANCE_LINK = "Maintenance";
	public static final String MAINTENANCE_TASKS_HEADER = "Maintenance Tasks";
	public static final String MAINTENANCE_TASKS_PARAGRAPH = "Sometimes it can be useful to pause import and maintenance tasks, "
			+ "without stopping the database entirely. This allows you to manually re-cluster or re-index tables, and avoid import "
			+ "errors during scheduled down-time on the InterMapper Server.";
	public static final String PAUSE_OPERATIONS = "Pause Operations";
	public static final String RESUME_OPERATIONS = "Resume Operations";
	public static final String FOR = "for";
	public static final String PAUSE_OPERATION_DEFAULT_VALUE = "2";
	public static final String OLDER_THAN_DEFAULT_VALUE = "";
	public static final String HOURS_PAUSE_OPERATIONS = "hours";
	public static final String DAYS_PAUSE_OPERATIONS = "days";
	public static final String INDEFINITELY_PAUSE_OPERATIONS = "indefinitely";
	public static final String RECLAIMING_DISK_SPACE = "Reclaiming disk space and removing old data";
	public static final String RECLAIMING_DISK_SPACE_PARAGRAPH = "Data retention policies are the recommended way to free disk space on "
			+ "a per-dataset basis. But you can also use the controls below to delete data or events across all devices. This operation "
			+ "cannot be un-done, and may take several hours to complete, with import paused during that time.";
	public static final String MAINTENANCE_ESTIMATED_FUTURE_DISK = "Estimated Future Disk Usage";
	public static final String DATA_TO_DELETE = "Data to delete:";
	public static final String RAW_DATA_DATA_TO_DELETE_DROPDOWN = "Raw data";
	public static final String FIVE_MINUTE_DATA_TO_DELETE_DROPDOWN = "5-Minute, hourly and daily samples";
	public static final String EVENTS_DATA_TO_DELETE_DROPDOWN = "Events, acknowledgments and notifications";
	public static final String DATA_FROM_DELETED_DATA_TO_DELETE_DROPDOWN = "Data from deleted devices/interfaces";
	public static final String OLDER_THAN = "Older than:";
	public static final String DAYS_OLDER_THAN_DROPDOWN = "days";
	public static final String MONTHS_OLDER_THAN_DROPDOWN = "months";
	public static final String YEARS_OLDER_THAN_DROPDOWN = "years";
	public static final String DELETE_BUTTON = "Delete";
	public static final String RETENTION_POLICIES_PARAGRAPH = "When applying data retention policies, disk space is freed up for re-use by the database. "
			+ "It is only returned to the operating system during maintenance at the end of each week. This can also be done manually using the Reclaim "
			+ "Disk Space button below. This operation cannot be un-done, and may take several hours to run, with import paused during that time.";
	public static final String APPLY_RETENTION_POLICIES_BUTTON = "Apply Retention Policies";
	public static final String RECLAIM_DISC_SPACE_BUTTON = "Reclaim Disk Space";
	
	//################################ CHANGE SETTINGS #################################
	public static final String CHANGE_SETTINGS_LINK = "Change settings";
	public static final String DATABASE_SETTINGS = "Database Settings";
	public static final String DATABASE_SETTINGS_PARAGRAPH = "Choose what type of database InterMapper Database should send data to.  "
			+ "You can choose 'built-in' to use the integrated PostgreSQL database, or connect to a PostgreSQL server on your network.";
	public static final String DATABASE_TYPE = "Database Type:";
	public static final String BUILT_IN_DATABASE_TYPE = "Built-In";
	public static final String POSTGRE_SQL_DATABASE_TYPE = "PostgreSQL";
	public static final String INTERNAL_DATABASE_USERS = "Internal Database Users ";
	public static final String INTERNAL_DATABASE_SHOW_HIDE_HELP = "helplink_dbusers";
	public static final String INTERNAL_DATABASE_HIDE_HELP = "[ hide help ]";
	public static final String SETTINGS_CREATE_BUTTON = "Create";
	public static final String SETTINGS_DELETE_BUTTON = "Delete";
	public static final String USER_LIST_CREATE_BUTTON = "Create";
	public static final String USER_LIST_DELETE_BUTTON = "Delete";
	
	public static final String CREATE_BOLD = "Create:";
	public static final String CREATE_PARAGRAPH = " Create a new un-named user entry.";
	public static final String DELETE_BOLD = "Delete:";
	public static final String DELETE_PARAGRAPH = " Remove the currently-selected user entry.";
	public static final String USERNAME_BOLD = "Username:";
	public static final String USERNAME_PARAGRAPH = " The username for this user.";
	public static final String PASSWORD_BOLD = "Password:";
	public static final String PASSWORD_PARAGRAPH = " The password for this user.";
	public static final String WRITE_ACCESS_BOLD = "Write Access:";
	public static final String WRITE_ACCESS_PARAGRAPH = " By default, users can only read from the database.  Check this box if you need "
			+ "write access, but be aware that making changes to the database contents could corrupt your data.";
	public static final String REMOTE_LOGIN_BOLD = "Remote Login:";
	public static final String REMOTE_LOGIN_PARAGRAPH = " By default, the built-in PostgreSQL only accepts connections from localhost. "
			+ "By checking this box, PostgreSQL is set to listen on all addresses, and remote login permissions are added for this user.";
	
	public static final String SETTINGS_USERNAME = "Username:";
	public static final String SETTINGS_PASSWORD = "Password:";
	public static final String RE_ENTER_PASSWORD = "Re-Enter Password:";
	public static final String WRITE_ACCESS = "Write Access:";
	public static final String REMOTE_LOGIN = "Remote Login:";
	public static final String SETTINGS_SAVE_BUTTON = "Save Changes";
	
	//################################ REPORTS PAGE #################################
	public static final String REPORTS_VIEW_REPORTS = "View Reports";
	public static final String CHART_DATA_FOR_DEVICES_TITLE = "Chart Data for Devices";
	public static final String CHART_OF_DATA_FOR_ONE_OR_MORE_DEVICES_SUMMARY = "Chart Of Data For One Or More Devices";
	public static final String CREATE_A_NEW_REPORT = "Create a new report";
	public static final String SELECT_A_REPORT_TEMPLATE = "Select a report template, then configure its options, or use the button below to create a fresh report.";
	public static final String REPORT_SUMMARY_1 = "This report creates a chart of data collected by InterMapper for a set of devices.";
	public static final String REPORT_SUMMARY_2 = "Which devices would you like to include in the chart, and what dataset and time period are you charting?";
	public static final String DEVICES_DROPDOWN_TITLE = "Devices";
	public static final String DATASET_DROPDOWN_TITLE = "Dataset";
	public static final String TIME_PERIOD_DROPDOWN_TITLE = "Time Period";
	public static final String ALL_DEVICES_DROPDOWN = "All Devices";
	public static final String DROPDOWN_ALL_DEVICES = "All Devices";
	public static final String DROPDOWN_DEVICES_ON_MAP = "Devices on map...";
	public static final String DROPDOWN_DEVICES_IN_STATE = "Devices in state...";
	public static final String DROPDOWN_DEVICES_WITH = "Devices with...";
	public static final String DROPDOWN_SPECIFIC_DEVICES = "Specific Devices";
	public static final String DROPDOWN_DEVICES_ON_MAP_DEMO_1 = "Demo Co-op Wireless";
	public static final String DROPDOWN_DEVICES_ON_MAP_DEMO_2 = "Demo Main Map";
	public static final String DROPDOWN_DEVICES_ON_MAP_DEMO_3 = "Demo Network Operations";
	public static final String DROPDOWN_DEVICES_ON_MAP_DEMO_4 = "Demo Office Location";
	public static final String DROPDOWN_DEVICES_ON_MAP_DEMO_STATE_ACTIVE = "ui-noselect imdc-combo-entry imdc-combo-entry-with-subtitle imdc-combo-entry-with-check ui-state-active";
	public static final String DROPDOWN_DEVICES_IN_STATE_DOWN = "Down";
	public static final String DROPDOWN_DEVICES_IN_STATE_CRITICAL = "Critical";
	public static final String DROPDOWN_DEVICES_IN_STATE_ALARM = "Alarm";
	public static final String DROPDOWN_DEVICES_IN_STATE_WARNING = "Warning";
	public static final String DROPDOWN_DEVICES_IN_STATE_OKAY = "Okay";
	public static final String DROPDOWN_DEVICES_IN_STATE_UNKNOWN = "Unknown";
	public static final String DROPDOWN_DEVICES_IN_STATE_ACKNOWLEDGED = "Acknowledged";
	public static final String DROPDOWN_DEVICES_WITH_TYPE_SNMP = "Type SNMP";
	public static final String AVAILABILITY_DROPDOWN = "Availability (%)";
	public static final String DROPDOWN_AVAILABILITY_RESPONSE_TIME = "Response time (ms)";
	public static final String DROPDOWN_AVAILABILITY_SHORT_TERM_PACKET_LOSS = "Short-term packet loss (%)";
	public static final String PREVIOUS_24_HOURS_DROPDOWN = "Previous 24 hours";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_PREVIOUS = "Previous";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_TO_DATE = "...to Date";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_SPECIFIC_DATE = "Specific date";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_ALL_DATES_BEFORE = "All dates before";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_ALL_DATES_AFTER = "All dates after";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_DATE_RANGE = "Date range";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_DAY = "Day";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_WEEK = "Week";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_MONTH = "Month";
	public static final String DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_YEAR = "Year";
	public static final String DISPLAY_THE_RESULTS = "How would you like to display the results?";
	public static final String DISPLAY_AS_DROPDOWN_TITLE = "Display As";
	public static final String DISPLAY_AS_DROPDOWN_LINE_CHART = "Line Chart";
	public static final String DISPLAY_AS_DROPDOWN_TABLE = "Table";
	public static final String KEEP_IN_MIND_PARAGRAPH = "Keep in mind that the more devices you have selected, and the wider the time period, the longer the report will take to run.";
	public static final String SAVED_REPORTS_BUTTON = "Saved Reports";
	public static final String CREATE_REPORT_BUTTON = "Create Report";
	public static final String FILE_MENU_BUTTON = "File";
	public static final String FILE_MENU_SAVE_BUTTON = "Save";
	
	public static final String SAVE_THE_CURRENT_REPORT_HEADER = "Save the current report";
	public static final String SELECT_AN_EXISTING_REPORT_PARAGRAPH = "Select an existing report to overwrite it, or enter a name in the field below to create a new saved report.";
	public static final String REPORT_TITLE = "Average Availability (%) for 46 devices";
	public static final String REPORT_SUMMARY = "Average Availability (%) for 46 devices";
	public static final String REPORT_PARAGRAPH = "Showing previous 24 hours for 46 devices on 4 maps";
	public static final String REPORT_NAME = "Report Name";
	public static final String CANCEL_BUTTON = "Cancel";
	public static final String DELETE_BUTTON_REPORT = "Delete";
	public static final String SAVE_REPORT_BUTTON = "Save Report";
	
	//Chart Data for Interfaces
	public static final String CHART_DATA_FOR_INTERFACES = "Chart Of Data For One Or More Interfaces";
	
	// ################################ LOGOUT ################################
	public static final String LOGOUT_BUTTON = "Log Out";
	public static final String LOGIN_HEADER = "Login";
	public static final String LOGIN_USERNAME = "Username:";
	public static final String LOGIN_PASSWORD = "Password:";
	public static final String LOGIN_BUTTON = "Login";
	public static final String LOGOUT_MESSAGE = "You have been logged out of the InterMapper DataCenter web admin interface.";
	public static final String INTERMAPPER_AUTHENTICATION_SERVER = "InterMapper Authentication Server";
	public static final String INTERMAPPER_DATABASE = "InterMapper Database";
	public static final String INTERMAPPER_REPORTS = "InterMapper Reports";
	public static final String IMDC_APP_TITLE = "imdc-app-title";
	public static final String IMAUTH = "imauth";
	public static final String STATUS = "Status: ";
	public static final String NOT_YET_CONFIGURED = "not yet configured";
	public static final String RUNNING = "running";
	public static final String CLICK = "Click";
	public static final String CONFIGURE = "Configure";
	public static final String AUTH_DIRECTORY_INFO = " to set up the connection to the auth directory.";
	public static final String IMDC_APP_BUTTONS = "imdc-app-buttons";
	public static final String AUTH_CONFIGURE_BUTTON_URL = "https://" + HOST + ":8182/~imauth/firststart.html";
	public static final String IMDATABASE = "imdatabase";
	public static final String IMREPORTS = "imreports";
	public static final String IMDB_RUNNING_INFO = "Connected to internal database; 1 server is reporting.";
	public static final String STOP = "stop";
	public static final String START = "start";
	public static final String IMREPORTS_INFO = "InterMapper Database is running and providing data for Reports.";
	public static final String VIEW_REPORTS = "View Reports";
	public static final String VIEW_THE_LOG = "View the log";
	public static final String OVERVIEW = "Overview";
	public static final String MAINTENANCE = "Maintenance";
	public static final String CHANGE_SETTINGS = "Change settings";
	public static final String MORE_DETAILS = "More Details";	
	public static final String VIEW_THE_LOG_BUTTON_URL = "https://" + HOST + ":8182/logview.html?appName=imdatabase";
	public static final String OVERVIEW_BUTTON_URL = "https://" + HOST + ":8182/~imdatabase/index.html";
	public static final String MAINTENANCE_BUTTON_URL = "https://" + HOST + ":8182/~imdatabase/maintenance.html";
	public static final String CHANGE_SETTINGS_BUTTON_URL = "https://" + HOST + ":8182/~imdatabase/database.html";
	public static final String MORE_DETAILS_BUTTON_URL = "\"JavaScript:toggleDetails('imdatabase');\"";
	public static final String VIEW_REPORTS_BUTTON_URL = "https://" + HOST + ":8182/~imreports/";
	public static final String ALERT_BOX = "InterMapper DataCenter can automatically notify you via E-Mail when it detects problems or errors. To configure SMTP settings and enable this feature, visit the ";
	public static final String SETTINGS = "Settings";
	public static final String SETTINGS_URL = "https://" + HOST + ":8182/settings.html";
	public static final String DONT_SHOW_REMINDER = "Do not show this reminder again";
	public static final String STOPPED = "stopped";
	public static final String IMDB_IS_NOT_RUNNING = "IMDatabase is not running; click ";
	public static final String BEGIN_IMPORT = " to begin importing data again.";
	public static final String IMREPORTS_STOPPED = "InterMapper Reports requires InterMapper Database to be running.";
	public static final String HOME = "Home";	
	
	// ################################## SETTINGS #########################################
	public static final String INTERMAPPER_DATACENTER_SETTINGS = "InterMapper DataCenter Settings";
	public static final String DATACENTER_ADMINISTRATOR_ACCOUNT = "DataCenter Administrator Account ";
	public static final String IMDC_SETTINGS_WEB_ADMIN_INFO = "This username and password are used by IMDC Web Admin and the InterMapper server to log into IMDC.";
	public static final String HELP_LINK = "helplink";
	public static final String SHOW_HELP = "[ show help ]";
	public static final String USERNAME = "Username:";
	public static final String PASSWORD = "Password:";
	public static final String CONFIRM_PASSWORD = "Confirm Password:";
	public static final String SKIP_AUTH_LOCAL = "Skip authentication for local connections";
	public static final String LANGUAGE_TITLE = "Language";
	public static final String IMDC_SETTINGS_LANGUAGE_INFO = "The language used for messages written to log files and sent to InterMapper servers.";
	public static final String LANGUAGE = "Language:";
	public static final String ERROR_REPORTING = "Error Reporting ";
	public static final String ERROR_REPORTING_INFO = "If you configure SMTP settings, IMDC can send you E-mail when problems arise, and (optionally) submit reports to HelpSystems. You must enter a Primary SMTP Host, and a From: address to enable this feature.";
	public static final String PRIMARY_SMTP = "Primary SMTP";
	public static final String HOST_SETTINGS = "Host:";
	public static final String FROM_ADDRESS = "From Address:";
	public static final String BACKUP_SMTP = "Back-up SMTP";
	public static final String PORT_FIELD = "Port:";	
	public static final String TEST_ADDRESS = "Test Address:";	
	public static final String SEND_EMAIL_TO = "On errors, send E-mail to:";
	public static final String BUG_REPORTS= "Automatically E-mail bug reports to HelpSystems";	
	public static final String SEND_TEST_EMAIL = "Send Test E-mail";	
	public static final String TEST_EMAIL_WRONG_FORMAT = "text";
	public static final String TEST_EMAIL_CORRECT_FORMAT = "hsnightlybuilds@gmail.com";
	public static final String TEST_PASSWORD_123 = "123";
	public static final String TEST_PASSWORD_1234 = "1234";
	public static final String SAVE_CHANGES = "Save Changes";
	public static final String PASSWORD_DO_NOT_MATCH = "The password and confirmed password do not match; please re-type them to make sure they are correct.";
	public static final String FINISHED_SAVING_IMDC_SETTINGS = "Finished saving InterMapper DataCenter settings.";	
	public static final String NO_MAIL_SERVER_SPECIFIED_MESSAGE ="Unable to send a test E-Mail to "+TEST_EMAIL_CORRECT_FORMAT+"; no mail servers have been specified.";
	public static final String WRONG_TEST_ADDRESS_ALERT = "The test E-Mail address is not in the proper address@host format.";
	public static final String SMTP_PPORT = "smtp_pport";
	public static final String SMTP_TESTMAIL = "smtp_testemail";
	public static final String PRIMARY_SMTP_PORT_ALERT = "The primary SMTP port must be a number from 1 to 65535.";
	public static final String BACKUP_SMTP_PORT_ALERT = "The back-up SMTP port must be a number from 1 to 65535.";
	public static final String NO_FROM_ADDRESS_ALERT = "When you set an SMTP server, you must supply a properly-formed From: email address.";
	public static final String SMTP_SPORT = "smtp_sport";
	public static final String DEFAULT_SMTP_PORT = "25";
	public static final String SMTP_HOST="smtp.mail.ru";
	public static final String SMTP_PHOST = "smtp_phost";
	public static final String SMTP_FADDRESS = "smtp_faddress";	
	public static final String CONNECTIONS ="Connections ";
	public static final String CONNECTIONS_INFO = "IMDC will use a default SSL certificate, but you can increase the level of security by creating your own and uploading it here.";
	public static final String NEW_CERT_CREATED_ALERT = "A new key and certificate have been created. You must restart the server for the changes to take effect. All active connections will be dropped, so you can either do this manually, later, or ";
    public static final String EN = "en";
    public static final String ES = "es";
    public static final String JA = "ja";
    public static final String ZH_HANS = "zh_Hans";
    public static final String ENGLISH = "English";
    public static final String ESPANOL = "Español";
    public static final String JAPANESE = "日本語";
    public static final String CHINESE = "简体中文";
    public static final String OVERRIDE_LANGUAGE = "\"Override the browser's language for web pages\"";
    public static final String TEST_USERNAME = "test";
    public static final String USERNAME_FIELD_NAME = "username";
    
    // ######################################### MANAGE APPS ######################################    
    public static final String MANAGE_DATACENTER_APPS = "Manage DataCenter Apps";
    public static final String INSTALLED_APPS = "Installed apps";
    public static final String ABOUT_IMAUTH_APP = "An add-on that allows InterMapper to use authentication directories, including LDAP, RADIUS, ActiveDirectory, IAS and Kerberos, to authenticate users.";
    public static final String ABOUT_IMDB_APP = "Collects events, datapoints and lists of maps, devices and interfaces from one or more InterMapper servers, and inserts this data into an SQL database.";
    public static final String ABOUT_IMREPORTS_APP = "A tool used to create custom reports across one or more InterMapper servers, using the data collected by InterMapper database.";
    public static final String IMAUTH_ICON_SRC = "https://" + HOST + ":"+PORT+"/~imauth/images/icon.png";
    public static final String IMDB_ICON_SRC = "https://" + HOST + ":"+PORT+"/~imdatabase/images/icon.png";
    public static final String IMREPORTS_ICON_SRC = "https://" +HOST +":"+PORT+"/~imreports/images/icon.png";
    public static final String REMOVE_APP_ALERT_TEXT = "Are you sure you want to remove the IMAuth app?";
    public static final String AVAILABLE_APPS = "Available Apps";
    
}
	
	
	
	
	
