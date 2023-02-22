package com.helpsystems.intermapperreport.uitest.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

import com.helpsystems.common.util.Constants;

public final class InterMapperReportConstants {

	private static final String INTERMAPPERREPORT_PROPERTIES_FILE_NAME = "intermapperreport.test.properties";

	private final static String INTERMAPPERREPORT_TEST_INPUTS_ROOT_PARAM = "intermapperreport.test.inputs.root";
	
	private final static String DEFAULT_USERNAME_PARAM = "default.username";
	private final static String DEFAULT_PASSWORD_PARAM = "default.password";
	private final static String ANZHELA_PARAM = "user.anzhela";
	private final static String LILIT_PARAM = "user.lilit";
	private final static String ARMEN_PARAM = "user.armen";
	private final static String SARGISV_PARAM = "user.sargisv";
	private final static String HOVHANNESM_PARAM = "user.hovhannesm";
	private final static String IM_VERSION_PARAM = "im.version";

	public final static String INTERMAPPERREPORT_TEST_INPUTS_ROOT;
	public static String DEFAULT_USERNAME;
	public static String DEFAULT_PASSWORD;
	public static String ANZHELA;
	public static String LILIT;
	public static String ARMEN;
	public static String SARGISV;
	public static String HOVHANNESM;
	public static String IM_VERSION;


	static {
		Properties properties = new Properties();
		try {
			URL url = Constants.class.getClassLoader().getResource(INTERMAPPERREPORT_PROPERTIES_FILE_NAME);
			URI uri = new URI(url.toString());
			FileInputStream fileInputStream = new FileInputStream(uri.getPath());
			properties.load(fileInputStream);
		} catch (URISyntaxException | IOException e) {
			e.printStackTrace();
		}
		DEFAULT_USERNAME = properties.getProperty(DEFAULT_USERNAME_PARAM);
		DEFAULT_PASSWORD = properties.getProperty(DEFAULT_PASSWORD_PARAM);
		ANZHELA = properties.getProperty(ANZHELA_PARAM);
		LILIT = properties.getProperty(LILIT_PARAM);
		ARMEN = properties.getProperty(ARMEN_PARAM);
		SARGISV = properties.getProperty(SARGISV_PARAM);
		HOVHANNESM = properties.getProperty(HOVHANNESM_PARAM);
		IM_VERSION = properties.getProperty(IM_VERSION_PARAM);

		INTERMAPPERREPORT_TEST_INPUTS_ROOT = properties.getProperty(INTERMAPPERREPORT_TEST_INPUTS_ROOT_PARAM);
		new File(INTERMAPPERREPORT_TEST_INPUTS_ROOT).mkdirs();

	}
}
