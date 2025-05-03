package com.hibernate.train.service;

import java.util.List;

import com.hibernate.train.dto.TrainDto;

public interface TrainService {

	public boolean save(TrainDto ... dtos);
	
	public List<TrainDto> readAll();
	
}
