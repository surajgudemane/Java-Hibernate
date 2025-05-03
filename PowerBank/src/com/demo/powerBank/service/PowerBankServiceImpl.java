package com.demo.powerBank.service;

import java.util.List;

import com.demo.powerBank.dto.PowerBankDto;
import com.demo.powerBank.repo.PowerBankRepo;
import com.demo.powerBank.repo.PowerBankRepoImpl;

public class PowerBankServiceImpl implements PowerBankService{

	private PowerBankRepo repo = new PowerBankRepoImpl();
	
	@Override
	public boolean save(PowerBankDto dto) {
		return repo.save(dto);
	}

	@Override
	public boolean saveAll(PowerBankDto[] arr) {
		return repo.save(arr);
	}

	@Override
	public List<PowerBankDto> readAll() {
		return repo.readAll();
	}

	@Override
	public PowerBankDto findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public List<PowerBankDto> findByCapacity(int capacity) {
		return repo.findByCapacity(capacity);
	}

	@Override
	public boolean updateCapacityAndWeightByName(int capacity, int weight, String name) {
		return repo.updateCapacityAndWeightByName(capacity, weight, name);
	}

	@Override
	public boolean deleteByWeightCapacityAndName(int weight, int capacity, String name) {
		return repo.deleteByWeightCapacityAndName(weight, capacity, name);
	}

}
