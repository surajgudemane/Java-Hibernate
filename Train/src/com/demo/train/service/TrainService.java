package com.demo.train.service;

import java.util.List;

import com.demo.train.dto.TrainDto;

public interface TrainService {

	public boolean save(TrainDto dt);

	public List<TrainDto> readAll();
	
	public TrainDto findById(int id);
	
	public boolean updateDistanceByName(int dist, String name);
	
	public boolean deleteByDistance(int distance);

}
