package com.hibernate.trimmer.service;

import java.util.List;

import com.hibernate.trimmer.dto.TrimmerDto;
import com.hibernate.trimmer.repo.TrimmerRepo;
import com.hibernate.trimmer.repo.TrimmerRepoImpl;

public class TrimmerServiceImpl implements TrimmerService{

	private TrimmerRepo repo = new TrimmerRepoImpl();
	
	@Override
	public boolean save(TrimmerDto dto) {
		if(dto.getId() > 0) {
			if(dto.getWarranty() >= 1) {
				return repo.save(dto);
			}
		}
		return false;
	}

	@Override
	public List readAll() {
		return repo.readAll();
	}

	@Override
	public List readBYName(String... name) {
		return repo.readByName(name);
	}

	
	@Override
	public boolean updateWarrantyByName(int warranty, String name) {
		return repo.updateWarrantyByName(warranty, name);
	}

	@Override
	public boolean deleteByName(String name) {
		return repo.deleteByName(name);
	}

}
