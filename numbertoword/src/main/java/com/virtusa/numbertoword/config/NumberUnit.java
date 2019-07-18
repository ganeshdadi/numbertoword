package com.virtusa.numbertoword.config;

public class NumberUnit {
	private int digits;
	private String unitName;
	
	public NumberUnit(int digits, String unitName) {
		super();
		this.digits = digits;
		this.unitName = unitName;
	}
	
	public int getDigits() {
		return digits;
	}
	public void setDigits(int digits) {
		this.digits = digits;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
}
