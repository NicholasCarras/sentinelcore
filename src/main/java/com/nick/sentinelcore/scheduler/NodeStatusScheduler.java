package com.nick.sentinelcore.scheduler;

import com.nick.sentinelcore.service.NodeService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class NodeStatusScheduler {

    private NodeService nodeService;

    public NodeStatusScheduler(NodeService nodeService) {
        this.nodeService = nodeService;
    }

    @Scheduled(fixedRate = 10000)
    public void autoCheckNodeStatuses() {
        nodeService.checkNodeStatuses();
    }
}