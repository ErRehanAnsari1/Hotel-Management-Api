package com.rest.hotel.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.hotel.entity.Room;
import com.rest.hotel.service.RoomService;

@RestController
@RequestMapping("/api/rooms")

public class RoomController {
	
	@Autowired
	private RoomService roomService;

	
	
	
	
	//1.Get all rooms-200 OK
	
	@GetMapping
	public List<Room> getAllRooms(){
		return roomService.getAllRooms();
	}
	
	//get available rooms
	
	@GetMapping("/available")
	public List<Room>getAvailableRooms(){
		return roomService.getAvailableRooms();
	}
	
	//Get Room by ID-200 OK or 404 not found
	
	@GetMapping("/{id}")
	public ResponseEntity<Room>getRoomById(@PathVariable Long id){
		
		Optional<Room> room=roomService.getRoomById(id);
		
		return room.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
	
	//Create new hotelroom
	
	@PostMapping
	public ResponseEntity<Room> createRoom(@RequestBody Room room){
		
		Room savedRoom=roomService.createRoom(room);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedRoom);
	}
	
	//update room-200 OK or 404 not found
	
	@PutMapping("/{id}")
	public ResponseEntity<Room> updateRoom(@PathVariable Long id,@RequestBody Room roomDetails){
		try {
			Room updatedRoom=roomService.updateRoom(id, roomDetails);
			return ResponseEntity.ok(updatedRoom);
		}catch(RuntimeException e) {
		return ResponseEntity.notFound().build();
		}
	}
	
	/*
	 * @DeleteMapping("/{id}") public ResponseEntity<Void>deleteRoom(@PathVariable
	 * Long id){ roomService.deleteRoom(id); return ResponseEntity.ok().build(); }
	 */
}
