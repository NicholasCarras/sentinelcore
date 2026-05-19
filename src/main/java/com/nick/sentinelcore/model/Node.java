package com.nick.sentinelcore.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Node {

    // Attributes

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String status;
    private LocalDateTime lastHeartBeat;

    // Constructors for node

    public Node() {

    }

    public Node(String name, String status, LocalDateTime now) {
        this.name = name;
        this.status = status;
        this.lastHeartBeat = now;
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getLastHeartBeat() { return lastHeartBeat; }

    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLastHeartBeat(LocalDateTime now) { this.lastHeartBeat = now; }
}