package com.nick.sentinelcore.model;

public class Node {

    private int id;
    private String name;
    private String status;

    public Node(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

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
