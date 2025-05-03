package com.hibernate.camera.runner;

import com.hibernate.camera.dto.CameraDto;
import com.hibernate.camera.repo.CameraRepo;
import com.hibernate.camera.repo.CameraRepoImpl;

public class CameraRunner {

	public static void main(String[] args) {
		
		CameraRepo repo = new CameraRepoImpl();
		
		CameraDto d1 = new CameraDto(1, "Canon", 2, "1920X1024", 141009);
		CameraDto d2 = new CameraDto(2, "Nikon", 1, "1720X1224", 121099);
		CameraDto d3 = new CameraDto(3, "Kechoda", 2, "4420X2820", 220999);
		
//		repo.save(d1, d2, d3);
		
//		System.out.println(repo.readAll());
		
//		System.out.println(repo.readByPrice(141009));
		
//		repo.updateWarrentByName(4, "Nikon");
		
//		repo.deleteByName("Kechoda");
		
		System.out.println(repo.deleteByName("Kechoda") ? "Deleted": "Error");
		
	}
	
}
