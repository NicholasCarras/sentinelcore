package com.nick.sentinelcore.service;

import com.nick.sentinelcore.model.Node;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import java.time.Duration;

// Shows Spring Boot this is a service

@Service
public class NodeService {

    private List<Node> listOfNodes;

    public NodeService() {
        listOfNodes = new ArrayList<>();

        // Default nodes

        Node alpha = new Node("Alpha", "Online", LocalDateTime.now());
        Node beta = new Node("Beta", "Offline", LocalDateTime.now());
        Node gamma = new Node("Gamma", "Offline", LocalDateTime.now());

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

    public Node recordHeartBeat(int id) {
        for (int i = 0; i < listOfNodes.size(); i++) {
            if (listOfNodes.get(i).getId() == id) {
                listOfNodes.get(i).setStatus("Online");
                listOfNodes.get(i).setLastHeartBeat(LocalDateTime.now());
                return listOfNodes.get(i);
            }
        }
        return null;
    }

    public List<Node> checkNodeStatuses() {
        for (int i = 0; i < listOfNodes.size(); i++) {
            LocalDateTime start = listOfNodes.get(i).getLastHeartBeat();
            LocalDateTime now = LocalDateTime.now();
            long timeBetween = Duration.between(start, now).getSeconds();
            if (timeBetween <= 30) {
                listOfNodes.get(i).setStatus("Online");
            }
            else if (timeBetween > 30 && timeBetween <= 60) {
                listOfNodes.get(i).setStatus("Warning");
            }
            else {
                listOfNodes.get(i).setStatus("Offline");
            }
        }
        return listOfNodes;
    }
}