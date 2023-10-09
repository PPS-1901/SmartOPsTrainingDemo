package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.spring.config.ApplicationConfig;

public class SpringDemo 
{

	public static void main(String[] args) 
	{
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
		ApplicationContext javaContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//Person p1 = (Person) context.getBean("person");
		//System.out.println(p1.getFirstName()+":"+p1.getAge());
		//System.out.println(p1.getMyCar().getCarDetail());
		//Person p2 = (Person) context.getBean("person");
		//p2.setFirstName("Peter");
		//System.out.print(p1.getFirstName()+":"+p1.getAge());
		//Person p2 = javaContext.getBean(Person.class);
		//System.out.println(p2.getLastName());
		
		
		Person p2 = javaContext.getBean(Person.class);
		System.out.println(p2.getMyCar().getCarDetail());
		
		car c1 = javaContext.getBean(car.class);
		System.out.println(c1.getModel());
		
		
		/*car c1 = (car) context.getBean("car");
		System.out.println("CAR COLOR : " +c1.getColor());
		System.out.println("CAR MAKE : " +c1.getMake());
		System.out.println("CAR MODEL : " +c1.getModel());
		System.out.println("YEAR : " +c1.getYear()); */
		
		// TODO Auto-generated method stub

	}

}
