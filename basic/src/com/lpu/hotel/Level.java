package com.lpu.hotel;

import java.util.List;

public class Level {
	List<Room> rooms;
	int levelno;
	public Level(List<Room> rooms, int levelno) {
		super();
		this.rooms = rooms;
		checkValidity(rooms);
		this.levelno = levelno;
	}
	private void checkValidity(List<Room> rooms2) {
		int count = 0;
		for(Room room : rooms)
		{
			if(room.getClass() == Suite.class)
				count++;
		}
		if(count < 1 || count > 3)
			throw new RuntimeException();
		
	}
	@Override
	public String toString() {
		return "Level [rooms=" + rooms + ", levelno=" + levelno + "]";
	}
	

}
