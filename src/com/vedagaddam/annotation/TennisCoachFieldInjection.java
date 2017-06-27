package com.vedagaddam.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoachFieldInjection implements Coach {

	@Autowired
	private FortuneService fortuneService;
	//default constructor
	public TennisCoachFieldInjection(){
		System.out.println("Inside constructor TennisCoachFieldInjection");
	}
	//After construct method
	@PostConstruct
	public void doMyPostDestroyProgram(){
		System.out.println("Post construct method");
	}
	//Before destroy
	@PreDestroy
	public void doMyInitProgram(){
		System.out.println("pre Destroy method");
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
