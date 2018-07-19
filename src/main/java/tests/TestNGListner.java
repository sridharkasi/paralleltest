package tests;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.IClass;

public class TestNGListner extends TestListenerAdapter {

	 @Override
		public void onTestStart(ITestResult tr) {
		
			System.out.println(tr.getMethod()+ " Started....");
		}
		
		
		@Override
		public void onTestSuccess(ITestResult tr) {
			System.out.println("Test "+ tr.getName()+ " passed");
		}
}
