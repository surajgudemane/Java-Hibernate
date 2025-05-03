package com.demo.mobile.service;

import java.util.List;

import com.demo.mobile.dto.MobileDto;
import com.demo.mobile.repo.MobileRepo;
import com.demo.mobile.repo.MobileRepoImpl;

public class MobileServiceImpl implements MobileService{

	private MobileRepo repo = new MobileRepoImpl();
	
	@Override
	public boolean save(MobileDto dto) {
		return repo.save(dto);
	}

	@Override
	public boolean saveAll(List<MobileDto> list) {
		if(list.isEmpty()) {
			return false;
		}
		return repo.saveAll(list);
	}

	@Override
	public List<MobileDto> readAll() {
		return repo.readAll();
	}

}
