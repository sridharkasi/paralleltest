package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Baseclass {

	
	 	public static ExtentReports extn;
		public static ExtentTest test;
		public static ExtentHtmlReporter htmlreporter;
		//private static String extnReporthtml;
		protected static String browser; 
		protected static String  nodeip;
		public static String workingDirectory = System.getProperty("user.dir");
		public static String scrcaptureFilepath;
}
