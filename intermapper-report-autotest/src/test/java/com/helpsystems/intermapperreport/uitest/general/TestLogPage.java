package com.helpsystems.intermapperreport.uitest.general;

import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.DEFAULT_PASSWORD;
import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.DEFAULT_USERNAME;
import static com.helpsystems.intermapperreport.uitest.utils.LocatorsConstants.*;
import static com.helpsystems.intermapperreport.uitest.utils.UiDataConstants.*;
import com.helpsystems.intermapperreport.uitest.base.GeneralBaseTest;
import com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants;

/**
 * class for testing all elements in the IMDC Log page
 * 
 * @author Armen Torunyan
 * 
 */
public class TestLogPage extends GeneralBaseTest {
	
	private static final String REFRESH_VALUE = "1";
	private static final String LINES_VALUE = "10";
	
	@Override
	public void init() throws Exception {
		interMapperReportBaseValidator.login(DEFAULT_USERNAME, DEFAULT_PASSWORD);
	}

	@Override
	public void testBody() throws Exception {
		// This method clicks on the Log button
		generalValidator.clickOnLogButton();
	}

	// There is one validation missing: We need to also check that
	// the imdc.log file is being downloaded in the new download path that we
	// will set

	@Override
	public void validation() throws Exception {
		// Validate the View Log Page items.
		generalValidator.validateLogPageItems();

		// Validate the Log Level Dropdown items
		interMapperReportBaseValidator.validateLogLevelDropdownItems();

		// Input new value in Refresh field
		testUtils.getElementByXPath(String.format(REFRESH_VALUE_XPATH)).clear();
		interMapperReportBaseValidator.inputValue(REFRESH_VALUE_XPATH, REFRESH_VALUE);

		// Input new value in Lines field
		testUtils.getElementByXPath(String.format(LINES_VALUE_XPATH)).clear();
		interMapperReportBaseValidator.inputValue(LINES_VALUE_XPATH, LINES_VALUE);

		// Click on the Save button
		interMapperReportBaseValidator.clickOnSaveButton();

		// Click on the Home button
		interMapperReportBaseValidator.clickOnHomeButton();

		// Clicks on the View The Log text-link in the Home page
		generalValidator.clickOnLogButton();

		// Validates Refresh and Lines fields values
		interMapperReportBaseValidator.validateRefreshLinesItems(REFRESH_VALUE, LINES_VALUE);

		// Input default value in Refresh field
		testUtils.getElementByXPath(String.format(REFRESH_VALUE_XPATH)).clear();
		interMapperReportBaseValidator.inputValue(REFRESH_VALUE_XPATH, REFRESH_VALUE_DEFAULT);

		// Input default value in Lines field
		testUtils.getElementByXPath(String.format(LINES_VALUE_XPATH)).clear();
		interMapperReportBaseValidator.inputValue(LINES_VALUE_XPATH, LINES_VALUE_DEFAULT);

		// Click on the Save button
		interMapperReportBaseValidator.clickOnSaveButton();

		// Validates Refresh and Lines fields values
		interMapperReportBaseValidator.validateRefreshLinesItems(REFRESH_VALUE_DEFAULT, LINES_VALUE_DEFAULT);
	}

	@Override
	public void cleanUp() throws Exception {
	}

	@Override
	public String getOwner() {
		return InterMapperReportConstants.ARMEN;
	}

}
