package com.mobilestore;

public class Mobile {
	
	private int mid;
	private String name;
	private String brand;
	private float price;
	
	
	public Mobile()
	{
		
	}


	public Mobile(int mid, String name, String brand, float price)
	{
		super();	this.mid = mid;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}


	public int getMid()
	{
		return mid;
	}


	public void setMid(int mid) 
	{
		this.mid = mid;
	}


	public String getName() 
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public String getBrand() 
	{
		return brand;
	}


	public void setBrand(String brand)
	{
		this.brand = brand;
	}


	public float getPrice()
	{
		return price;
	}


	public void setPrice(float price)
	{
		this.price = price;
	}



	public String toString() 
	{
		return "Mobile [mid=" + mid + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
	
	
	

}
