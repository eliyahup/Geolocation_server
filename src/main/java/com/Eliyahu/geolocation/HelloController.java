package com.Eliyahu.geolocation;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
 
	//GET - Hello World
	@GetMapping("/hello")
	public String Hello() {
		return "empty";
	}
}