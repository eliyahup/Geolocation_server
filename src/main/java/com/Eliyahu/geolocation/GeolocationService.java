package com.Eliyahu.geolocation;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
public interface GeolocationService {
	public List<Distance> getDistance(String sour, String dest);
	public Distance addDistance(Distance dis);
	
}
