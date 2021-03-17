package com.exercise;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category{

	@JsonProperty("id")
	private int id;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"Category{" + 
			"id = '" + id + '\'' + 
			"}";
		}
}