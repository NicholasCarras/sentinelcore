package com.nick.sentinelcore.model;
import java.time.LocalDateTime;

public class Node {

    // Attributes

    private int id;
    private String name;
    private String status;
    private LocalDateTime lastHeartBeat;

    // Constructors for node

    public Node() {

    }

    public Node(int id, String name, String status, LocalDateTime now) {
        this.id = id;
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