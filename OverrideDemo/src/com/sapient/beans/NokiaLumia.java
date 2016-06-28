package com.sapient.beans;

public class NokiaLumia extends Nokia1100{

	public void doConverse(){
		System.out.println("3g converse");
	}
	
	public void captureVideo(){
		System.out.println("capturing video");
	}
	//if we want to access both super class and sub class method
	public void do2gconverse(){
		super.doConverse();
	}
}

