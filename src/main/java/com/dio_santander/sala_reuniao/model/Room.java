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
    private String date;
    private String startHour;
    private String endHour;

    public Room() {
    }

    public Room(long id, String name, String date, String startHour, String endHour) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name="name", nullable = false)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="date", nullable = false)
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    @Column(name="startHour", nullable = false)
    public String getStartHour() {
        return this.startHour;
    }
    
    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }
    
    @Column(name="endHour", nullable = false)
    public String getEndHour() {
        return this.endHour;
    }
    
    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }
    
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", date='" + getDate() + "'" +
            ", startHour='" + getStartHour() + "'" +
            ", endHour='" + getEndHour() + "'" +
            "}";
    }
}
