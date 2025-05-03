package com.demo.mobile;

import java.util.Arrays;
import java.util.List;

import com.demo.mobile.dto.MobileDto;
import com.demo.mobile.service.MobileService;
import com.demo.mobile.service.MobileServiceImpl;

public class MobileRunner {

	public static void main(String [] args) {
		
		MobileService ser = new MobileServiceImpl();
		
		MobileDto d1 = new MobileDto(1, "iphone 7", 2, "256 gb", 35999.9);
		MobileDto d2 = new MobileDto(2, "Vivo v44", 8, "64 gb", 17009.9);
		MobileDto d3 = new MobileDto(3, "Oppo k90+", 6, "128 gb", 21898.9);
		MobileDto d4 = new MobileDto(4, "Ralme 15 pro", 12, "128 gb", 23989.9);
		MobileDto d5 = new MobileDto(5, "Ralme 15 pro +", 16, "512 gb", 33999.9);
		MobileDto d6 = new MobileDto(6, "redmi 17c", 8, "256 gb", 19999.9);
		
		MobileDto[] arr = {d1, d2, d3, d4, d5};
		List<MobileDto> list = Arrays.asList(arr);
		
//		ser.save(d6);
		
//		ser.saveAll(list);
		
		for(MobileDto dt : ser.readAll()) {
			System.out.println(dt);
		}
		
	}
	
}
