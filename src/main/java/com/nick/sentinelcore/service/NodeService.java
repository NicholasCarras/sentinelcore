package com.nick.sentinelcore.service;

import com.nick.sentinelcore.model.Node;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

// Shows Spring Boot this is a service

@Service
public class NodeService {

    private List<Node> listOfNodes;

    public NodeService() {
        listOfNodes = new ArrayList<>();

        // Default nodes

        Node alpha = new Node(1, "Alpha", "Online", LocalDateTime.now());
        Node beta = new Node(2, "Beta", "Offline", LocalDateTime.now());
        Node gamma = new Node(3, "Gamma", "Offline", LocalDateTime.now());

        listOfNodes.add(alpha);
        listOfNodes.add(beta);
        listOfNodes.add(gamma);
    }

    public List<Node> getAllNodes() {
        return listOfNodes;
    }

    public Node addNode(Node node) {
        listOfNodes.add(node);
        return node;
    }
}