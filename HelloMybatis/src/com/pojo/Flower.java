package com.pojo;

public class Flower {
	private int id;
	private String name;
	private  Float price;
	private String production;
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
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	@Override
	public String toString() {
		return "Flower [id=" + id + ", name=" + name + ", price=" + price + ", production=" + production + "]";
	}
	
}
