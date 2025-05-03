package com.demo.movie.service;

import java.util.List;

import com.demo.movie.dto.MovieDto;

public interface MovieService {

//	public boolean save(MovieDto dto);
	
	public boolean save(MovieDto ... dto);
	
	public List<MovieDto> readAll();
	
	public List<MovieDto> findByType(String type);
	
	public boolean updateTypeByName(String type, String name);
	
	public boolean deleteByName(String name);

}
