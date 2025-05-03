package com.demo.fan.repo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.fan.config.FanConfig;
import com.demo.fan.dto.FanDto;

public class FanRepoImpl implements FanRepo {

	@Override
	public boolean save(FanDto dto) {
		
		Session session = FanConfig.getConnection().openSession();
		
		if(session != null) {
			Transaction tx = session.beginTransaction();
			session.save(dto);
			tx.commit();
			session.close();
			return true;
		}
		
		return false;
	}

}
