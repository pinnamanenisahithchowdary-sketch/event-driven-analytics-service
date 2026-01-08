# Internal Event-Driven Usage Analytics Service

## Overview
A backend service that ingests SaaS usage events and exposes lightweight analytics through REST APIs. This project models an event-driven analytics pipeline commonly used in SaaS and FinTech systems.

## Problem Statement
Modern SaaS platforms generate high volumes of interaction events (logins, clicks, page views). Processing these events synchronously can slow down user-facing APIs. This service demonstrates a scalable approach where event ingestion is fast and analytics can be extended to asynchronous processing (e.g., Kafka).

## Architecture (Simplified)
Client → REST API → Event Store (DB) → Analytics API  
> Note: In production, Kafka would be used for async messaging; this repo focuses on core backend design and APIs.

## Tech Stack
- Java 17
- Spring Boot (REST APIs)
- Maven

## API Endpoints
### Ingest an event
**POST** `/events`

Example payload:
```json
{
  "eventType": "LOGIN",
  "userId": "123",
  "timestamp": "2024-01-01T10:00:00Z"
}
