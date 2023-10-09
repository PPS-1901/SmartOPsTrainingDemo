package com.training.spring;

public class car 
{
	private String  make;
	private String color;
	private int year;
	private String model;
	public String getMake() {
		return make;
	}
	public car() {}
	public void setMake(String make) {
		this.make = make;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getCarDetail()
	{
		return this.make +":"+this.model+":"+this.year;
	}
	
	
}
