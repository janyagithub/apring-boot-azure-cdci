package org.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "added CD";
	}
	
	@RequestMapping("/v1")
	public String index_() {
		return "added CD";
	}

}
