package com.demo.powerBank.runner;

import com.demo.powerBank.dto.PowerBankDto;
import com.demo.powerBank.service.PowerBankService;
import com.demo.powerBank.service.PowerBankServiceImpl;

public class PowerBankRunner {

	public static void main(String[] ag) {

		PowerBankService service = new PowerBankServiceImpl();

		PowerBankDto d1 = new PowerBankDto(1, "mi", 10000, 300, 1299);
		PowerBankDto d2 = new PowerBankDto(2, "Zebronics", 30000, 950, 2900);
		PowerBankDto d3 = new PowerBankDto(3, "Realme", 15000, 450, 1500);
		PowerBankDto d4 = new PowerBankDto(4, "Oppo", 20000, 600, 2400);
		PowerBankDto d5 = new PowerBankDto(5, "Poco", 10000, 290, 1190);
		PowerBankDto d6 = new PowerBankDto(6, "Sysca", 19000, 450, 1380);
		PowerBankDto d7 = new PowerBankDto(7, "Crompton", 10000, 300, 1050);

		PowerBankDto[] arr = {d2, d3, d4, d5, d6, d7};
		
//		service.saveAll(arr);
		
//		for( PowerBankDto dt : service.findByCapacity(30000)) {
//			System.out.println(dt);
//		}
		
//		if (service.save(d1)) {
//			System.out.println("Saved Sucessfully");
//		} else {
//			System.out.println("Something went wrong while saving");
//		}
		
//		System.out.println(service.findByCapacity(7));
		
		if( service.deleteByWeightCapacityAndName(600, 20000, "mi")) {
			System.out.println("Deleted sucessfully");
		} else {
			System.out.println("Something went wrong while Deleting");
		}
		
	}
}
