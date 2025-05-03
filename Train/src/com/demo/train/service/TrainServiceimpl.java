package com.demo.train.service;

import java.util.List;

import com.demo.train.dto.TrainDto;
import com.demo.train.repo.TrainRepo;
import com.demo.train.repo.TrainRepoImpl;

public class TrainServiceimpl implements TrainService{

	private static TrainRepo repo = new TrainRepoImpl();
	
	@Override
	public boolean save(TrainDto dt) {
		if(dt.getId() > 0) {
			if(dt.getDistance() > 120) {
				return repo.save(dt);
			}
		}
		return false;
	}

	@Override
	public List<TrainDto> readAll() {
		return repo.readAll();
	}

	@Override
	public TrainDto findById(int id) {
		if(id > 0) {
			return repo.findById(id);
		}
		return null;
	}

	@Override
	public boolean updateDistanceByName(int dist, String name) {
		if(dist > 120) {
			if(name.length() > 2) {
				return repo.updateDistanceByName(dist, name);
			}
		}
		return false;
	}

	@Override
	public boolean deleteByDistance(int distance) {
		if(distance > 100) {
			return repo.deleteByDistance(distance);
		}
		return false;
	}

}
