package com.Eliyahu.geolocation;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class GeolocationServiceImp implements GeolocationService{
	private DistanceRepository distanceRepository;

	public GeolocationServiceImp(DistanceRepository distanceRepository) {
		super();
		this.distanceRepository = distanceRepository;
	}
	@Override
	public List<Distance> getDistance(String sour, String dest) {

		return  distanceRepository.findAll();
	}

	@Override
	public Distance addDistance(Distance dis) {
		distanceRepository.save(dis);
		//distanceRepository.findBy(example, queryFunction);
		return dis;
	}



}
