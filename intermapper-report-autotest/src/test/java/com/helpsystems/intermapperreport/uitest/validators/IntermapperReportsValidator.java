package com.helpsystems.intermapperreport.uitest.validators;

import static com.helpsystems.intermapperreport.uitest.utils.LocatorsConstants.*;
import static com.helpsystems.intermapperreport.uitest.utils.UiDataConstants.*;
import com.helpsystems.common.util.TestUtils;

/**
 * the class includes methods for Intermapper Reports package.
 * 
 * @author Armen Torunyan
 * 
 */

public class IntermapperReportsValidator extends InterMapperReportBaseValidator {
	/**
	 * 
	 * @param testUtils
	 */
	
	public IntermapperReportsValidator(TestUtils testUtils) {
		super(testUtils);
	}
	
	/**
	 * A method to click on View Report text-link
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnViewReportsButton() throws InterruptedException {
		testUtils.waitByXpath(VIEW_REPORTS_XPATH, 10);
		testUtils.getElementByXPath(VIEW_REPORTS_XPATH).click();
	}
	
	/**
	 * A method to click the All Devices dropdown
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnAllDevicesDropdown() throws InterruptedException {
		testUtils.waitByXpath(ALL_DEVICES_DROPDOWN_XPATH, 10);
		testUtils.getElementByXPath(ALL_DEVICES_DROPDOWN_XPATH).click();
	}
	
	/**
	 * A method to click the on map option in All devices dropdown
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnAllDevicesDevicesOnMapDropdown() throws InterruptedException {
		testUtils.waitByXpath(DROPDOWN_DEVICES_ON_MAP_XPATH, 10);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_ON_MAP_XPATH).click();
	}
	
	/**
	 * A method to validate Devices on map dropdown items
	 * 
	 * @throws InterruptedException
	 */
	
	public void validateChartDataForDevicesDevicesOnMapDropdownItems() throws InterruptedException {
		testUtils.getElementByXPath(ALL_DEVICES_DROPDOWN_XPATH);
		testUtils.getElementByXPath(DROPDOWN_ALL_DEVICES_XPATH);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_ON_MAP_XPATH);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_IN_STATE_XPATH);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_WITH_XPATH);
		testUtils.getElementByXPath(DROPDOWN_SPECIFIC_DEVICES_XPATH);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_ON_MAP_DEMO_1_XPATH);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_ON_MAP_DEMO_2_XPATH);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_ON_MAP_DEMO_3_XPATH);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_ON_MAP_DEMO_4_XPATH);
		
	}
	
	/**
	 * A method to Devices on State dropdown
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnAllDevicesDeviceInStateDropdown() throws InterruptedException {
		testUtils.waitByXpath(DROPDOWN_DEVICES_IN_STATE_XPATH, 10);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_IN_STATE_XPATH).click();
	}
	
	/**
	 * A method to validate Devices in state dropdown items
	 * 
	 * @throws InterruptedException
	 */
	
	public void validateChartDataForDevicesDevicesInStateDropdownItems() throws InterruptedException {
		testUtils.getElementByXPath(DROPDOWN_DEVICES_IN_STATE_DOWN_XPATH);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_IN_STATE_CRITICAL_XPATH);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_IN_STATE_ALARM_XPATH);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_IN_STATE_WARNING_XPATH);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_IN_STATE_OKAY_XPATH);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_IN_STATE_UNKNOWN_XPATH);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_IN_STATE_ACKNOWLEDGED_XPATH);
		
	}
	
	/**
	 * A method to click the Devices with dropdown
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnAllDevicesDeviceDevicesWithDropdown() throws InterruptedException {
		testUtils.waitByXpath(DROPDOWN_DEVICES_WITH_XPATH, 10);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_WITH_XPATH).click();
	}
	
	/**
	 * A method to validate Devices with dropdown items
	 * 
	 * @throws InterruptedException
	 */
	
	public void validateChartDataForDevicesDevicesWithDropdownItems() throws InterruptedException {
		testUtils.getElementByXPath(DROPDOWN_DEVICES_WITH_TYPE_SNMP_XPATH);
		
	}
	
	/**
	 * A method to click the Dataset dropdown
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnDatasetDropdown() throws InterruptedException {
		testUtils.waitByXpath(AVAILABILITY_DROPDOWN_XPATH, 10);
		testUtils.getElementByXPath(AVAILABILITY_DROPDOWN_XPATH).click();
	}
	
	/**
	 * A method to click the Response time option
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnDatasetResponseTimeOption() throws InterruptedException {
//		testUtils.waitByXpath(DROPDOWN_AVAILABILITY_RESPONSE_TIME_XPATH, 10);
		testUtils.getElementByXPath(DROPDOWN_AVAILABILITY_RESPONSE_TIME_XPATH).click();
	}
	
	/**
	 * A method to validate Dataset dropdown items
	 * 
	 * @throws InterruptedException
	 */
	
	public void validateChartDataForDevicesDatasetDropdownItems() throws InterruptedException {
		testUtils.getElementByXPath(AVAILABILITY_DROPDOWN_XPATH);
		testUtils.getElementByXPath(DROPDOWN_AVAILABILITY_RESPONSE_TIME_XPATH);
		testUtils.getElementByXPath(DROPDOWN_AVAILABILITY_SHORT_TERM_PACKET_LOSS_XPATH);
		
	}
	
	/**
	 * A method to click the Time period dropdown
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnTimePeriodDropdown() throws InterruptedException {
		testUtils.waitByXpath(PREVIOUS_24_HOURS_DROPDOWN_XPATH, 10);
		testUtils.getElementByXPath(PREVIOUS_24_HOURS_DROPDOWN_XPATH).click();
	}
	
	/**
	 * A method to validate Time Period dropdown items
	 * 
	 * @throws InterruptedException
	 */
	
	public void validateChartDataForDevicesTimePeriodDropdownItems() throws InterruptedException {
		testUtils.getElementByXPath(PREVIOUS_24_HOURS_DROPDOWN_XPATH);
		testUtils.getElementByXPath(DROPDOWN_PREVIOUS_24_HOURS_PREVIOUS_XPATH);
		testUtils.getElementByXPath(DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_XPATH);
		testUtils.getElementByXPath(DROPDOWN_PREVIOUS_24_HOURS_SPECIFIC_DATE_XPATH);
		testUtils.getElementByXPath(DROPDOWN_PREVIOUS_24_HOURS_ALL_DATES_BEFORE_XPATH);
		testUtils.getElementByXPath(DROPDOWN_PREVIOUS_24_HOURS_ALL_DATES_AFTER_XPATH);
		testUtils.getElementByXPath(DROPDOWN_PREVIOUS_24_HOURS_DATE_RANGE_XPATH);
		
	}
	
	/**
	 * A method to click the Time period to date dropdown
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnTimePeriodToDateDropdown() throws InterruptedException {
		testUtils.waitByXpath(DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_XPATH, 10);
		testUtils.getElementByXPath(DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_XPATH).click();
	}
	
	/**
	 * A method to click the time period to date day option
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnTimePeriodToDateDayOption() throws InterruptedException {
		testUtils.waitByXpath(DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_DAY_XPATH, 10);
		testUtils.getElementByXPath(DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_DAY_XPATH).click();
	}
	
	/**
	 * A method to validate the time period to date dropdown items
	 * 
	 * @throws InterruptedException
	 */
	
	public void validateChartDataForDevicesTimePeriodToDateDropdownItems() throws InterruptedException {
		testUtils.waitByXpath(DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_DAY_XPATH, 10);
		testUtils.getElementByXPath(DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_DAY_XPATH);
		testUtils.getElementByXPath(DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_WEEK_XPATH);
		testUtils.getElementByXPath(DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_MONTH_XPATH);
		testUtils.getElementByXPath(DROPDOWN_PREVIOUS_24_HOURS_TO_DATE_YEAR_XPATH);
		
	}
	
	/**
	 * A method to click the Display As dropdown
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnDisplayAsDropdown() throws InterruptedException {
		testUtils.waitByXpath(DISPLAY_AS_DROPDOWN_LINE_CHART_XPATH, 10);
		testUtils.getElementByXPath(DISPLAY_AS_DROPDOWN_LINE_CHART_XPATH).click();
	}
	
	/**
	 * A method to click the Display As Table option
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnDisplayAsTableOption() throws InterruptedException {
		testUtils.waitByXpath(DISPLAY_AS_DROPDOWN_TABLE_XPATH, 10);
		testUtils.getElementByXPath(DISPLAY_AS_DROPDOWN_TABLE_XPATH).click();
	}
	
	/**
	 * A method to validate the Display As dropdown items
	 * 
	 * @throws InterruptedException
	 */
	
	public void validateChartDataForDevicesDisplayAsDropdownItems() throws InterruptedException {
		testUtils.getElementByXPath(DISPLAY_AS_DROPDOWN_TITLE_XPATH);
		testUtils.getElementByXPath(DISPLAY_AS_DROPDOWN_LINE_CHART_XPATH);
		testUtils.getElementByXPath(DISPLAY_AS_DROPDOWN_TABLE_XPATH);
		testUtils.getElementByXPath(KEEP_IN_MIND_PARAGRAPH_XPATH);
		
	}
	
	/**
	 * A method to validate Report/Chart Data for Devices page items
	 * 
	 * @throws InterruptedException
	 */
	
	public void validateChartDataForDevicesItems() throws InterruptedException {
		testUtils.getElementByXPath(CHART_DATA_FOR_DEVICES_TITLE_XPATH);
		testUtils.getElementByXPath(CHART_OF_DATA_FOR_ONE_OR_MORE_DEVICES_SUMMARY_XPATH);
		testUtils.getElementByXPath(CREATE_A_NEW_REPORT_XPATH);
		testUtils.getElementByXPath(SELECT_A_REPORT_TEMPLATE_XPATH);
		testUtils.getElementByXPath(REPORT_SUMMARY_1_XPATH);
		testUtils.getElementByXPath(REPORT_SUMMARY_2_XPATH);
		testUtils.getElementByXPath(DEVICES_DROPDOWN_TITLE_XPATH);
		testUtils.getElementByXPath(DATASET_DROPDOWN_TITLE_XPATH);
		testUtils.getElementByXPath(TIME_PERIOD_DROPDOWN_TITLE_XPATH);
		testUtils.getElementByXPath(SAVED_REPORTS_BUTTON_XPATH);
		testUtils.getElementByXPath(CREATE_REPORT_BUTTON_XPATH);
	}
	
	/**
	 * A method to click the Devices on Map checkmark
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnDevicesOnMapCheckmark() throws InterruptedException {
		testUtils.waitByXpath(DROPDOWN_DEVICES_ON_MAP_DEMO_CKECKMARK_BTN_XPATH, 10);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_ON_MAP_DEMO_CKECKMARK_BTN_XPATH).click();
	}
	
	/**
	 * A method to validate the Devices On Map are Active
	 * 
	 * @throws InterruptedException
	 */
	
	public void validateDevicesOnMapCheckedItems() throws InterruptedException {
		testUtils.getElementByXPath(DROPDOWN_DEVICES_ON_MAP_DEMO_1_CHECKED_XPATH);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_ON_MAP_DEMO_2_CHECKED_XPATH);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_ON_MAP_DEMO_3_CHECKED_XPATH);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_ON_MAP_DEMO_4_CHECKED_XPATH);
	}
	
	/**
	 * A method to click the Devices On Map Uncheck all checkbox
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnDevicesOnMapUncheckAll() throws InterruptedException {
		testUtils.waitByXpath(DROPDOWN_DEVICES_ON_MAP_DEMO_UNCHECK_ALL_BTN_XPATH, 10);
		testUtils.getElementByXPath(DROPDOWN_DEVICES_ON_MAP_DEMO_UNCHECK_ALL_BTN_XPATH).click();
	}
	
	/**
	 * A method to click the Create Report Button
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnCreateReportButton() throws InterruptedException {
		testUtils.waitByXpath(CREATE_REPORT_BUTTON_XPATH, 10);
		testUtils.getElementByXPath(CREATE_REPORT_BUTTON_XPATH).click();
	}
	
	/**
	 * A method to click the File Button
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnFileButton() throws InterruptedException {
		testUtils.waitByXpath(FILE_MENU_BUTTON_XPATH, 10);
		testUtils.getElementByXPath(FILE_MENU_BUTTON_XPATH).click();
	}
	
	/**
	 * A method to click the Save option in File menu
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnFileMenuSaveButton() throws InterruptedException {
		testUtils.waitByXpath(FILE_MENU_SAVE_BUTTON_XPATH, 10);
		testUtils.getElementByXPath(FILE_MENU_SAVE_BUTTON_XPATH).click();
	}
	
	/**
	 * A method to validate the Save Report popup items
	 * 
	 * @throws InterruptedException
	 */
	
	public void validateSaveReportPopUpItems() throws InterruptedException {
		testUtils.getElementByXPath(SAVE_THE_CURRENT_REPORT_HEADER_XPATH);
		testUtils.getElementByXPath(SELECT_AN_EXISTING_REPORT_PARAGRAPH_XPATH);
		testUtils.getElementByXPath(REPORT_TITLE_XPATH);
		testUtils.getElementByXPath(REPORT_SUMMARY_XPATH);
		testUtils.getElementByXPath(REPORT_NAME_XPATH);
		testUtils.getElementByXPath(CANCEL_BUTTON_XPATH);
		testUtils.getElementByXPath(DELETE_BUTTON_REPORT_XPATH);
	}
	
	/**
	 * A method to click the Save the Current Report header
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnSaveTheCurrentReportHeader() throws InterruptedException {
		testUtils.waitByXpath(SAVE_THE_CURRENT_REPORT_HEADER_XPATH, 10);
		testUtils.getElementByXPath(SAVE_THE_CURRENT_REPORT_HEADER_XPATH).click();
	}
	
	/**
	 * A method to click the Save report button
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnSaveReportButton() throws InterruptedException {
		testUtils.waitByXpath(SAVE_REPORT_BUTTON_WITH_CLASS_XPATH, 10);
		testUtils.getElementByXPath(SAVE_REPORT_BUTTON_WITH_CLASS_XPATH).click();
	}
	
	public void clickOnChartDataForInterfacesTab() throws InterruptedException {
		testUtils.waitByXpath(CHART_DATA_FOR_INTERFACES_XPATH, 10);
		testUtils.getElementByXPath(CHART_DATA_FOR_INTERFACES_XPATH).click();
	}
	
}
