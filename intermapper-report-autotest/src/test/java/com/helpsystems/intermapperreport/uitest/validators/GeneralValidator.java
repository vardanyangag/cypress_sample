package com.helpsystems.intermapperreport.uitest.validators;

import static com.helpsystems.intermapperreport.uitest.utils.LocatorsConstants.*;
import com.helpsystems.common.util.TestUtils;
public class GeneralValidator extends InterMapperReportBaseValidator {

	/**
	 * 
	 * @param testUtils
	 */
	
	public GeneralValidator(TestUtils testUtils) {
		super(testUtils);
	}

	/**
	 * A method to click on the Log out text-link to log out from the reports server
	 * @throws InterruptedException
	 */

	public void clickOnLogOutTextlink() throws InterruptedException {
		testUtils.getElementByXPath(HOME_LOG_OUT_XPATH).click();
	}

	/**
	 * A method to validate the Log page items
	 * @throws InterruptedException
	 */

	public void validateLogOutItems() throws InterruptedException {
		testUtils.getElementByXPath(LOGIN_HEADER_XPATH);
		testUtils.getElementByXPath(LOGIN_USERNAME_XPATH);
		testUtils.getElementByXPath(LOGIN_PASSWORD_XPATH);
		testUtils.getElementByXPath(LOGIN_BUTTON_XPATH);
		testUtils.getElementByXPath(LOGOUT_MESSAGE_XPATH);
		testUtils.getElementByXPath(LOGOUT_MESSAGE_X_BUTTON_XPATH);
	}

	/**
	 * Method to click Log button. 
	 * 
	 * @throws InterruptedException
	 */

	public void clickOnLogButton() throws InterruptedException {
		testUtils.waitByXpath(HOME_LOG_TAB_XPATH);
		testUtils.getElementByXPath(HOME_LOG_TAB_XPATH).click();
	}

	/**
	 * Method to validate Log page items. 
	 * 
	 * @throws InterruptedException
	 */
	
	public void validateLogPageItems() throws InterruptedException {
		testUtils.getElementByXPath(HOME_LOG_TAB_XPATH);
		testUtils.getElementByXPath(IMDC_LOG_FILE_XPATH);
		testUtils.getElementByXPath(CLICK_TO_DOWNLOAD_THE_FULL_LOG_XPATH);
		testUtils.getElementByXPath(LOG_LEVEL__XPATH);
		testUtils.getElementByXPath(REFRESH_SECONDS_XPATH);
		testUtils.getElementByXPath(LINES_XPATH);
		testUtils.getElementByXPath(SAVE_BUTTON_XPATH);
		
		}
	
	/**
	 * A method to click on the Report a bug to open the page
	 * @throws InterruptedException
	 */

	public void clickOnReportBugButton() throws InterruptedException {
		testUtils.waitByXpath(REPORT_A_BUG_XPATH);
		testUtils.getElementByXPath(REPORT_A_BUG_XPATH).click();
	}


	/**
	 * A method to type in to name field
	 * @param name
	 * @throws InterruptedException
	 */

	public void typeReportBugName(String name) throws InterruptedException {
		inputValue(REPORT_A_BUG_NAME_INPUT_FIELD_XPATH,name);
	}


	/**
	 * A method to type in to phone field
	 * @param phone
	 * @throws InterruptedException
	 */

	public void typeReportBugPhone(String phone) throws InterruptedException {
		inputValue(REPORT_A_BUG_PHONE_INPUT_FIELD_XPATH,phone);
	}	

	/**
	 * A method to type in to email field
	 * @param email
	 * @throws InterruptedException
	 */

	public void typeReportBugEmail(String email) throws InterruptedException {
		inputValue(REPORT_A_BUG_E_MAIL_INPUT_FIELD_XPATH,email);
	}

	/**
	 * A method to type in to subject field
	 * @param subject
	 * @throws InterruptedException
	 */

	public void typeReportBugSubject(String subject) throws InterruptedException {
		inputValue(REPORT_A_BUG_SUBJECT_INPUT_FIELD_XPATH,subject);
	}

	/**
	 * A method to fill Contact information
	 * @param name
	 * @param phone
	 * @param email
	 * @param subject
	 * @throws InterruptedException
	 */

	public void fillContactInformation(String name,String phone,String email,String subject) throws InterruptedException {
		typeReportBugName(name);
		typeReportBugPhone(phone);
		typeReportBugEmail(email);
		typeReportBugSubject(subject);
	}

	/**
	 * A method to validate the Report A Bug items
	 * @throws InterruptedException
	 */

	public void validateReportBugContents() throws InterruptedException {
		testUtils.waitByXpath(REPORT_A_BUG_PAGE_TITLE_XPATH);
		testUtils.waitByXpath(REPORT_A_BUG_INSTRUCTIONS_XPATH);
		testUtils.waitByXpath(REPORT_A_BUG_CONTACT_INFORMATION_TITLE_XPATH);
		testUtils.waitByXpath(REPORT_A_BUG_NAME_FIELD_TITLE_XPATH);
		testUtils.waitByXpath(REPORT_A_BUG_PHONE_FIELD_TITLE_XPATH);
		testUtils.waitByXpath(REPORT_A_BUG_E_MAIL_FIELD_TITLE_XPATH);
		testUtils.waitByXpath(REPORT_A_BUG_SUBJECT_FIELD_TITLE_XPATH);
		testUtils.waitByXpath(REPORT_A_BUG_NAME_INPUT_FIELD_XPATH);
		testUtils.waitByXpath(REPORT_A_BUG_PHONE_INPUT_FIELD_XPATH);
		testUtils.waitByXpath(REPORT_A_BUG_E_MAIL_INPUT_FIELD_XPATH);
		testUtils.waitByXpath(REPORT_A_BUG_SUBJECT_INPUT_FIELD_XPATH);
		testUtils.waitByXpath(REPORT_A_BUG_WHAT_HAPPENED_FIELD_TITLE_XPATH);
		testUtils.waitByXpath(REPORT_A_BUG_WHAT_HAPPENED_INPUT_FIELD_XPATH);

	}

}
