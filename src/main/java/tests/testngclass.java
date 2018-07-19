package tests;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class testngclass extends Baseclass{

	@BeforeSuite
	public void setup() {
		
		File dir = new File("TestReport");
		dir.mkdir();
		File subdir = new File(dir+"/Screenshot/");
		subdir.mkdir();
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yy");
		String datefile = dateFormat.format(now);
		File datefodler = new File(dir+"/Screenshot/"+datefile);
		datefodler.mkdir();
		scrcaptureFilepath = new File(dir+"/Screenshot/"+datefile).getAbsolutePath();
		extn = new ExtentReports();
		htmlreporter = new ExtentHtmlReporter(dir+"/Report.html");
		extn.attachReporter(htmlreporter);
		
	}
	
	
	@AfterSuite
    public void closeextntreport(){
    	 extn.flush();
    }
}
