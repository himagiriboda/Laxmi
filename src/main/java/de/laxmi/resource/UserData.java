package de.laxmi.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserData {

	//@RequestMapping(value="/register",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(value="/register")
	public void regsitration() {
		System.out.println("In the method is");
	}
}
