package com.vedagaddam.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoachSetterInjection implements Coach {
	private FortuneService fortuneService;
	//default constructor
	public TennisCoachSetterInjection(){
		System.out.println("Inside constructor TennisCoachSetterInjection");
	}
	
	//define the setter method and configure the dependency using auto wiring
	@Autowired
	public void tryAnyMethodName(FortuneService fortuneService){
		System.out.println("Inside tryAnyMethodName");
		this.fortuneService = fortuneService;
	}
	
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService){
		System.out.println("Inside setFortuneService");
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice back hand tennis set";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
