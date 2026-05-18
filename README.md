# SentinelCore

A fault-tolerant distributed monitoring system designed to simulate monitoring of mission-critical systems through heartbeat tracking and health monitoring.

SentinelCore continuously monitors node status, detects failures, and can generate alerts when nodes become unhealthy or stop responding.

---

## Project Purpose

This project was built to strengthen backend software engineering skills while demonstrating concepts commonly used in real-world distributed systems such as:

- Service communication
- Health monitoring
- Fault detection
- REST API development
- Database persistence
- Containerization
- Scalable architecture

The goal is to simulate systems similar to those used in large-scale infrastructure and mission-critical environments.

---

## Features

Current Features:

- Health endpoint

- Node registration

- Retrieve all nodes

- Heartbeat API

- In-memory node storage

- RESTful API architecture

- Postman endpoint testing

Planned Features:

- Automatic node health status updates

- Failure detection logic

- PostgreSQL integration

- Docker containerization

- Unit testing with JUnit

- CI/CD pipeline

- Dashboard UI

- Alert generation system

---

## Tech Stack

Backend:

- Java 17
- Spring Boot
- Maven

Database:

- PostgreSQL

Dev Tools:

- Git
- GitHub
- Postman
- Docker

Testing:

- JUnit

---

## Project Architecture

Planned service architecture:

SentinelCore
│
├── Coordinator Service
│ └── Handles leader election
│
├── Node Service
│ └── Simulates nodes sending heartbeats
│
├── Monitoring Service
│ └── Tracks node health status
│
├── Alert Service
│ └── Generates system alerts
│
└── PostgreSQL
└── Stores node and monitoring data

---

## API Endpoints

### Health Check

```http
GET /health
```

Response:

```json
"Application is healthy"
```

### Get All Nodes

```http
GET /nodes
```

### Create Node

```http
POST /nodes
```

Example body:

```json
{
    "id": 1,
    "name": "Node-1"
}
```

### Send Heartbeat

```http
POST /nodes/{id}/heartbeat
```

---

## Running the Project

Clone repository:

```bash
git clone https://github.com/yourusername/SentinelCore.git
```

Navigate into project:

```bash
cd SentinelCore
```

Run application:

```bash
mvn spring-boot:run
```

Application runs on:

```text
http://localhost:8080
```

---

## Testing

Endpoints were tested using Postman.

Future testing will include:

- JUnit unit tests
- Integration testing

---
## Author

Nicholas Carrasquilla

Software Engineer
