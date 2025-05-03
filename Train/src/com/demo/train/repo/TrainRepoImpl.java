package com.demo.train.repo;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.train.config.TrainConfiguration;
import com.demo.train.dto.TrainDto;

public class TrainRepoImpl implements TrainRepo{

	@Override
	public boolean save(TrainDto dt) {
		Session session = TrainConfiguration.getConnection().openSession();
		if(session != null) {
			
			Transaction transaction = session.beginTransaction();
			session.save(dt);
			transaction.commit();
			session.close();
			return true;
		}
		return false;
	}

	@Override
	public List<TrainDto> readAll() {
		Session session = TrainConfiguration.getConnection().openSession();
		if(session != null) {
			Transaction transaction = session.beginTransaction();
			
			List<TrainDto> list = session.createCriteria(TrainDto.class).list();
//			List<TrainDto> list = c.list();
			
			System.out.println(session.get(TrainDto.class, 2));

			transaction.commit();
			session.close();
			
			return list;
		}
		return null;
	}

	@Override
	public TrainDto findById(int id) {
		Session session = TrainConfiguration.getConnection().openSession();
		if(session != null) {
			Transaction tx = session.beginTransaction();
			TrainDto dto = session.get(TrainDto.class, id);
			tx.commit();
			session.close();
			return dto;
		}
		return null;
	}

	@Override
	public boolean updateDistanceByName(int dist, String name) {
		Session session = TrainConfiguration.getConnection().openSession();
		if(session != null) {
			Transaction tx  = session.beginTransaction();
			List<TrainDto> list = session.createCriteria(TrainDto.class).list();
			for(TrainDto dt : list) {
				if(dt.getName().equals(name)) {
					dt.setDistance(dist);
					session.update(dt);
					tx.commit();
					session.close();
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteByDistance(int distance) {
		Session session = TrainConfiguration.getConnection().openSession();
		if(session != null) {
			Transaction tx = session.beginTransaction();
			
			List<TrainDto> list = session.createCriteria(TrainDto.class).list();
			for(TrainDto dt : list) {
				if(dt.getDistance() == distance) {
					session.delete(dt);	
				}
			}
			tx.commit();
			session.close();
			return true;
		}
		return false;
	}

}
