package com.TestNGListeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomListener1 implements IInvokedMethodListener{

	

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// Runs before every method in Test Class
		
		System.out.println("Before Invocation: "+arg1.getTestClass().getName()+" -> "+arg0.getTestMethod().getMethodName());
		
	}
	
	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// Runs after every test method
		System.out.println("After Invocation: "+arg1.getTestClass().getName()+" -> "+arg0.getTestMethod().getMethodName());
		
	}

	

}
