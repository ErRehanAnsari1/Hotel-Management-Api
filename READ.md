# 🏨 Hotel Management REST API

A complete and robust Hotel Management System built with **Spring Boot 3**, featuring room management, booking system, and real-time availability tracking.

## 🚀 Features

- **Room Management** - CRUD operations for hotel rooms
- **Booking System** - Guest reservations with check-in/out dates
- **Real-time Availability** - Filter available rooms
- **H2 Database** - In-memory database for development
- **RESTful APIs** - Clean and structured endpoints
- **Exception Handling** - Global error handling
- **JPA Integration** - Spring Data JPA with Hibernate

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot 3.2.4**
- **Spring Data JPA**
- **H2 Database**
- **Maven**
- **RESTful Web Services**

## 📚 API Endpoints

### Rooms
- `GET /api/rooms` - Get all rooms
- `GET /api/rooms/available` - Get available rooms
- `GET /api/rooms/{id}` - Get room by ID
- `POST /api/rooms` - Create new room
- `PUT /api/rooms/{id}` - Update room

### Database Console
- **H2 Console:** `http://localhost:8080/h2-console`
- **JDBC URL:** `jdbc:h2:mem:testdb`
- **Username:** `sa`
- **Password:** (blank)

## 🏃‍♂️ Quick Start

1. **Clone repository:**
```bash
git clone https://github.com/ErRehanAnsari1/hotel-management-api.git


Run application:

bash
mvn spring-boot:run
Access APIs:

bash
http://localhost:8080/api/rooms

📁 Project Structure
text
src/
├── main/
│   ├── java/
│   │   └── com/rest/hotel/
│   │       ├── controller/     # REST Controllers
│   │       ├── entity/         # JPA Entities
│   │       ├── repository/     # Data Access Layer
│   │       ├── service/        # Business Logic
│   │       └── exception/      # Global Exception Handling
│   └── resources/
│       ├── application.properties
│       └── data.sql           # Sample data
🤝 Contributing
Feel free to fork this project and submit pull requests for any enhancements.

⭐ Star this repo if you find it helpful!
