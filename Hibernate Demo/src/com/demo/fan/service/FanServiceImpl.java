package com.demo.fan.service;

import com.demo.fan.dto.FanDto;
import com.demo.fan.repo.FanRepo;
import com.demo.fan.repo.FanRepoImpl;

public class FanServiceImpl implements FanService {

	public FanRepo repo = new FanRepoImpl();


	@Override
	public boolean save(FanDto dto) {
		if (dto.getId() > 0) {
			if (dto.getName().length() > 2) {

				if (dto.getType().length() > 2) {

					if (dto.getPrice() > 999) {

						return repo.save(dto);
					} else {
						System.out.println("Price should be > 999");
					}
				} else {
					System.out.println("Fan type character should be  > 2");
				}
			} else {
				System.out.println("Fan Name character should be > 2");
			}
		} else {
			System.out.println("Fan ID should be Unique and > 0");
		}
		return false;
	}

}
