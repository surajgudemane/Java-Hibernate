package com.hibernate.trimmer.repo;

import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import com.hibernate.trimmer.config.TrimmerConfig;
import com.hibernate.trimmer.dto.TrimmerDto;

public class TrimmerRepoImpl implements TrimmerRepo{

	@Override
	public boolean save(TrimmerDto dto) {
		Session s = TrimmerConfig.getConnection().openSession();
		System.out.println(s);
		if(s != null) {
			Transaction t = s.beginTransaction();
			s.save(dto);
			t.commit();
			s.close();
			return true;
		}
		return true;
	}

	@Override
	public List readAll() {
		
		Session s = TrimmerConfig.getConnection().openSession();
		Transaction t = s.beginTransaction();
		
		Criteria c = s.createCriteria(TrimmerDto.class);
		List l = c.list();
		t.commit();
		s.close();
		return l;
	}

	@Override
	public List readByName(String[] name) {
		Session s = TrimmerConfig.getConnection().openSession();
		Transaction t = s.beginTransaction();
		Criteria c = s.createCriteria(TrimmerDto.class);
		List<TrimmerDto> l = c.list();
		
//		or
//		List<TrimmerDto> l = readAll();
		
		List<TrimmerDto> al = new ArrayList<TrimmerDto>();
		
		if(l.isEmpty() == false) {
			for(String n : name) {
				for(TrimmerDto dt : l) {
					if(name.equals(dt.getBrand())){
						al.add(dt);
					}
				}
			}
			t.commit();
			s.close();
			return al;
		}

		t.commit();
		s.close();
		return null;
	}

	@Override
	public boolean updateWarrantyByName(int warranty, String name) {
		
		Session s = TrimmerConfig.getConnection().openSession();
		
		List<TrimmerDto> ll = readAll();
		
		if(ll.isEmpty() == false) {
			for(TrimmerDto dt : ll) {
				if(name.equals(dt.getBrand())) {
					Transaction t = s.beginTransaction();
					dt.setWarranty(warranty);
					s.update(dt);
					t.commit();
					s.close();
					return true;
				}
			}
		}
		
		return false;
	}

	
	@Override
	public boolean deleteByName(String name) {
		Session s = TrimmerConfig.getConnection().openSession();
		Transaction t = s.beginTransaction();
		
		List<TrimmerDto> ll = readAll();
		
		if(ll.isEmpty() == false) {
			for(TrimmerDto dto : ll) {
				if(name.equals(dto.getBrand())) {
					s.delete(dto);
					
				}
			}
			
			return true;
		}
		
		return false;
	}

}
