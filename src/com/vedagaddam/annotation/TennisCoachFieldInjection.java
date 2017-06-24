package com.vedagaddam.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoachFieldInjection implements Coach {

	@Autowired
	private FortuneService fortuneService;
	//default constructor
	public TennisCoachFieldInjection(){
		System.out.println("Inside constructor TennisCoachFieldInjection");
	}
	/*Not needed because of field injection
	//define the setter method and configure the dependency using auto wiring
	@Autowired
	public void tryAnyMethodName(FortuneService fortuneService){
		System.out.println("Inside tryAnyMethodName");
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice back hand tennis set Field";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
