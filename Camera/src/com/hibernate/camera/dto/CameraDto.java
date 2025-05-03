package com.hibernate.camera.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "camera_info")
public class CameraDto {

	@Id
	private int id;
	private String name;
	private int warrenty;
	private String resolution;
	private int price;
	
	public CameraDto() {
		super();
	}
	
	public CameraDto(int id, String name, int warrenty, String resolution, int price) {
		super();
		this.id = id;
		this.name = name;
		this.warrenty = warrenty;
		this.resolution = resolution;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWarrenty() {
		return warrenty;
	}
	public void setWarrenty(int warrenty) {
		this.warrenty = warrenty;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "CameraDto [id=" + id + ", name=" + name + ", warrenty=" + warrenty + ", resolution=" + resolution
				+ ", price=" + price + "]";
	}
}
