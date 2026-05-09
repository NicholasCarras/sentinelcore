package com.nick.sentinelcore.model;

public class Node {

    // Attributes

    private int id;
    private String name;
    private String status;

    // Constructor for node

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
}