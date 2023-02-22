package com.helpsystems.intermapperreport.uitest.validators;

import static com.helpsystems.intermapperreport.uitest.utils.LocatorsConstants.*;
import static com.helpsystems.intermapperreport.uitest.utils.UiDataConstants.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.openqa.selenium.WebElement;
import com.helpsystems.common.base.BaseValidator;
import com.helpsystems.common.util.TestUtils;

/**
 * Base class for all Validators
 * 
 * @author Anzhela Sarukhanyan
 * 
 */
public class InterMapperReportBaseValidator extends BaseValidator {

	public InterMapperReportBaseValidator(TestUtils testUtils) {
		super(testUtils);
	}

	/**
	 * Method to login Report Server.
	 * 
	 * @param username
	 * @param password
	 * @throws InterruptedException
	 */
	public void login(String username, String password) throws InterruptedException {
		if ((testUtils.getElementsByXPath(LOCALE_CHOOSER_XPATH)).size() > 0) {

			testUtils.getElementByXPath(LOCALE_CHOOSER_ENG_XPATH).click();
			testUtils.getElementByXPath(CONTINUE_BUTTON_XPATH).click();
		}

		else {

			testUtils.waitByXpath(LOGIN_FORM_XPATH, 10);
			testUtils.inputIntoByXpath(USERNAME_XPATH, username);
			testUtils.inputIntoByXpath(PASSWORD_XPATH, password);
			testUtils.getElementByXPath(LOGIN_BUTTON_SELECTOR).click();
			testUtils.waitByXpath(HOME_LINK_XPATH);
		}
	}

	/**
	 * Method to logout from Report Server.
	 * 
	 * @throws InterruptedException
	 */
	public void logout() throws InterruptedException {

		testUtils.getElementByXPath(LOGOUT_BUTTON_SELECTOR).click();

	}

	/**
	 * Method to click on button
	 * 
	 * @param element
	 * @throws InterruptedException
	 */
	public void clickOnItem(String element) throws InterruptedException {

		testUtils.getElementByXPath(element).click();

	}

	/**
	 * Method to open Pages.
	 * 
	 * @param pageName
	 * @throws InterruptedException
	 */
	public void openPage(String pageName) throws InterruptedException {

		testUtils.waitByXpath(String.format(PAGE_NAME_XPATH, pageName));
		testUtils.getElementByXPath(String.format(PAGE_NAME_XPATH, pageName)).click();
	}

	/**
	 * Method to open Settings Page.
	 * 
	 * @throws InterruptedException
	 */
	public void openSettings() throws InterruptedException {

		openPage(SETTINGS);
	}

	/**
	 * Method to open Home Page.
	 * 
	 * @throws InterruptedException
	 */
	public void openHome() throws InterruptedException {

		openPage(HOME);
	}

	/**
	 * Method to enter value in input box.
	 * 
	 * @param element
	 * @param value
	 * @throws InterruptedException
	 */
	public void inputValue(String element, String value) throws InterruptedException {
		WebElement inputfield = testUtils.getElementByXPath(element);
		inputfield.sendKeys(value);

	}

	/**
	 * Method to clear the given input field value
	 * 
	 * @param fieldname
	 * @throws InterruptedException
	 */
	public void clearField(String fieldname) throws InterruptedException {
		testUtils.getElementByXPath(String.format(INPUT_FIELD_XPATH, fieldname)).clear();

	}

	/**
	 * Method to disable 'Skip authentication for local connections' checkbox
	 * 
	 * @throws InterruptedException
	 */
	public void disableLocalAuth() throws Exception {

		ProcessBuilder builder = new ProcessBuilder(CMD_EXE, "/c", IMDC_SERVICE_STOP_COMMAND + "&" + PWRESET_COMMAND
				+ "&" + SET_AUTH_LOCAL_COMMAND + "&" + SET_ADMIN_PASSWORD_COMMAND + "&" + IMDC_SERVICE_START_COMMAND);
		builder.redirectErrorStream(true);
		Process p = builder.start();
		BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		while (true) {
			line = r.readLine();
			if (line == null) {
				break;
			}
			System.out.println(line);
		}
	}

	/**
	 * Method to set default password to Admin user
	 * 
	 * @throws InterruptedException
	 */
	public void setDefaultAdminCredentials() throws Exception {

		ProcessBuilder builder = new ProcessBuilder(CMD_EXE, "/c",
				IMDC_SERVICE_STOP_COMMAND + "&" + SET_ADMIN_PASSWORD_COMMAND + "&" + IMDC_SERVICE_START_COMMAND);
		builder.redirectErrorStream(true);
		Process p = builder.start();
		BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		while (true) {
			line = r.readLine();
			if (line == null) {
				break;
			}
			System.out.println(line);
		}
	}

	/**
	 * Method to open Manage Apps Page.
	 * 
	 * @throws InterruptedException
	 */
	public void openManageApps() throws InterruptedException {

		openPage(MANAGE_APPS);
	}

	/**
	 * Method to get alert message
	 * 
	 * @throws InterruptedException
	 */
	public final String getAlertText() throws InterruptedException {
		return getDriver().switchTo().alert().getText();

	}

	/**
	 * Method to dismiss alert
	 * 
	 * @throws InterruptedException
	 */
	public void dismissAlert() throws InterruptedException {
		getDriver().switchTo().alert().dismiss();

	}

	/**
	 * Method to accept alert
	 * 
	 * @throws InterruptedException
	 */
	public void acceptAlert() throws InterruptedException {
		getDriver().switchTo().alert().accept();

	}
	
	/**
	 * A method to validate Log level dropdown items
	 * 
	 * @throws InterruptedException
	 */
	public void validateLogLevelDropdownItems() throws InterruptedException {
		testUtils.getElementByXPath(FULL_DEBUG_XPATH);
		testUtils.getElementByXPath(CONNECTIONS_XPATH);
		testUtils.getElementByXPath(INFORMATION_XPATH);
		testUtils.getElementByXPath(ERRORS_ONLY_XPATH);
	}
	
	/**
	 * A method to click on Save button to save the settings
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnSaveButton() throws InterruptedException {
		testUtils.getElementByXPath(SAVE_BUTTON_XPATH).click();
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
	 * A method to validate Refresh and Lines values after updating
	 * 
	 * @param refreshValue
	 * @param lineValue
	 * @throws InterruptedException
	 */
	public void validateRefreshLinesItems(String refreshValue, String lineValue) throws InterruptedException {
		testUtils.getElementByXPath(String.format(REFRESH_VALUE_UPDATED_XPATH, refreshValue));
		testUtils.getElementByXPath(String.format(LINES_VALUE_UPDATED_XPATH, lineValue));
	}
}