package com.gaddam.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.gaddam.JavaConfig")
@PropertySource("classpath:sport.properties")
public class WorkoutConfigJava {

	//define a bean for the fortune service - method name is the bean id
	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	
	// define a bean for the swim coach and inject the dependencies
	@Bean
	public Coach swinCoach(){
		return new SwinCoach(sadFortuneService());
	}
}
