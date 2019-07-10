package com.wunderman.runner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RunnerController {
	
	@RequestMapping("/runner")
	public String Runner() {
		return "Application Runner called";
		
		
	}

}
