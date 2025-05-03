package com.hibernate.trimmer.runner;

import java.util.Arrays;
import java.util.List;

import com.hibernate.trimmer.dto.TrimmerDto;
import com.hibernate.trimmer.repo.TrimmerRepo;
import com.hibernate.trimmer.service.TrimmerService;
import com.hibernate.trimmer.service.TrimmerServiceImpl;

public class TrimmerRunner {

	private static TrimmerService service = new TrimmerServiceImpl();
	
	public static void main(String[] args) {
		
		TrimmerDto d1 = new TrimmerDto(1, "Nova", 1, 60, "Stainless Steel");
		TrimmerDto d2 = new TrimmerDto(2, "Phillips", 2, 80, "Silver Blade");
		TrimmerDto d3 = new TrimmerDto(3, "Havells", 1, 40, "Iron Blade");
		TrimmerDto d4 = new TrimmerDto(4, "Nokia", 5, 120, "Gold Blade");
		TrimmerDto d5 = new TrimmerDto(5, "Orient", 1, 60, "Alluminium Blade");
		TrimmerDto d6 = new TrimmerDto(6, "Nova", 2, 30, "Iron Blade");
		
		TrimmerDto[] dtos = {d1, d2, d3, d4, d5};
//		List l = Arrays.asList(dtos);
		
//		for(TrimmerDto dto : dtos) {
//			System.out.println(service.save(dto) ? "Saved Sucessfully": "Save Operation Failed");
//		}
		
//		System.out.println(service.save(d1) ? "Saved Sucessfully": "Save Operation Failed");
		
//		System.out.println(service.readAll());
		
//		System.out.println(service.readBYName("Nova", "Havells", "Nokia"));
		
//		System.out.println(service.updateWarrantyByName(2,"Nokia") ? "updated Sucessfully": "Update Operation Failed");
		
//		System.out.println(service.deleteByName("Nova") ? "Delete Sucessfully": "Delete Operation Failed");
		
	}
	
}
