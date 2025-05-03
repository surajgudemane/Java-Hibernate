package com.hibernate.trimmer.repo;

import java.util.List;

import com.hibernate.trimmer.dto.TrimmerDto;

public interface TrimmerRepo {

	public boolean save(TrimmerDto dto);

	public List readAll();

	public List readByName(String[] name);

	public boolean updateWarrantyByName(int warranty, String name);

	public boolean deleteByName(String name);

}
