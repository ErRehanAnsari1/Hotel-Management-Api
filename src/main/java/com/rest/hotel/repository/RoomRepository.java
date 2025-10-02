package com.rest.hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.hotel.entity.Room;

public interface RoomRepository extends JpaRepository<Room,Long> {

	List<Room>findByAvailableTrue();
	List<Room>findByType(String type);
}
