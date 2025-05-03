package com.demo.movie.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie_info")
public class MovieDto {

	@Id
	private int id;
	private String name;
	private int duration;
	private String type;
	private double budget;
	
	public MovieDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MovieDto(int id, String name, int duration, String type, double budget) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.type = type;
		this.budget = budget;
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

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "MovieDto [id=" + id + ", name=" + name + ", duration=" + duration + ", type=" + type + ", budget="
				+ budget + "]";
	}
	
}
