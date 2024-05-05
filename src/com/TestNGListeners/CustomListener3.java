package com.TestNGListeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class CustomListener3 implements ISuiteListener {

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

	

	



	
