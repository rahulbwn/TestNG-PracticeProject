package com.TestNGListeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements IInvokedMethodListener, ITestListener,
		ISuiteListener {

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// Runs before every method in Test Class

		System.out.println("Before Invocation: "
				+ arg1.getTestClass().getName() + " -> "
				+ arg0.getTestMethod().getMethodName());

	}

	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// Runs after every test method
		System.out.println("After Invocation: " + arg1.getTestClass().getName()
				+ " -> " + arg0.getTestMethod().getMethodName());

	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// On Starting every Test method execution
		System.out.println("OnTestStart " + arg0.getName());

	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// // Run if any test method pass
		System.out.println("OnTestSuccess " + arg0.getName());

	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// Run if any test method fails
		System.out.println("OnTestFailure " + arg0.getName());

	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// Run if any test method skips
		System.out.println("OnTestSkipped " + arg0.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext arg0) {
		// On Starting every test tag in testNG xml

		System.out.println("OnStart <test> tag " + arg0.getName());
	}

	@Override
	public void onFinish(ITestContext arg0) {
		// On finishing every test tag in testNG xml
		System.out.println("OnFinish <test> tag " + arg0.getName());

	}

	@Override
	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub

		System.out.println("onStart: Runs Before suit");

	}

	@Override
	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub

		System.out.println("onFinish: Runs After suit completion");

	}

}
