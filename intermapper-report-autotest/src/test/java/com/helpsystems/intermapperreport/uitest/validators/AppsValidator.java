package com.helpsystems.intermapperreport.uitest.validators;

import com.helpsystems.common.util.TestUtils;
import static com.helpsystems.intermapperreport.uitest.utils.LocatorsConstants.*;
import static com.helpsystems.intermapperreport.uitest.utils.UiDataConstants.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * class for Apps page validation.
 * 
 * @author Anzhela Sarukhanyan
 * 
 */
public class AppsValidator extends InterMapperReportBaseValidator {
	/**
	 * 
	 * @param testUtils
	 */
	public AppsValidator(TestUtils testUtils) {
		super(testUtils);
	}
	
	
	/**
	 * Method to validate name links/labels on InterMapper DataCenter Apps page.
	 * 
	 * @throws InterruptedException
	 */
	public void validateAppsPage() throws InterruptedException {
		
		testUtils.waitByXpath(String.format(APP_STATUS_XPATH, IMAUTH, STATUS, NOT_YET_CONFIGURED));		
		testUtils.waitByXpath(String.format(APP_INFO_XPATH, IMDB_RUNNING_INFO));
		testUtils.waitByXpath(String.format(APP_STATUS_XPATH, IMDATABASE, STATUS, RUNNING));
		testUtils.getElementByXPath(String.format(APP_TITLE_XPATH, INTERMAPPER_AUTHENTICATION_SERVER));
		testUtils.getElementByXPath(AUTH_APP_INFO_CLICK_SELECTOR);
		testUtils.getElementByXPath(AUTH_APP_INFO_DIRECTORY_SELECTOR);
		testUtils.getElementByXPath(AUTH_APP_INFO_CONFIGURE_SELECTOR);
		testUtils.getElementByXPath(String.format(APPS_LINK_ITEMS_XPATH, CONFIGURE, AUTH_CONFIGURE_BUTTON_URL));		
		testUtils.getElementByXPath(String.format(APP_TITLE_XPATH, INTERMAPPER_DATABASE));		
		testUtils.getElementByXPath(String.format(IMDB_STOP_START_BUTTON_XPATH, STOP));		
		testUtils.getElementByXPath(String.format(APPS_LINK_ITEMS_XPATH, VIEW_THE_LOG, VIEW_THE_LOG_BUTTON_URL));
		testUtils.getElementByXPath(String.format(APPS_LINK_ITEMS_XPATH, OVERVIEW, OVERVIEW_BUTTON_URL));
		testUtils.getElementByXPath(String.format(APPS_LINK_ITEMS_XPATH, MAINTENANCE, MAINTENANCE_BUTTON_URL));
		testUtils.getElementByXPath(String.format(APPS_LINK_ITEMS_XPATH, CHANGE_SETTINGS, CHANGE_SETTINGS_BUTTON_URL));
		testUtils.getElementByXPath(String.format(MORE_DETAILS_BUTTON_XPATH, MORE_DETAILS, MORE_DETAILS_BUTTON_URL));		
		testUtils.getElementByXPath(String.format(APP_TITLE_XPATH, INTERMAPPER_REPORTS));
		testUtils.getElementByXPath(String.format(APP_STATUS_XPATH, IMREPORTS, STATUS, RUNNING));
		testUtils.getElementByXPath(String.format(APP_INFO_XPATH, IMREPORTS_INFO));
		testUtils.getElementByXPath(String.format(APPS_LINK_ITEMS_XPATH, VIEW_REPORTS, VIEW_REPORTS_BUTTON_URL));
	}
	
	/**
	 * Method to validate name links/labels on InterMapper DataCenter Apps page when the IMDB is stopped.
	 * 
	 * @throws InterruptedException
	 */
	public void validateAppsPageStopped() throws InterruptedException {
		testUtils.waitByXpath(String.format(APP_STATUS_XPATH, IMDATABASE, STATUS, STOPPED));
		testUtils.waitByXpath(String.format(APP_STATUS_XPATH, IMREPORTS, STATUS, STOPPED));
		testUtils.getElementByXPath(String.format(APP_TITLE_XPATH, INTERMAPPER_AUTHENTICATION_SERVER));
		testUtils.getElementByXPath(String.format(APP_STATUS_XPATH, IMAUTH, STATUS, NOT_YET_CONFIGURED));		
		testUtils.getElementByXPath(AUTH_APP_INFO_CLICK_SELECTOR);
		testUtils.getElementByXPath(AUTH_APP_INFO_DIRECTORY_SELECTOR);
		testUtils.getElementByXPath(AUTH_APP_INFO_CONFIGURE_SELECTOR);
		testUtils.getElementByXPath(String.format(APPS_LINK_ITEMS_XPATH, CONFIGURE, AUTH_CONFIGURE_BUTTON_URL));		
		testUtils.getElementByXPath(String.format(APP_TITLE_XPATH, INTERMAPPER_DATABASE));
		testUtils.getElementByXPath(String.format(IMDB_STOP_START_BUTTON_XPATH, START));
		testUtils.getElementByXPath(String.format(APP_INFO_XPATH, IMDB_IS_NOT_RUNNING));
		testUtils.getElementByXPath(String.format(APP_INFO_XPATH, BEGIN_IMPORT));
		testUtils.getElementByXPath(String.format(ITALIC_TEXT, START));
		testUtils.getElementByXPath(String.format(APPS_LINK_ITEMS_XPATH, VIEW_THE_LOG, VIEW_THE_LOG_BUTTON_URL));
		testUtils.getElementByXPath(String.format(APP_TITLE_XPATH, INTERMAPPER_REPORTS));
		testUtils.getElementByXPath(String.format(APP_INFO_XPATH, IMREPORTS_STOPPED));
		
		
	}
	/**
	 * Method to validate name links/labels on Manage Apps page
	 * 
	 * @throws InterruptedException
	 */
	public void validateManageAppsPage() throws InterruptedException {
		testUtils.waitByXpath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, MANAGE_DATACENTER_APPS));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INSTALLED_APPS));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INTERMAPPER_AUTHENTICATION_SERVER));			
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INTERMAPPER_DATABASE));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INTERMAPPER_REPORTS));		
		testUtils.getElementByXPath(String.format(MANAGE_APPS_INFO_XPATH, ABOUT_IMAUTH_APP));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_INFO_XPATH, ABOUT_IMDB_APP));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_INFO_XPATH, ABOUT_IMREPORTS_APP));		
		testUtils.getElementByXPath(String.format(APP_ICONS_XPATH, IMAUTH_ICON_SRC));
		testUtils.getElementByXPath(String.format(APP_ICONS_XPATH, IMDB_ICON_SRC));
		testUtils.getElementByXPath(String.format(APP_ICONS_XPATH, IMREPORTS_ICON_SRC));
		testUtils.getElementByXPath(REMOVE_AUTH_BUTTON_XPATH);
		testUtils.getElementByXPath(REMOVE_IMDB_BUTTON_XPATH);
		testUtils.getElementByXPath(REMOVE_IMREPORTS_BUTTON_XPATH);
	}
	
	/**
	 * Method to validate Manage Apps page when IMAuth app was removed
	 * @throws InterruptedException
	 */
	public void validateAuthAppRemoved() throws InterruptedException {
		testUtils.waitByXpath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, MANAGE_DATACENTER_APPS));		
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INSTALLED_APPS));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, AVAILABLE_APPS));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INTERMAPPER_AUTHENTICATION_SERVER));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INTERMAPPER_DATABASE));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INTERMAPPER_REPORTS));		
		testUtils.getElementByXPath(String.format(MANAGE_APPS_INFO_XPATH, ABOUT_IMAUTH_APP));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_INFO_XPATH, ABOUT_IMDB_APP));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_INFO_XPATH, ABOUT_IMREPORTS_APP));
		testUtils.getElementByXPath(String.format(APP_ICONS_XPATH, IMDB_ICON_SRC));
		testUtils.getElementByXPath(String.format(APP_ICONS_XPATH, IMREPORTS_ICON_SRC));
		testUtils.getElementByXPath(INSTALL_AUTH_BUTTON_XPATH);
		testUtils.getElementByXPath(REMOVE_IMDB_BUTTON_XPATH);
		testUtils.getElementByXPath(REMOVE_IMREPORTS_BUTTON_XPATH);
		assertTrue("The 'Remove' button exists for Auth app", testUtils.getElementsByXPath(REMOVE_AUTH_BUTTON_XPATH).isEmpty());
		assertTrue("The icon exists for Auth app", testUtils.getElementsByXPath(String.format(APP_ICONS_XPATH, IMAUTH_ICON_SRC)).isEmpty());
		
	}
	
	/**
	 * Method to validate Remove App alert message
	 * @throws InterruptedException
	 */
	public void validateRemoveAppAlert() throws InterruptedException {
		assertEquals(REMOVE_APP_ALERT_TEXT, getAlertText());	
	}
	
	/**
	 * Method to validate Manage Apps page when IMDB app was removed
	 * @throws InterruptedException
	 */
	public void validateImdbAppRemoved() throws InterruptedException {
		testUtils.waitByXpath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, MANAGE_DATACENTER_APPS));		
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INSTALLED_APPS));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, AVAILABLE_APPS));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INTERMAPPER_AUTHENTICATION_SERVER));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INTERMAPPER_DATABASE));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INTERMAPPER_REPORTS));		
		testUtils.getElementByXPath(String.format(MANAGE_APPS_INFO_XPATH, ABOUT_IMAUTH_APP));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_INFO_XPATH, ABOUT_IMDB_APP));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_INFO_XPATH, ABOUT_IMREPORTS_APP));
		testUtils.getElementByXPath(String.format(APP_ICONS_XPATH, IMAUTH_ICON_SRC));
		testUtils.getElementByXPath(String.format(APP_ICONS_XPATH, IMREPORTS_ICON_SRC));
		testUtils.getElementByXPath(REMOVE_AUTH_BUTTON_XPATH);
		testUtils.getElementByXPath(INSTALL_IMDB_BUTTON_XPATH);
		testUtils.getElementByXPath(REMOVE_IMREPORTS_BUTTON_XPATH);
		assertTrue("The 'Remove' button exists for IMDB app", testUtils.getElementsByXPath(REMOVE_IMDB_BUTTON_XPATH).isEmpty());
		assertTrue("The icon exists for IMDB app", testUtils.getElementsByXPath(String.format(APP_ICONS_XPATH, IMDB_ICON_SRC)).isEmpty());
		
	}
	
	/**
	 * Method to validate Manage Apps page when IM Reports app was removed
	 * @throws InterruptedException
	 */
	public void validateReportsAppRemoved() throws InterruptedException {
		testUtils.waitByXpath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, MANAGE_DATACENTER_APPS));		
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INSTALLED_APPS));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, AVAILABLE_APPS));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INTERMAPPER_AUTHENTICATION_SERVER));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INTERMAPPER_DATABASE));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INTERMAPPER_REPORTS));		
		testUtils.getElementByXPath(String.format(MANAGE_APPS_INFO_XPATH, ABOUT_IMAUTH_APP));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_INFO_XPATH, ABOUT_IMDB_APP));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_INFO_XPATH, ABOUT_IMREPORTS_APP));
		testUtils.getElementByXPath(String.format(APP_ICONS_XPATH, IMAUTH_ICON_SRC));
		testUtils.getElementByXPath(String.format(APP_ICONS_XPATH, IMDB_ICON_SRC));
		testUtils.getElementByXPath(REMOVE_AUTH_BUTTON_XPATH);
		testUtils.getElementByXPath(INSTALL_IMREPORTS_BUTTON_XPATH);
		testUtils.getElementByXPath(REMOVE_IMDB_BUTTON_XPATH);
		assertTrue("The 'Remove' button exists for IM Reports app", testUtils.getElementsByXPath(REMOVE_IMREPORTS_BUTTON_XPATH).isEmpty());
		assertTrue("The icon exists for IM Reports app", testUtils.getElementsByXPath(String.format(APP_ICONS_XPATH, IMREPORTS_ICON_SRC)).isEmpty());	
	}
	
	/**
	 * Method to validate name links/labels on Manage Apps page when all apps were removed
	 * 
	 * @throws InterruptedException
	 */
	public void validateManageAppsPageAllAppsRemoved() throws InterruptedException {
		testUtils.waitByXpath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, MANAGE_DATACENTER_APPS));				
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, AVAILABLE_APPS));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INTERMAPPER_AUTHENTICATION_SERVER));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INTERMAPPER_DATABASE));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INTERMAPPER_REPORTS));		
		testUtils.getElementByXPath(String.format(MANAGE_APPS_INFO_XPATH, ABOUT_IMAUTH_APP));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_INFO_XPATH, ABOUT_IMDB_APP));
		testUtils.getElementByXPath(String.format(MANAGE_APPS_INFO_XPATH, ABOUT_IMREPORTS_APP));
		testUtils.getElementByXPath(INSTALL_AUTH_BUTTON_XPATH);
		testUtils.getElementByXPath(INSTALL_IMDB_BUTTON_XPATH);
		testUtils.getElementByXPath(INSTALL_IMREPORTS_BUTTON_XPATH);
		assertTrue("Installed Apps is shown", testUtils.getElementsByXPath(String.format(MANAGE_APPS_PAGE_TEXTS_XPATH, INSTALLED_APPS)).isEmpty());
		assertTrue("The 'Remove' button exists for IM Reports app", testUtils.getElementsByXPath(REMOVE_IMREPORTS_BUTTON_XPATH).isEmpty());
		assertTrue("The 'Remove' button exists for IM Auth app", testUtils.getElementsByXPath(REMOVE_AUTH_BUTTON_XPATH).isEmpty());
		assertTrue("The 'Remove' button exists for IMDB app", testUtils.getElementsByXPath(REMOVE_IMDB_BUTTON_XPATH).isEmpty());
		assertTrue("The icon exists for IM Reports app", testUtils.getElementsByXPath(String.format(APP_ICONS_XPATH, IMREPORTS_ICON_SRC)).isEmpty());	
		assertTrue("The icon exists for IM Auth app", testUtils.getElementsByXPath(String.format(APP_ICONS_XPATH, IMAUTH_ICON_SRC)).isEmpty());
		assertTrue("The icon exists for IMDB app", testUtils.getElementsByXPath(String.format(APP_ICONS_XPATH, IMDB_ICON_SRC)).isEmpty());
	}
	
	/**
	 * Method to validate name links/labels on InterMapper DataCenter Apps page when IM Auth app is removed. 
	 * 
	 * @throws InterruptedException
	 */
	public void validateAppsPageAuthAppRemoved() throws InterruptedException {		
		testUtils.waitByXpath(String.format(APP_TITLE_XPATH, INTERMAPPER_DATABASE));			
		testUtils.getElementByXPath(String.format(APP_TITLE_XPATH, INTERMAPPER_REPORTS));
		assertTrue(testUtils.getElementsByXPath(String.format(APP_TITLE_XPATH, INTERMAPPER_AUTHENTICATION_SERVER)).isEmpty());	
	}
	
	/**
	 * Method to validate name links/labels on InterMapper DataCenter Apps page when IMDB app is removed. 
	 * 
	 * @throws InterruptedException
	 */
	public void validateAppsPageIMDBAppRemoved() throws InterruptedException {		
		testUtils.waitByXpath(String.format(APP_TITLE_XPATH, INTERMAPPER_AUTHENTICATION_SERVER));			
		testUtils.getElementByXPath(String.format(APP_TITLE_XPATH, INTERMAPPER_REPORTS));
		assertTrue(testUtils.getElementsByXPath(String.format(APP_TITLE_XPATH, INTERMAPPER_DATABASE)).isEmpty());	
	}
	
	/**
	 * Method to validate name links/labels on InterMapper DataCenter Apps page when IM Reports app is removed. 
	 * 
	 * @throws InterruptedException
	 */
	public void validateAppsPageReportsAppRemoved() throws InterruptedException {		
		testUtils.waitByXpath(String.format(APP_TITLE_XPATH, INTERMAPPER_DATABASE));			
		testUtils.getElementByXPath(String.format(APP_TITLE_XPATH, INTERMAPPER_AUTHENTICATION_SERVER));
		assertTrue(testUtils.getElementsByXPath(String.format(APP_TITLE_XPATH, INTERMAPPER_REPORTS)).isEmpty());	
	}
	
	/**
	 * Method to validate name links/labels on InterMapper DataCenter Apps page when all app were removed. 
	 * 
	 * @throws InterruptedException
	 */
	public void validateAppsPageAllAppsRemoved() throws InterruptedException {		
		assertTrue(testUtils.getElementsByXPath(String.format(APP_TITLE_XPATH, INTERMAPPER_AUTHENTICATION_SERVER)).isEmpty());	
		assertTrue(testUtils.getElementsByXPath(String.format(APP_TITLE_XPATH, INTERMAPPER_DATABASE)).isEmpty());	
		assertTrue(testUtils.getElementsByXPath(String.format(APP_TITLE_XPATH, INTERMAPPER_REPORTS)).isEmpty());	
	}
}