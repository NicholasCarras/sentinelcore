package com.nick.sentinelcore.controller;

import com.nick.sentinelcore.model.Node;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
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
}
