package com.Eliyahu.geolocation;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface DistanceRepository extends MongoRepository<Distance, String> {
//	  @Query(value="{ 'source' : ?0 , 'destination' :  }", fields="{ 'source' : 1, 'destination' : 1}")
//	  Distance findByTheSourAndDest(String sour, String dest);
}
