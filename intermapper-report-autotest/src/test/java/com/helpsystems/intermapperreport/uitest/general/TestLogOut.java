package com.helpsystems.intermapperreport.uitest.general;

import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.*;
import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.DEFAULT_USERNAME;
import com.helpsystems.intermapperreport.uitest.base.GeneralBaseTest;
import com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants;

/**
 * class for testing all elements in the IMDC Logout page
 * 
 * @author Armen Torunyan
 * 
 */

public class TestLogOut extends GeneralBaseTest {
	@Override
	public void init() throws Exception {
		interMapperReportBaseValidator.login(DEFAULT_USERNAME, DEFAULT_PASSWORD);
	}

	@Override
	public void testBody() throws Exception {
		// Validate the links/headers on the page.
		generalValidator.clickOnLogOutTextlink();
	}

	@Override
	public void validation() throws Exception {
		// Validate the links/headers on the page.
		generalValidator.validateLogOutItems();

	}

	@Override
	public void cleanUp() throws Exception {
	}

	@Override
	public String getOwner() {
		return InterMapperReportConstants.ARMEN;
	}
}
