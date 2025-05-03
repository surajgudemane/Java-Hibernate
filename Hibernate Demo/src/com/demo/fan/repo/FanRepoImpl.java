package com.demo.fan.repo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.fan.config.HibernateConfig;
import com.demo.fan.dto.FanDto;

public class FanRepoImpl implements FanRepo {

	@Override
	public boolean save(FanDto dto) {
		Session session = HibernateConfig.getConnection().openSession();
		if (session != null) {

			Transaction transaction = session.beginTransaction();
			session.save(dto);

			transaction.commit();
			session.close();

			return true;
		} else
			return false;

	}

}
