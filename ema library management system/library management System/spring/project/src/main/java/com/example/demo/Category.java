package com.example.demo;

public class Category {
	int id;
	String name;
	String images;
	String description;
	
	
	public Category() {
		super();
	}


	public Category(int id, String name, String images, String description) {
		super();
		this.id = id;
		this.name = name;
		this.images = images;
		this.description = description;
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


	public String getImages() {
		return images;
	}


	public void setImages(String images) {
		this.images = images;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", images=" + images + ", description=" + description
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getImages()=" + getImages()
				+ ", getDescription()=" + getDescription() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
