package com.nick.sentinelcore.service;

import com.nick.sentinelcore.model.Node;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

// Shows Spring Boot this is a service

@Service
public class NodeService {

    public List<Node> getAllNodes() {

        Node alpha = new Node(1, "Alpha", "Online");
        Node beta = new Node(2, "Beta", "Offline");
        Node gamma = new Node(3, "Gamma", "Offline");

        List<Node> nodeList = new ArrayList<>();

        nodeList.add(alpha);
        nodeList.add(beta);
        nodeList.add(gamma);

        return nodeList;
    }

}
