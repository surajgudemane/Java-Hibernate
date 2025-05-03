package com.hibernate.camera.repo;

import java.util.List;

import com.hibernate.camera.dto.CameraDto;

public interface CameraRepo {

	public boolean save(CameraDto ... dto);
	
	public List readAll();
	
	public List readByPrice(int price);
	
	public boolean updateWarrentByName(int warrent, String name);
	
	public boolean deleteByName(String name);
	
}
