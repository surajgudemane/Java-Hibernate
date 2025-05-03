package com.demo.mobile.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mobile_info")
public class MobileDto {

	@Id
	private int id;
	private String name;
	private int ram;
	private String rom;
	private double price;
	
	
	public MobileDto(int id, String name, int ram, String rom, double price) {
		super();
		this.id = id;
		this.name = name;
		this.ram = ram;
		this.rom = rom;
		this.price = price;
	}
	
	public MobileDto() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getRom() {
		return rom;
	}
	public void setRom(String rom) {
		this.rom = rom;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "MobileDto [id=" + id + ", name=" + name + ", ram=" + ram + ", rom=" + rom + ", price=" + price + "]";
	}
	
}
