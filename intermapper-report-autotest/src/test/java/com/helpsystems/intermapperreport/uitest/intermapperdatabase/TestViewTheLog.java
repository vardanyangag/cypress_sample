package com.helpsystems.intermapperreport.uitest.intermapperdatabase;

import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.*;
import static com.helpsystems.intermapperreport.uitest.utils.LocatorsConstants.*;
import static com.helpsystems.intermapperreport.uitest.utils.UiDataConstants.*;
import com.helpsystems.intermapperreport.uitest.base.IntermapperDatabaseBaseTest;
import com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants;

/**
 * class for testing all elements in the IMDC View The Log page
 * 
 * @author Armen Torunyan
 * 
 */

public class TestViewTheLog extends IntermapperDatabaseBaseTest {

	private static final String REFRESH_VALUE = "1";
	private static final String LINES_VALUE = "10";

	@Override
	public void init() throws Exception {
		interMapperReportBaseValidator.login(DEFAULT_USERNAME, DEFAULT_PASSWORD);
	}

	@Override
	public void testBody() throws Exception {
		// Click on the View The LOf text-link in the Home page
		intermapperDatabaseValidator.clickOnViewTheLogButton();
	}

	// There is one validation missing: We need to also check that
	// the imdatabase.log file is being downloaded in the new download path that we
	// will set

	@Override
	public void validation() throws Exception {
		// Validate the View Log Page items.
		intermapperDatabaseValidator.validateViewLogPageItems();

		// Validate the Log Level Dropdown items
		intermapperDatabaseValidator.validateLogLevelDropdownItems();

		// Input new value in Refresh field
		testUtils.getElementByXPath(String.format(REFRESH_VALUE_XPATH)).clear();
		interMapperReportBaseValidator.inputValue(REFRESH_VALUE_XPATH, REFRESH_VALUE);

		// Input new value in Lines field
		testUtils.getElementByXPath(String.format(LINES_VALUE_XPATH)).clear();
		interMapperReportBaseValidator.inputValue(LINES_VALUE_XPATH, LINES_VALUE);

		// Click on the Save button
		intermapperDatabaseValidator.clickOnSaveButton();

		// Click on the Home button
		intermapperDatabaseValidator.clickOnHomeButton();

		// Clicks on the View The Log text-link in the Home page
		intermapperDatabaseValidator.clickOnViewTheLogButton();

		// Validates Refresh and Lines fields values
		intermapperDatabaseValidator.validateRefreshLinesItems(REFRESH_VALUE, LINES_VALUE);

		// Input default value in Refresh field
		testUtils.getElementByXPath(String.format(REFRESH_VALUE_XPATH)).clear();
		interMapperReportBaseValidator.inputValue(REFRESH_VALUE_XPATH, REFRESH_VALUE_DEFAULT);

		// Input default value in Lines field
		testUtils.getElementByXPath(String.format(LINES_VALUE_XPATH)).clear();
		interMapperReportBaseValidator.inputValue(LINES_VALUE_XPATH, LINES_VALUE_DEFAULT);

		// Click on the Save button
		intermapperDatabaseValidator.clickOnSaveButton();

		// Validates Refresh and Lines fields values
		intermapperDatabaseValidator.validateRefreshLinesItems(REFRESH_VALUE_DEFAULT, LINES_VALUE_DEFAULT);
	}

	@Override
	public void cleanUp() throws Exception {
	}

	@Override
	public String getOwner() {
		return InterMapperReportConstants.ARMEN;
	}

}
