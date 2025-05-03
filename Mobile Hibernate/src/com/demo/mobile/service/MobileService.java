package com.demo.mobile.service;

import java.util.List;

import com.demo.mobile.dto.MobileDto;

public interface MobileService {
	
	public boolean save(MobileDto dto);
	
	public boolean saveAll(List<MobileDto> list);
	
	public List<MobileDto> readAll();

}
