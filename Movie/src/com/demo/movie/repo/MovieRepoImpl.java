package com.demo.movie.repo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.movie.config.MovieConfiguration;
import com.demo.movie.dto.MovieDto;

public class MovieRepoImpl implements MovieRepo {

//	@Override
//	public boolean save(MovieDto dto) {
//		Session session = MovieConfiguration.getConnection().openSession();
//
//		if (session != null) {
//			Transaction tx = session.beginTransaction();
//			session.save(dto);
//
//			tx.commit();
//			session.close();
//			return true;
//		}
//
//		return false;
//	}

	@Override
	public boolean save(MovieDto ... dto) {
		Session session = MovieConfiguration.getConnection().openSession();

		if (session != null) {
			Transaction tx = session.beginTransaction();
			for(MovieDto dt : dto) {
				session.save(dt);
			}

			tx.commit();
			session.close();
			return true;
		}
		return false;
	}

	@Override
	public List<MovieDto> readAll() {
		Session session = MovieConfiguration.getConnection().openSession();
		if(session != null) {
			
			Criteria c = session.createCriteria(MovieDto.class);
			List<MovieDto> list = c.list();

			return list;
		}
		
		return null;
	}

	@Override
	public List<MovieDto> findByType(String type) {
		Session session = MovieConfiguration.getConnection().openSession();
		if(session != null) {
			
			List<MovieDto> list = new ArrayList<MovieDto>();
			for(MovieDto dt : readAll()) {
				if(dt.getType().equals(type)) {
					list.add(dt);
				}
			}
			return list;
		}
		return null;
	}

	@Override
	public boolean updateTypeByName(String type, String name) {
		Session session = MovieConfiguration.getConnection().openSession();
		if (session != null) {
			Transaction tx = session.beginTransaction();
			for(MovieDto dt : readAll()) {
				if(dt.getName().equals(name)) {
					dt.setType(type);
					session.update(dt);
					
					tx.commit();
					session.close();
					return true;
				}
			}
			return false;
		}
		return false;
	}

	@Override
	public boolean deleteByName(String name) {
		Session session = MovieConfiguration.getConnection().openSession();
		if (session != null) {
			Transaction tx = session.beginTransaction();
			for(MovieDto dt : readAll()) {
				if(dt.getName().equals(name)) {
					session.delete(dt);
					
					tx.commit();
					session.close();
					return true;
				}
			}
			return false;
		}
		return false;
	}

}
