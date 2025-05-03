package com.demo.powerBank.repo;

import java.util.List;

import com.demo.powerBank.dto.PowerBankDto;

public interface PowerBankRepo {

	public boolean save(PowerBankDto dto);

	public boolean save(PowerBankDto[] arr);

	public List<PowerBankDto> readAll();
	
	public PowerBankDto findById(int capcity);

	public List<PowerBankDto> findByCapacity(int capacity);

	public boolean updateCapacityAndWeightByName(int capacity, int weight, String name);

	public boolean deleteByWeightCapacityAndName(int weight, int capacity, String name);

}
