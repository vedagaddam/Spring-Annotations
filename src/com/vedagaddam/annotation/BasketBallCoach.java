package com.vedagaddam.annotation;

import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Try 4 pointer throw";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
