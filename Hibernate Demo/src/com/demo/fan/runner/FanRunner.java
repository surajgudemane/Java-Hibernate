package com.demo.fan.runner;

import com.demo.fan.dto.FanDto;
import com.demo.fan.service.FanService;
import com.demo.fan.service.FanServiceImpl;

import java.util.Arrays;
import java.util.List;

public class FanRunner {

	public static FanService service = new FanServiceImpl();

	public static void main(String[] args) {

		FanDto d1 = new FanDto(1, "Swing", "Wall Fan", 1499.56);
		FanDto d2 = new FanDto(2, "Usha", "Table Fan", 2499.99);
		FanDto d3 = new FanDto(3, "Havells", "Celling Fan", 4589.23);
		FanDto d4 = new FanDto(4, "Orient", "Table Fan", 8562.01);
		FanDto d5 = new FanDto(5, "Atomberg", "Celling Fan", 11586.78);

		FanDto[] arr = { d1, d2, d3, d4, d5 };

		List<FanDto> list = Arrays.asList(arr);

//		for (FanDto dt : list) {
//			service.save(dt);
//			System.out.println(dt);
//		}

//		if(service.save(d1)) {
//			System.out.println("Saved Sucessfully: "+d1);
//		} else {
//			System.out.println("Something went wrong");
//		}
		
		

	}

}
