package com.demo.movie.runner;

import java.util.Iterator;

import com.demo.movie.dto.MovieDto;
import com.demo.movie.service.MovieService;
import com.demo.movie.service.MovieServiceImpl;

public class MovieRunner {

	private static MovieService service = new MovieServiceImpl();
	
	public static void main(String[] args) {
		
		MovieDto demo = new MovieDto(9, "Avatara purusha", 168, "Thriller", 239.78);
		
		MovieDto d1 = new MovieDto(1, "Kantara", 156, "Devotional", 85.8);
		MovieDto d2 = new MovieDto(2, "KGF", 165, "Action", 245.45);
		MovieDto d3 = new MovieDto(3, "Vikranth Roona", 170, "Thiller", 210.34);
		MovieDto d4 = new MovieDto(4, "Kick", 145, "Action", 187.69);
		MovieDto d5 = new MovieDto(5, "Katera", 150, "Normal", 112.71);
		MovieDto d6 = new MovieDto(6, "Salar", 167, "Action", 315.29);
		MovieDto d7 = new MovieDto(7, "Mission Mangal", 167, "Sci-fi", 388.09);
		MovieDto d8 = new MovieDto(8, "Intersteller", 175, "Sci-fi", 689.79);
		
		MovieDto[] arr = {d1, d2, d3, d4, d5, d6, d7, d8};
		
//		if(service.save(arr)) {
//			System.out.println("Saved Sucessfully");
//		} else {
//			System.out.println("Something Went WrongWhile Saving");
//		}
		
//		for (MovieDto dt : service.readAll()) {
//			System.out.println(dt);
//		}
		
//		for (MovieDto dt : service.findByType("Action") ) {
//			System.out.println(dt);
//		}
		
//		if(service.updateTypeByName("Traditional", "Katera")) {
//			System.out.println("Updated Sucessfully");
//		} else {
//			System.out.println("Update Went Wrong");
//		}
		
		if(service.deleteByName("Salar")) {
			System.out.println("Deleted Sucessfully");
		} else {
			System.out.println("Delete Went Wrong");
		}
		
		
	}
	
}
