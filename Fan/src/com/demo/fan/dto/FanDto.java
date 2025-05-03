package com.demo.fan.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fan_info")
public class FanDto {
	
	@Id
	private int id;
	private String brand;
	private String type;
	private String speed;
	private int price;
	
	public FanDto() {
		super();
	}
	
	public FanDto(int id, String brand, String type, String speed, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.type = type;
		this.speed = speed;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FanDto [id=" + id + ", brand=" + brand + ", type=" + type + ", speed=" + speed + ", price=" + price
				+ "]";
	}


}
