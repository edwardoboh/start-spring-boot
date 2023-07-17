package com.edwardoboh.spring.startspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonalWebsiteController {
	
	@Autowired
	WebsiteConfig webConfigCtl;
	
	@RequestMapping("website")
	public WebsiteConfig fetchAllCources(){
		return webConfigCtl;
	}

}
