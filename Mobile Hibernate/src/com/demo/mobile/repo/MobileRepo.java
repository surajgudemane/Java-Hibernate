package com.demo.mobile.repo;

import java.util.List;

import com.demo.mobile.dto.MobileDto;

public interface MobileRepo {

	public boolean save(MobileDto dto);

	public boolean saveAll(List<MobileDto> list);

	public List<MobileDto> readAll();

}
