package com.demo.movie.repo;

import java.util.List;

import com.demo.movie.dto.MovieDto;

public interface MovieRepo {

//	public boolean save(MovieDto dto);

	public boolean save(MovieDto ... dto);

	public List<MovieDto> readAll();

	public List<MovieDto> findByType(String type);

	public boolean updateTypeByName(String type, String name);

	public boolean deleteByName(String name);

}
