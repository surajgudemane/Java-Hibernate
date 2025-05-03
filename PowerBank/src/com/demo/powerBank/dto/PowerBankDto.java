package com.demo.powerBank.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "powerBank_info")
public class PowerBankDto {

	@Id
	private int id;
	private String brand;
	private int capacity;
	private double weight;
	private int price;
	
	public PowerBankDto() {
		super();
	}
	
	public PowerBankDto(int id, String brand, int capacity, double weight, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.capacity = capacity;
		this.weight = weight;
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
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "PowerBankDto [id=" + id + ", brand=" + brand + ", capacity=" + capacity + ", weight=" + weight
				+ ", price=" + price + "]";
	}
	
	
	
	
}
