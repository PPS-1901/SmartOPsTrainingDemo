package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Person 
{
	private String firstName;
	private String lastName;
	private int age;
	
	@Autowired
	private car myCar;
	public Person()
	{
		
	}
	public car getMyCar() {
		return myCar;
	}

	public void setMyCar(car myCar) {
		this.myCar = myCar;
	}

	public Person(int age)
	{
		this.age=age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
