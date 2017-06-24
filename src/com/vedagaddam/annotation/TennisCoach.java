package com.vedagaddam.annotation;

import org.springframework.stereotype.Component;

@Component("theTCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice back hand";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
