package com.hibernate.train.runner;

import com.hibernate.train.dto.TrainDto;
import com.hibernate.train.service.TrainService;
import com.hibernate.train.service.TrainServiceImpl;

public class TrainRunner {

	public static void main(String[] args) {

		TrainService service = new TrainServiceImpl();
		
		TrainDto d1 = new TrainDto(1, "Shatabdi", "Shimogga", "Bengaluru", 274, 150);
		TrainDto d2 = new TrainDto(2, "Talguppa Express", "Bengaluru", "Shimogga", 274, 160);
		
		service.save(d1,d2);
		
	}

}
