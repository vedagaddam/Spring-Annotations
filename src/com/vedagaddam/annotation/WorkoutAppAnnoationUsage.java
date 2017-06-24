package com.vedagaddam.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WorkoutAppAnnoationUsage {

	public static void main(String args[]){
		
		//Load the spring configuration file; Create a Spring Container using ClassPathXmlApplicationContext
		ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve the bean from the spring container
		/*Coach theCoachConsInj = context.getBean("tennisCoachConstuctorInjection", Coach.class);
		Coach theCoachDefaultBeanID = context.getBean("basketBallCoach", Coach.class);
		Coach theCoachSetterInj = context.getBean("tennisCoachSetterInjection", Coach.class);*/
		Coach theCoachFieldInj = context.getBean("tennisCoachFieldInjection", Coach.class);
		//call the methods
		/*System.out.println("Constructor Injection: "+ theCoachConsInj.getDailyWorkout());
		System.out.println("Using default bean ID: "+theCoachDefaultBeanID.getDailyWorkout());
		System.out.println("Setter Injection: "+theCoachSetterInj.getDailyWorkout());
		System.out.println("Setter Injection: "+theCoachSetterInj.getDailyFortune());*/
		System.out.println("Field Injection: "+theCoachFieldInj.getDailyWorkout());
		System.out.println("Field Injection: "+theCoachFieldInj.getDailyFortune());
		//Close the context
		context.close();
	}
}
