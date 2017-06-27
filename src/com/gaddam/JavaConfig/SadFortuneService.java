package com.gaddam.JavaConfig;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is not a good day";
	}

}
