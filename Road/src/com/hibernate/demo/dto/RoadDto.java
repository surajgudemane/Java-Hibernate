package com.hibernate.demo.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "road_demo_data")
public class RoadDto {

	@Id
	private int id;
	private String name;
	private int km;

	public RoadDto() {
		super();
	}

	public RoadDto(int id, String name, int km) {
		super();
		this.id = id;
		this.name = name;
		this.km = km;
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

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return "RoadDto [id=" + id + ", name=" + name + ", km=" + km + "]";
	}

}
