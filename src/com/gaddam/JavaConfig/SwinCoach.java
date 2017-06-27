package com.gaddam.JavaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwinCoach implements Coach {

	private FortuneService fortuneService;
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	public SwinCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmail() {
		return email;
	}


	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Swin 5 laps";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
