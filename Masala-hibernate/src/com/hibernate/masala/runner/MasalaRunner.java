package com.hibernate.masala.runner;

import com.hibernate.masala.dto.MasalaDto;
import com.hibernate.masala.repo.MalasaRepo;


public class MasalaRunner {

	public static void main(String[] args) {
		
		MalasaRepo repo = new MalasaRepo();
	
		
		MasalaDto d1 = new MasalaDto(1, "Teju", "Chilly", 20, 10);
		MasalaDto d2 = new MasalaDto(2, "Estren", "Garam Masala", 15, 5);
		MasalaDto d3 = new MasalaDto(3, "Achhi", "Pepper", 25, 15);
		MasalaDto d4 = new MasalaDto(4, "Achhi", "Chicken", 20, 20);
		
//		repo.save(d1, d2, d3, d4);
		
//		System.out.println(repo.readAll());
		
//		System.out.println(repo.findByName("Achhi"));
		
//		repo.updateQuntityByPrice(10,5);
		
//		repo.deleteByName("Achhi");
	}
	
}
