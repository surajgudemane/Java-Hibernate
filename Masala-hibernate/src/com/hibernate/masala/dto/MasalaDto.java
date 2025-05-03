package com.hibernate.masala.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MasalaDto {

	@Id
	private int id;
	private String brand;
	private String type;
	private int quantity;
	private int price;
	public MasalaDto(int id, String brand, String type, int quantity, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.type = type;
		this.quantity = quantity;
		this.price = price;
	}
	public MasalaDto() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MasalaDto [id=" + id + ", brand=" + brand + ", type=" + type + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
	
	
	
}
