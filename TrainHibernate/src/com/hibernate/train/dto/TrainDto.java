package com.hibernate.train.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "train_info")
public class TrainDto {

	@Id
	private int id;
	private String tName;
	private String from;
	private String to;
	private int distance;
	private int price;
	
	public TrainDto() {
		super();
	}
	
	public TrainDto(int id, String tName, String from, String to, int distance, int price) {
		super();
		this.id = id;
		this.tName = tName;
		this.from = from;
		this.to = to;
		this.distance = distance;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TrainDto [id=" + id + ", tName=" + tName + ", from=" + from + ", to=" + to + ", distance=" + distance
				+ ", price=" + price + "]";
	}
	
}
