package com.hibernate.trimmer.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trimmer_info")
public class TrimmerDto {

	@Id
	private int id;
	private String brand;
	private int warranty;
	private int runingTime;
	private String meterial;
	
	public TrimmerDto() {
		super();
	}
	
	public TrimmerDto(int id, String brand, int warranty, int runingTime, String meterial) {
		super();
		this.id = id;
		this.brand = brand;
		this.warranty = warranty;
		this.runingTime = runingTime;
		this.meterial = meterial;
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
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	public int getRuningTime() {
		return runingTime;
	}
	public void setRuningTime(int runingTime) {
		this.runingTime = runingTime;
	}
	public String getMeterial() {
		return meterial;
	}
	public void setMeterial(String meterial) {
		this.meterial = meterial;
	}
	
	@Override
	public String toString() {
		return "TrimmerDto [id=" + id + ", brand=" + brand + ", warranty=" + warranty + ", runingTime=" + runingTime
				+ ", meterial=" + meterial + "]";
	}
	
}
