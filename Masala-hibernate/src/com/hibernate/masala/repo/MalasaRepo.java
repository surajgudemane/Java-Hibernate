package com.hibernate.masala.repo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.masala.config.MasalaConfig;
import com.hibernate.masala.dto.MasalaDto;

public class MalasaRepo {

	public boolean save(MasalaDto ... dtos ) {
		Session s = MasalaConfig.getConnection().openSession();
		
		Transaction tnx = s.beginTransaction();
		for(MasalaDto dto : dtos) {
			s.persist(dto);
		}
		tnx.commit();
		s.close();
		return true;
	}
	
	public List<MasalaDto> readAll(){
		Session s = MasalaConfig.getConnection().openSession();
		
		Criteria c = s.createCriteria(MasalaDto.class);
		List<MasalaDto> list  = c.list();
	
		s.close();
		return list;
	}
	
	public List<MasalaDto> findByName(String name){
		Session s = MasalaConfig.getConnection().openSession();
		
		List<MasalaDto> readAll  = readAll();
		List<MasalaDto> list = new ArrayList<MasalaDto>();
		for(MasalaDto dto : readAll) {
			if(dto.getBrand().equals(name)) {
				list.add(dto);
			}
		}
	
		s.close();
		return list;
	}
	
	public boolean updateQuntityByPrice(int quntity, int price) {
		Session s = MasalaConfig.getConnection().openSession();
		
		Transaction tnx = s.beginTransaction();
		
		List<MasalaDto> readAll  = readAll();
		
		for(MasalaDto dto : readAll) {
			if(dto.getPrice() == price) {
				dto.setQuantity(quntity);
				s.update(dto);
			}
		}
		
		tnx.commit();
		s.close();
		return true;
	}
	
	public boolean deleteByName(String name) {
		Session s = MasalaConfig.getConnection().openSession();
		
		Transaction tnx = s.beginTransaction();
		
		List<MasalaDto> readAll  = readAll();
		
		for(MasalaDto dto : readAll) {
			if(dto.getBrand().equals(name)) {
				s.delete(dto);
			}
		}
		
		tnx.commit();
		s.close();
		return true;
	}
	
}
