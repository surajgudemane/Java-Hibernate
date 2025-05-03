package com.demo.mobile.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.mobile.config.MobileConfiguration;
import com.demo.mobile.dto.MobileDto;

public class MobileRepoImpl implements MobileRepo {

	@Override
	public boolean save(MobileDto dto) {
		Session session = MobileConfiguration.getConnection().openSession();
		if (session.equals(null)) {
			return false;
		} else {
			Transaction tx = session.beginTransaction();
			session.save(dto);
			tx.commit();
			session.close();
			return true;
		}
	}

	@Override
	public boolean saveAll(List<MobileDto> list) {
		Session session = MobileConfiguration.getConnection().openSession();
		int count = 0;
		if (session.equals(null)) {
			return false;
		} else {
			Transaction tx = session.beginTransaction();

			
			for (MobileDto dt : list) {
				count++;
				session.save(dt);
				System.out.println(count);
			}
			tx.commit();
			session.close();
			return true;
		}
	}

	@Override
	public List<MobileDto> readAll() {
		
		Session session = MobileConfiguration.getConnection().openSession();
		if(session.equals(null)) {
			System.out.println("session is null");
			return null;
		} else {
			Transaction tx  = session.beginTransaction();
			List<MobileDto> list = session.createCriteria(MobileDto.class).list();
			tx.commit();
			session.close();
			return list;
		}
	}

}
