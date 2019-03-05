package com.TestngListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListener2 implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult arg0) {
		// On Starting every Test method execution
		System.out.println("OnTestStart "+arg0.getName());
		
	}
	
	@Override
	public void onTestSuccess(ITestResult arg0) {
		// // Run if any test method pass
		System.out.println("OnTestSuccess "+arg0.getName());
		
	}
	
	@Override
	public void onTestFailure(ITestResult arg0) {
		// Run if any test method fails
		System.out.println("OnTestFailure "+arg0.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// Run if any test method skips
		System.out.println("OnTestSkipped "+arg0.getName());
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onStart(ITestContext arg0) {
		// On Starting every test tag in testNG xml
		
		System.out.println("OnStart <test> tag "+arg0.getName());
		
		//Printing All the test methods present under <test> tag
		
		ITestNGMethod[] methodsarray=arg0.getAllTestMethods();
		
		System.out.println("All Test Methods present under <test> tag "+arg0.getName()+" are:");
		for(ITestNGMethod m:methodsarray)
		{
			System.out.println(m.getMethodName());
		}
		
	}
	

	@Override
	public void onFinish(ITestContext arg0) {
		// On finishing every test tag in testNG xml
		System.out.println("OnFinish <test> tag "+arg0.getName());
		
	}

	

	



	

	
	

}
