package com.si.dp.structural.adaptor;

public class Adaptor implements Target {
	
	private Adaptee adaptee;
	
	public Adaptor() {
		this.adaptee = new Adaptee();
	}
	@Override
	public String getRequest() {
		return adaptee.getSpecificRequest();
	}
}