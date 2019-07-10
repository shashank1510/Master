package com.wunderman.springboot;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService{
	
	public String retriveSecondMessage()
	{
		return "Component scanning with different package!";
	}
}