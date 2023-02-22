package com.helpsystems.intermapperreport.uitest.intermapperreports;

import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.DEFAULT_PASSWORD;
import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.DEFAULT_USERNAME;

import java.util.concurrent.TimeUnit;

import com.helpsystems.intermapperreport.uitest.base.IntermapperReportsBaseTest;
import com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants;

/**
 * class for testing all elements in the IMDC Reports/Chart Data For Devices page
 * 
 * @author Armen Torunyan
 * 
 */

public class TestChartDataForDevicesPage extends IntermapperReportsBaseTest {
	@Override
	public void init() throws Exception {
		interMapperReportBaseValidator.login(DEFAULT_USERNAME, DEFAULT_PASSWORD);
	}

	@Override
	public void testBody() throws Exception {
		// Click the View Reports text-link in the Home page
		intermapperReportsValidator.clickOnViewReportsButton();
	}

	@Override
	public void validation() throws Exception {
		// Validate the View Reports/Chart Data for Devices Page items
		intermapperReportsValidator.validateChartDataForDevicesItems();
		// Click Display As dropdown
		intermapperReportsValidator.clickOnDisplayAsDropdown();
		// Validate Display as dropdown items
		intermapperReportsValidator.validateChartDataForDevicesDisplayAsDropdownItems();
		// Click Display As dropdown's Table option
		intermapperReportsValidator.clickOnDisplayAsTableOption();
		TimeUnit.MILLISECONDS.sleep(100);
		// Click Time Period dropdown
		intermapperReportsValidator.clickOnTimePeriodDropdown();
		// Validate Time Period dropdown items
		intermapperReportsValidator.validateChartDataForDevicesTimePeriodDropdownItems();
		TimeUnit.MILLISECONDS.sleep(100);
		// Click Time Period dropdown's to Date option
		intermapperReportsValidator.clickOnTimePeriodToDateDropdown();
		TimeUnit.MILLISECONDS.sleep(100);
		// Validate Time Period To Date dropdown items
		intermapperReportsValidator.validateChartDataForDevicesTimePeriodToDateDropdownItems();
		// Click Time Period dropdown's to Date/Day option
		intermapperReportsValidator.clickOnTimePeriodToDateDayOption();
		// Click Dataset dropdown
		intermapperReportsValidator.clickOnDatasetDropdown();
		// Validate Dataset dropdown items
		intermapperReportsValidator.validateChartDataForDevicesDatasetDropdownItems();
		// Click Dataset dropdown's Response Time Options
		intermapperReportsValidator.clickOnDatasetResponseTimeOption();
		TimeUnit.MILLISECONDS.sleep(100);
		// Click All Devices dropdown
		intermapperReportsValidator.clickOnAllDevicesDropdown();
		// Click All Devices dropdown's Devices on map option
		intermapperReportsValidator.clickOnAllDevicesDevicesOnMapDropdown();
		// Validate Devices on map dropdown items
		intermapperReportsValidator.validateChartDataForDevicesDevicesOnMapDropdownItems();
		TimeUnit.MILLISECONDS.sleep(100);
		// Click All Devices dropdown's Devices on map option's checkmark
		intermapperReportsValidator.clickOnDevicesOnMapCheckmark();
		// Validate Devices on map dropdown's all the Demo maps are checked
		intermapperReportsValidator.validateDevicesOnMapCheckedItems();
		TimeUnit.MILLISECONDS.sleep(100);
		// Click All Devices dropdown's Devices on map option's Uncheck All button
		intermapperReportsValidator.clickOnDevicesOnMapUncheckAll();
		// Validate Devices on map dropdown items
		intermapperReportsValidator.validateChartDataForDevicesDevicesOnMapDropdownItems();
		// Click All Devices dropdown's Devices in state option
		intermapperReportsValidator.clickOnAllDevicesDeviceInStateDropdown();
		// Validate Devices in state dropdown items
		intermapperReportsValidator.validateChartDataForDevicesDevicesInStateDropdownItems();
		// Click All Devices dropdown's Devices with option
		intermapperReportsValidator.clickOnAllDevicesDeviceDevicesWithDropdown();
		// Validate Devices with dropdown items
		intermapperReportsValidator.validateChartDataForDevicesDevicesWithDropdownItems();
		// Click All Devices dropdown
		intermapperReportsValidator.clickOnAllDevicesDropdown();
		
		//Click Create Report Button
		TimeUnit.MILLISECONDS.sleep(200);
		intermapperReportsValidator.clickOnCreateReportButton();
		//Click File button in the top menu bar
		TimeUnit.MILLISECONDS.sleep(100);
		intermapperReportsValidator.clickOnFileButton();
		//Click the Save button under the File menu
		TimeUnit.MILLISECONDS.sleep(100);
		intermapperReportsValidator.clickOnFileMenuSaveButton();
		//Click the Save the Current Report header to focus on the popup
		TimeUnit.MILLISECONDS.sleep(100);
		intermapperReportsValidator.clickOnSaveTheCurrentReportHeader();
		//Validate the Save Report popup window items
		intermapperReportsValidator.validateSaveReportPopUpItems();
		//Click the Save Report Button
		TimeUnit.MILLISECONDS.sleep(100);
		intermapperReportsValidator.clickOnSaveReportButton();
		
	}

	@Override
	public void cleanUp() throws Exception {
	}

	@Override
	public String getOwner() {
		return InterMapperReportConstants.ARMEN;
	}

}
