package com.training.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.spring.Person;
import com.training.spring.car;
@Configuration
public class ApplicationConfig 
{
	@Bean
	public Person person() 
	{
		Person p1 = new Person();
		p1.setLastName("miller");
		return p1;
	}
	
	@Bean
	public car car()
	{
		car c1 = new car();
		c1.setModel("nexon");
		c1.setColor("red");
		c1.setMake("TATA");
		c1.setYear(2020);
		return c1;
	}
}
