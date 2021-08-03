package com.dio_santander.sala_reuniao.repository;

import com.dio_santander.sala_reuniao.model.Room;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepositoy extends JpaRepository<Room, Long> {
    
}
