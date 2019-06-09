package com.apipractice.ApiPractice.entity;

public class Value {

	private Integer id;
	private String joke;

	
	public Value() {
		super();
	}
	public Value(Integer id, String joke) {
		super();
		this.id = id;
		this.joke = joke;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getJoke() {
		return joke;
	}
	public void setJoke(String joke) {
		this.joke = joke;
	}
	
	
	@Override
	public String toString() {
		return "Value [id=" + id + ", joke=" + joke + "]";
	}
	
	
	
	
}
