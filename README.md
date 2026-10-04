![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2.3-brightgreen)
![Maven](https://img.shields.io/badge/Maven-4.x-blue)
![Spring Security](https://img.shields.io/badge/Spring_Security-6-green)
![JWT](https://img.shields.io/badge/JWT-Authentication-blue)
![MongoDB](https://img.shields.io/badge/MongoDB-Database-47A248)
![GridFS](https://img.shields.io/badge/GridFS-File_Storage-success)
![Angular](https://img.shields.io/badge/Angular-17+-dd0031)
![TypeScript](https://img.shields.io/badge/TypeScript-5.x-blue)
![NgRx](https://img.shields.io/badge/NgRx-State_Management-purple)
![RxJS](https://img.shields.io/badge/RxJS-Reactive_Programming-B7178C)
![Bootstrap](https://img.shields.io/badge/Bootstrap-5-7952)
![Docker](https://img.shields.io/badge/Docker-Container-2496ed)

# Shopicky • Fullstack Music Streaming Platform (Spring Boot 3 + Angular 17)

Full-stack music streaming platform built with Spring Boot and Angular, featuring secure authentication, media management, MongoDB GridFS storage, and an integrated audio player.

This repository is organized as a monorepo containing both the Spring Boot backend and Angular frontend applications.

## ✨ Key Features

* **Music Library Management:** Create, update, browse, and delete albums and tracks.
* **Secure Authentication:** JWT-based authentication and authorization using Spring Security.
* **Audio File Storage:** Upload and manage audio files securely with MongoDB GridFS.
* **Integrated Music Player:** Play, pause, skip tracks, control volume, and track progress.
* **State Management:** Centralized frontend state using NgRx.
* **Advanced Search & Filtering:** Search albums and tracks by various criteria.
* **Role-Based Access Control:** Administrative actions restricted to authorized users.

## 🛠️ Technologies Used

### Backend

* **Java 17**
* **Spring Boot**
* **Spring Security**
* **JWT Authentication**
* **MongoDB**
* **GridFS**
* **Spring Data MongoDB**
* **JUnit**
* **Mockito**
* **Docker**

### Frontend

* **Angular 17**
* **NgRx**
* **RxJS**
* **TypeScript**
* **Bootstrap**

## 🚀 Getting Started

### Prerequisites

* **Java 17+**
* **Node.js**
* **Angular CLI**
* **MongoDB**
* **Maven**

### Clone Repository

```bash
git clone https://github.com/redabensaad/shopicky.git
cd shopicky
```

### Backend Setup

```bash
cd shopicky-backend
mvn clean install
mvn spring-boot:run
```

Backend available at:

```text
http://localhost:8080
```

### Frontend Setup

```bash
cd shopicky-frontend
npm install
ng serve
```

Frontend available at:

```text
http://localhost:4200
```

## 🔐 Authentication

### Public Endpoints

```text
POST /api/auth/register
POST /api/auth/login
```

### Protected Resources

* Album Management
* Track Management
* User Management
* Audio File Operations

Authentication is handled through JWT Bearer Tokens.

## 🎵 Audio Management

* Upload audio files up to **15 MB**
* Supported formats:
    * MP3
    * WAV
    * OGG
* Secure file storage using **MongoDB GridFS**

## 🏗️ Architecture Highlights

### Backend

* RESTful API Design
* JWT Authentication
* Global Exception Handling
* Environment Profiles
* Unit Testing
* Layered Architecture

### Frontend

* Feature-Based Architecture
* Lazy Loading
* Route Guards
* HTTP Interceptors
* Resolvers
* Reactive State Management with NgRx

## 📦 Project Status

**Completed • Full-Stack Showcase Project**

This project demonstrates full-stack development practices by combining a secure Spring Boot backend with a modern Angular frontend for music streaming and media management.

