package com.vedagaddam.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoachConstuctorInjection implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoachConstuctorInjection(FortuneService fortuneService){
		System.out.println("Inside constructor TennisCoachConstuctorInjection");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice back hand tennis";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
