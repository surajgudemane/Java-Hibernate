package com.demo.powerBank.service;

import java.util.List;

import com.demo.powerBank.dto.PowerBankDto;

public interface PowerBankService {

	public boolean save(PowerBankDto d1);

	public boolean saveAll(PowerBankDto[] arr);

	public List<PowerBankDto> readAll();
	
	public PowerBankDto findById(int id);
	
	public List<PowerBankDto> findByCapacity(int capacity);
	
	public boolean updateCapacityAndWeightByName(int capacity, int weight, String name);
	
	public boolean deleteByWeightCapacityAndName(int weight,int capacity, String name);

}
