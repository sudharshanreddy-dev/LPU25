package com.lpu.hotel;

import java.util.List;

public class Hotel {
	String name;
	String address;
	List<Level> levels;
	public Hotel(String name, String address, List<Level> levels) {
		super();
		this.name = name;
		this.address = address;
		this.levels = levels;
	}
	@Override
	public String toString() {
		return "Hotel [name=" + name + ", address=" + address + ", levels=" + levels + "]";
	}
	

}
