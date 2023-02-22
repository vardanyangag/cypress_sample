package com.helpsystems.intermapperreport.uitest.intermapperdatabase;

import static com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants.*;
import java.net.InetAddress;
import com.helpsystems.intermapperreport.uitest.base.IntermapperDatabaseBaseTest;
import com.helpsystems.intermapperreport.uitest.utils.InterMapperReportConstants;

/**
 * class for testing all elements in the IMDC More Details page
 * 
 * @author Armen Torunyan
 * 
 */

public class TestMoreDetails extends IntermapperDatabaseBaseTest {
	@Override
	public void init() throws Exception {
    interMapperReportBaseValidator.login(DEFAULT_USERNAME, DEFAULT_PASSWORD);
	}

	@Override
	public void testBody() throws Exception {
		intermapperDatabaseValidator.clickOnMoreDetailsButton();
		InetAddress ip = InetAddress.getLocalHost();
		String hostname = ip.getHostName();
		System.out.println(hostname.toUpperCase());
	}

	@Override
	public void validation() throws Exception {
		intermapperDatabaseValidator.validateMoreDetailsItems();
	}

	@Override
	public void cleanUp() throws Exception {
	}

	@Override
	public String getOwner() {
		return InterMapperReportConstants.ARMEN;
	}

}