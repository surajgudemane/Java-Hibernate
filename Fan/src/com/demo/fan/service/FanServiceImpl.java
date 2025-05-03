package com.demo.fan.service;

import com.demo.fan.dto.FanDto;
import com.demo.fan.repo.FanRepo;
import com.demo.fan.repo.FanRepoImpl;

public class FanServiceImpl implements FanService {

	private FanRepo repo = new FanRepoImpl();
	
	@Override
	public boolean save(FanDto dto) {
		return repo.save(dto);
	}

	
	
}
