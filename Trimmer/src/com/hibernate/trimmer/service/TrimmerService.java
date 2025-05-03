package com.hibernate.trimmer.service;

import java.util.List;

import com.hibernate.trimmer.dto.TrimmerDto;

public interface TrimmerService {
	
	public boolean save(TrimmerDto dto);
	
	public List readAll();
	
	public List readBYName(String ... name);
	
	public boolean updateWarrantyByName(int warranty, String name);
	
	public boolean deleteByName(String name);
	
}
