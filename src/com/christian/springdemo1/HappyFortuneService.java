package com.christian.springdemo1;

import java.util.ArrayList;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}
	
	@Override
	public String getFortune(int day) {
		
		ArrayList<String> fortunes = new ArrayList<String>();
		
		fortunes.add("Today is your lucky day");
		fortunes.add("break a leg");
		fortunes.add("Rainy with a chance of meatballs");
		
		String str="";
		
		for(int i=0;i<=day;i++) {
			
			str= fortunes.get(i);
		}
		return str;
	}

}
