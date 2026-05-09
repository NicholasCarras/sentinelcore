package com.nick.sentinelcore.controller;

import com.nick.sentinelcore.model.Node;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@RestController
public class NodeController {

    // Endpoint for getting nodes

    @GetMapping("/nodes")
    public List<Node> node() {

        // Placeholder nodes

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
