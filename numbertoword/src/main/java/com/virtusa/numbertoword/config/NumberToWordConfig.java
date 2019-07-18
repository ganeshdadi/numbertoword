package com.virtusa.numbertoword.config;

public class NumberToWordConfig {
	
	static private NumberUnit[] numberUnits = new NumberUnit[] {
			new NumberUnit(0, "one"),
			new NumberUnit(1, "ten"),
			new NumberUnit(2, "hundred"),
			new NumberUnit(3, "thousand"),
			new NumberUnit(6, "million"),
			new NumberUnit(9, "billion"),
			new NumberUnit(12, "trillion")
	};
	
	public static NumberUnit[] getNumberUnits() {
		return numberUnits;
	}
	
	public static String getNumberUnitName(int unit) {
		return numberUnits[unit].getUnitName();
	}

}
