package springbootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/controller")
	public String controller()
	{
		return "Hello Spring boot world";
	}

}
