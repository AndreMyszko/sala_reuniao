package com.dio_santander.sala_reuniao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="meetingroom")
public class Room {

    private long id;
    private String name;
    private String data;
    private String startHour;
    private String endHour;

    public Room() {
    }

    public Room(long id, String name, String data, String startHour, String endHour) {
        this.id = id;
        this.name = name;
        this.data = data;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStartHour() {
        return this.startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    public String getEndHour() {
        return this.endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }
    
}
