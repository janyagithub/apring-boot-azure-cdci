package org.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	//initial method
	@RequestMapping("/")
	public String index() {
		return "hello master_1";
	}
	
	@RequestMapping("/v1")
	public String index_() {
		return "hello master_2";
	}

}
