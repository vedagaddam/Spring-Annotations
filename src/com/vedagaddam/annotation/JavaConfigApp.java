package com.vedagaddam.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {
	public static void main(String[] args) {
		
		//Load spring config file - Use the WorkoutCOnfigJava.class file to configure
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(WorkoutConfigJava.class);
		//retrieve bean from the container
		Coach theCoach1 = context.getBean("tennisCoachFieldInjection", Coach.class);
		Coach theCoach2 = context.getBean("tennisCoachFieldInjection", Coach.class);
		
		boolean res = (theCoach1 == theCoach2);
		
		System.out.println("the compared result of pointing to same object is "+res);
		System.out.println("Memory location 1 "+theCoach1);
		System.out.println("Memory location 2 "+theCoach2);
		
		context.close();
	}
}


	

