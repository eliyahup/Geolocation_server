package com.Eliyahu.geolocation;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Eliyahu.geolocation.GeolocationService;
@RestController
public class GeolocationController {
	private GeolocationService geolocationService;
	
	public GeolocationController(GeolocationService geolocationService) {
		super();
		this.geolocationService = geolocationService;
	}
	
	//GET - Hello World
	@GetMapping("/hello")
	public String Hello() {
		return "empty";
	}
 
	
    @PostMapping("/distance")
    public ResponseEntity<Distance> addDistance(@RequestBody Distance dis) {
        return new ResponseEntity<Distance>(geolocationService.addDistance(dis),HttpStatus.CREATED);
    }
	
	    //GET /distance?source=theSource&destination=theDestination
		@GetMapping("/distance")
		public ResponseEntity<List<Distance>> distance(@RequestParam (name = "source") String source,
				                                 @RequestParam (name = "destination") String destination) {
			return new ResponseEntity<List<Distance>>(geolocationService.getDistance(source ,destination),HttpStatus.OK);
		}
}

