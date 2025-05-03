package com.demo.train.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "train_data")
public class TrainDto {

	@Id
	private int id;
	private String name;
	private int trainNo;
	private int distance;
	
	public TrainDto() {
		super();
	}
	
	public TrainDto(int id, String name, int trainNo, int distance) {
		super();
		this.id = id;
		this.name = name;
		this.trainNo = trainNo;
		this.distance = distance;
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
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "TrainDto [id=" + id + ", name=" + name + ", trainNo=" + trainNo + ", distance=" + distance + "]";
	}
	
}
