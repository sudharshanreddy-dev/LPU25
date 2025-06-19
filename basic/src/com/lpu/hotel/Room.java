package com.lpu.hotel;

public class Room {
	
	int roomNo;
	String type;
	int rent;
	public Room(int roomNo, String type, int rent) {
		super();
		this.roomNo = roomNo;
		this.type = type;
		this.rent = rent;
	}
	@Override
	public String toString() {
		return "Room [roomNo=" + roomNo + ", type=" + type + ", rent=" + rent + "]";
	}
	

}
