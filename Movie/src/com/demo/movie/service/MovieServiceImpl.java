package com.demo.movie.service;

import java.util.List;

import com.demo.movie.dto.MovieDto;
import com.demo.movie.repo.MovieRepo;
import com.demo.movie.repo.MovieRepoImpl;

public class MovieServiceImpl implements MovieService{

	private MovieRepo repo = new MovieRepoImpl();

//	@Override
//	public boolean save(MovieDto demo) {
//		
//		return false;
//	}

	@Override
	public boolean save(MovieDto... dto) {
		// TODO Auto-generated method stub
		return repo.save(dto);
	}

	@Override
	public List<MovieDto> readAll() {
		return repo.readAll();
	}

	@Override
	public List<MovieDto> findByType(String type) {
		return repo.findByType(type);
	}

	@Override
	public boolean updateTypeByName(String type, String name) {
		return repo.updateTypeByName(type,name);
	}

	@Override
	public boolean deleteByName(String name) {
		return repo.deleteByName(name);
	}
	
}
