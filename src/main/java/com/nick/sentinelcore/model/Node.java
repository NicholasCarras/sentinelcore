package com.nick.sentinelcore.model;

public class Node {

    // Attributes

    private int id;
    private String name;
    private String status;

    // Constructors for node

    public Node() {

    }

    public Node(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
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
}