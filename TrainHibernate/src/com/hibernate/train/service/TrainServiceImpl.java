package com.hibernate.train.service;

import java.util.List;

import com.hibernate.train.dto.TrainDto;
import com.hibernate.train.repo.TrainRepo;
import com.hibernate.train.repo.TrainRepoImpl;

public class TrainServiceImpl implements TrainService {

	private TrainRepo repo = new TrainRepoImpl();
	
	@Override
	public boolean save(TrainDto... dtos) {
		boolean b = false;
		int count = 0;
		for(TrainDto dto : dtos) {
			b = repo.save(dto);
			if(b) {
				count++;
				b = false;
			}
		}
		if(count > 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<TrainDto> readAll() {
		return null;
	}

}
