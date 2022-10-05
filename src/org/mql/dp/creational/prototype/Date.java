package org.mql.dp.creational.prototype;

import java.util.GregorianCalendar;

public class Date implements Cloneable {
	private int day, month, year;

	public Date() {
		GregorianCalendar gc = new GregorianCalendar();
		day = gc.get(GregorianCalendar.DAY_OF_MONTH);
		month = gc.get(GregorianCalendar.MONTH);
		year = gc.get(GregorianCalendar.YEAR);
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}

	public Date clone() {
		try {
			return (Date)super.clone();
		} catch (Exception e) {
			return null;
		}
	}

}
