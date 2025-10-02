package com.rest.hotel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.hotel.entity.Room;
import com.rest.hotel.repository.RoomRepository;

@Service
public class RoomService {

	@Autowired
	private RoomRepository roomRepository;
	
	public List<Room>getAllRooms(){
		return roomRepository.findAll();
	}
	
	public Optional<Room>getRoomById(Long id){
		return roomRepository.findById(id);
	}
	
	public Room createRoom(Room room) {
		return roomRepository.save(room);
	}
	
	public Room updateRoom(Long id,Room roomDetails) {
		Room room=roomRepository.findById(id).orElseThrow(()->new RuntimeException("Room not found by id : "+id));
		
		room.setRoomNumber(roomDetails.getRoomNumber());
		room.setType(roomDetails.getType());
		room.setPrice(roomDetails.getPrice());
		room.setAvailable(roomDetails.isAvailable());
		return roomRepository.save(room);
	}
	
	public List<Room>getAvailableRooms(){
		return roomRepository.findByAvailableTrue();
	}
	
	/*
	 * public Optional<Room>deleteRoom(Long id){
	 * 
	 * }
	 */
	
}
