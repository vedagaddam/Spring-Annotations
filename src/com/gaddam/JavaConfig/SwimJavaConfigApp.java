package com.gaddam.JavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigApp {
	public static void main(String[] args) {
		
		//Load spring config file - Use the WorkoutCOnfigJava.class file to configure
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(WorkoutConfigJava.class);
		//retrieve bean from the container
		SwinCoach theCoach = context.getBean("swinCoach", SwinCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		
		context.close();
	}
}


	

