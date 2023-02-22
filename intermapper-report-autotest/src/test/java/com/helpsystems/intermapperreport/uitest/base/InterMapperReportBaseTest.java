package com.helpsystems.intermapperreport.uitest.base;

import org.junit.Test;

import com.helpsystems.common.base.BaseTest;
import com.helpsystems.common.base.CleanUpException;
import com.helpsystems.common.base.CustomBase;
import com.helpsystems.common.base.InitException;
import com.helpsystems.common.base.TestException;
import com.helpsystems.common.base.ValidateException;
import com.helpsystems.intermapperreport.uitest.validators.*;

public abstract class InterMapperReportBaseTest extends BaseTest implements CustomBase {

	protected InterMapperReportBaseValidator interMapperReportBaseValidator;
	protected AppsValidator appsValidator;
	protected SettingsValidator settingsValidator;
	protected IntermapperDatabaseValidator intermapperDatabaseValidator;
	protected GeneralValidator generalValidator;
	protected IntermapperReportsValidator intermapperReportsValidator;

	@Override
	public void setUp() throws Exception {
		
		
		super.setUp();		
		interMapperReportBaseValidator = getValidator(InterMapperReportBaseValidator.class);
		interMapperReportBaseValidator.disableLocalAuth();
		appsValidator = getValidator(AppsValidator.class);
		settingsValidator = getValidator(SettingsValidator.class);
		intermapperDatabaseValidator = getValidator(IntermapperDatabaseValidator.class);
		generalValidator = getValidator(GeneralValidator.class);
		intermapperReportsValidator = getValidator(IntermapperReportsValidator.class);
	}

	@Override
	public void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void runner() throws InitException, TestException, CleanUpException, ValidateException {
			testRunner();
	}

}