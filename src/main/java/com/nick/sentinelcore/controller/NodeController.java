package com.nick.sentinelcore.controller;

import com.nick.sentinelcore.model.Node;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.nick.sentinelcore.service.NodeService;

@RestController
public class NodeController {

    private NodeService nodeService;

    public NodeController(NodeService nodeService) {
        this.nodeService = nodeService;
    }

    @GetMapping("/nodes")
    public List<Node> nodes() {
        return nodeService.getAllNodes();
    }

    @PostMapping("/nodes")
    public Node addNode(@RequestBody Node node) {
        return nodeService.addNode(node);
    }

    @PostMapping("/nodes/{id}/heartbeat")
    public Node nodeHeartBeat(@PathVariable int id) {
        return nodeService.recordHeartBeat(id);
    }

    @GetMapping("/nodes/status-check")
    public List<Node> nodeStatusCheck() {
        return nodeService.checkNodeStatuses();
    }
}