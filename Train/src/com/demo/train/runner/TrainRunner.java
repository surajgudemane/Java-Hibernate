package com.demo.train.runner;

import java.util.Arrays;

import org.hibernate.internal.build.AllowSysOut;

import com.demo.train.dto.TrainDto;
import com.demo.train.repo.TrainRepo;
import com.demo.train.service.TrainService;
import com.demo.train.service.TrainServiceimpl;

import antlr.collections.List;

public class TrainRunner {

	private static TrainService service = new TrainServiceimpl();

	public static void main(String[] args) {

		TrainDto d1 = new TrainDto(1, "TLG Express", 20615, 274);
		TrainDto d2 = new TrainDto(2, "BLR Express", 25235, 308);
		TrainDto d3 = new TrainDto(3, "SMET Express", 21455, 854);
		TrainDto d4 = new TrainDto(4, "ANF Express", 48568, 558);
		TrainDto d5 = new TrainDto(5, "TKR Express", 20496, 274);
		TrainDto d6 = new TrainDto(6, "BDVT Express", 20019, 424);
		TrainDto d7 = new TrainDto(7, "ANF Express", 48558, 558);

		TrainDto[] arr = { d1, d2, d3, d4, d5, d6, d7 };
		java.util.List<TrainDto> list = Arrays.asList(arr);

//		service.save(d5);

//		for(TrainDto dt : list) {
//			if(service.save(dt)) {
//				System.out.println("Saved Sucessfully");
//				System.out.println(dt);
//			} else {
//				System.out.println("Something Went Wrong");
//			}
//		}

//		for(TrainDto dt : service.readAll()) {
//			System.out.println(dt+" ======= = = = = = = =");
//			System.out.println("- - - - - - - - - - - - - - -- - - - - - - - - - - - - - -- - - - - - - - - - - - - - - -");
//		}

//		for(TrainDto dt : service.readAll()) {
//			System.out.println(dt);
//		}

//		System.out.println(service.readAll());

//		System.out.println(service.findById(4));

//		if(service.updateDistanceByName(444, "ANF Express")) {
//			System.out.println("Updated Sucessfully");
//		} else {
//			System.out.println("Update Went Wrong");			
//		}

//		if(service.deleteByDistance(274) ) {
//			System.out.println("Deleted Sucessfully");
//		} else {
//			System.out.println("Delete Went Wrong");			
//		}
	}

}
