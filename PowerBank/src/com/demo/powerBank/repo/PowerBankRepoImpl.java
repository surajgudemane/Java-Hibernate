package com.demo.powerBank.repo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.powerBank.config.PowerBankConfiguration;
import com.demo.powerBank.dto.PowerBankDto;

public class PowerBankRepoImpl implements PowerBankRepo {

	@Override
	public boolean save(PowerBankDto dto) {
		Session session = PowerBankConfiguration.getConnection().openSession();
		if (session != null) {
			Transaction tx = session.beginTransaction();
			session.save(dto);

			tx.commit();
			session.close();

			return true;
		}
		return false;
	}

	@Override
	public boolean save(PowerBankDto[] arr) {
		Session session = PowerBankConfiguration.getConnection().openSession();
		if (session != null) {

			Transaction tx = session.beginTransaction();

			for (PowerBankDto dt : arr) {
				session.save(dt);
				System.out.println(dt.getId() + " : Saved Sucessfully");
			}

			tx.commit();
			session.close();

			return true;

		}
		return false;
	}

	@Override
	public List<PowerBankDto> readAll() {

		Session session = PowerBankConfiguration.getConnection().openSession();
		if (session != null) {

			Transaction tx = session.beginTransaction();

			Criteria c = session.createCriteria(PowerBankDto.class);

			List<PowerBankDto> list = c.list();

			return list;
		}

		return null;
	}

	@Override
	public PowerBankDto findById(int id) {

		Session session = PowerBankConfiguration.getConnection().openSession();
		if (session != null) {

			Transaction tx = session.beginTransaction();

			PowerBankDto dt = session.get(PowerBankDto.class, id);

			tx.commit();
			session.close();

			return dt;

		}

		return null;
	}

	@Override
	public List<PowerBankDto> findByCapacity(int capacity) {
		Session session = PowerBankConfiguration.getConnection().openSession();

		if (session != null) {
			Transaction tx = session.beginTransaction();

			List<PowerBankDto> allDto = session.createCriteria(PowerBankDto.class).list();

			List<PowerBankDto> list = new ArrayList<PowerBankDto>();

			for (PowerBankDto dt : allDto) {
				if (dt.getCapacity() == capacity) {
					list.add(dt);
				}
			}
			tx.commit();
			session.close();
			return list;
		}

		return null;
	}

	@Override
	public boolean updateCapacityAndWeightByName(int capacity, int weight, String name) {
		Session session = PowerBankConfiguration.getConnection().openSession();

		if (session != null) {
			Transaction tx = session.beginTransaction();

			List<PowerBankDto> allDto = session.createCriteria(PowerBankDto.class).list();

			List<PowerBankDto> list = new ArrayList<PowerBankDto>();

			for (PowerBankDto dt : allDto) {
				if (dt.getBrand().equals(name)) {

					dt.setCapacity(capacity);
					dt.setWeight(weight);

					session.update(dt);

				}
			}
			tx.commit();
			session.close();
			return true;
		}

		return false;
	}

	@Override
	public boolean deleteByWeightCapacityAndName(int weight, int capacity, String name) {
		Session session = PowerBankConfiguration.getConnection().openSession();

		if (session != null) {
			Transaction tx = session.beginTransaction();

			List<PowerBankDto> allDto = session.createCriteria(PowerBankDto.class).list();

			List<PowerBankDto> list = new ArrayList<PowerBankDto>();

			for (PowerBankDto dt : allDto) {
				if (dt.getBrand().equals(name) && dt.getCapacity() == capacity && dt.getWeight() == weight) {

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
