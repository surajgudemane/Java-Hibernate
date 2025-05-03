package com.hibernate.camera.repo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.camera.config.CameraConfig;
import com.hibernate.camera.dto.CameraDto;

public class CameraRepoImpl implements CameraRepo {

	@Override
	public boolean save(CameraDto... dto) {
		Session s = CameraConfig.getConnection().openSession();
		if(s != null) {
			Transaction t = s.beginTransaction();
			for(CameraDto dt : dto) {
				s.save(dt);
			}
			t.commit();
			s.close();
			return true;
		}
		return false;
	}

	@Override
	public List readAll() {
		Session s = CameraConfig.getConnection().openSession();
		if(s != null) {
			Criteria c = s.createCriteria(CameraDto.class);
			List l = c.list();
			return l;
		}
		return null;
	}

	@Override
	public List readByPrice(int price) {
		List<CameraDto> l = readAll();
		List list = new ArrayList();
		for(CameraDto dt : l) {
			if(dt.getPrice() == price) {
				list.add(dt);
			}
		}
		return list;
	}

	@Override
	public boolean updateWarrentByName(int warrent, String name) {
		Session s = CameraConfig.getConnection().openSession();
		if(s != null) {
			List<CameraDto> l = readAll();
			Transaction t = s.beginTransaction();
			for(CameraDto dto : l) {
				if(dto.getName().equals(name)) {
					dto.setWarrenty(warrent);
					s.update(dto);
				}
			}
			t.commit();
			s.close();
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteByName(String name) {
		Session s = CameraConfig.getConnection().openSession();
		if(s != null) {
			boolean b = false;
			List<CameraDto> l = readAll();
			Transaction t = s.beginTransaction();
			for(CameraDto dto : l) {
				if(dto.getName().equals(name)) {
					s.delete(dto);
					b = true;
				}
			}
			if(b) {
				t.commit();
				s.close();
				return true;
			}
		}
		return false;
	}

}
