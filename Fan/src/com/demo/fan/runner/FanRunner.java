package com.demo.fan.runner;

import com.demo.fan.dto.FanDto;
import com.demo.fan.service.FanService;
import com.demo.fan.service.FanServiceImpl;

public class FanRunner {
	
	public static void main(String[] args) {
		
		
		FanService service = new FanServiceImpl();
		
		FanDto d1 = new FanDto(1,"Crompton", "Wall Fan", "1000rpm", 1400);
		FanDto d2 = new FanDto(2,"Orient", "Celling Fan", "1200rpm", 8900);
		FanDto d3 = new FanDto(3,"Havells", "Table Fan", "800rpm", 1299);
		FanDto d4 = new FanDto(4,"Atomberg", "Celling Fan", "1400rpm", 1290);
		FanDto d5 = new FanDto(5,"Usha", "Stand Fan", "1000rpm", 9990);
		FanDto d6 = new FanDto(6,"Bajaj", "Wall Fan", "1200rpm", 9580);
		
		if(service.save(d2)) {
			System.out.println("Saved Sucessfully");
		} else {
			System.out.println("Something went wrong while saving");
		}
		
	}

}
