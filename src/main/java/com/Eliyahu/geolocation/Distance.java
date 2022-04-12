package com.Eliyahu.geolocation;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Id;

@Document("geolocation")
public class Distance {
	@Id
	private String Id;
	@Field(name = "source")
	private String source;
	@Field(name = "destination")
	private String destination;
	@Field(name = "distance")
	private int distance;
	
	public Distance(String source, String destination, int distance) {
		this.source = source;
		this.destination = destination;
		this.distance = distance;
	}
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

}
