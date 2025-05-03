package com.hibernate.train.repo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.train.connection.TrainConnection;
import com.hibernate.train.dto.TrainDto;

public class TrainRepoImpl implements TrainRepo {

	
	@Override
	public boolean save(TrainDto dto) {
		Session session = TrainConnection.getConnection().openSession();

		Transaction tx = session.beginTransaction();
 		session.save(dto);
		tx.commit();
		
		session.close();
		return true;
	}

}
