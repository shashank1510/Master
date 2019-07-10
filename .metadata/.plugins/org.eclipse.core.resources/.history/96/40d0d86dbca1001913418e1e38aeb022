package com.wunderman.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	// Dependency
	// private WelcomeService service = new WelcomeService();
	// Injected here
	@Autowired // Auto wiring
	private WelcomeService service;

	@RequestMapping("/welcome")
	public String welcome() {
		// return service.retriveMessage();
		return service.retriveSecondMessage();
	}

}

// Spring to manage this bean and create an instance of this!
// Spring
// @Component
// class WelcomeService {
// public String retriveMessage() {
// // Complex Method
// return "Good morning! Wunderman";
//
// }
//
// }
// in above program we created rest controller we created the dependency for it
// call welcome service which is component.
// WelcomeControler is saying welcome service is the dependency for it and how
// it saying using @Autowired
// Si here what spring do it search for the welcome service and autowired it in.
// By putting @Component annotation it got to know which service it should
// autowired.
//