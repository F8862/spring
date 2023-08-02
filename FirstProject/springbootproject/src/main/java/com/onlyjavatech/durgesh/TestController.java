package com.onlyjavatech.durgesh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody      //if we want to return string itself not view then we use this annotation
public class TestController {
	@RequestMapping("/test")
	public String  firsthandler(){
		return "Just for testing";
		
	}

}
