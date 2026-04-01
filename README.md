# Telecom Ticketing System

Backend application developed using Spring Boot for managing support tickets in a telecom environment.

## 📌 Overview
This project provides a REST API that allows creating, retrieving, updating, and deleting support tickets.  
It simulates a basic ticketing system used for tracking technical issues.

## 🚀 Features
- Create new tickets
- Retrieve all tickets
- Retrieve ticket by ID
- Update ticket status
- Delete tickets
- Input validation
- Layered architecture (Controller → Service → Repository)

## 🛠️ Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## 🔗 API Endpoints

| Method | Endpoint | Description |
|------|--------|------------|
| GET | `/api/tickets` | Get all tickets |
| GET | `/api/tickets/{id}` | Get ticket by ID |
| POST | `/api/tickets` | Create a new ticket |
| PUT | `/api/tickets/{id}/status` | Update ticket status |
| DELETE | `/api/tickets/{id}` | Delete a ticket |

## 🧪 Testing
The API was tested using HTTP requests (GET, POST, PUT, DELETE) to verify client-server communication.

## 📂 Project Structure
- `controller` – handles HTTP requests
- `service` – contains business logic
- `repository` – database interaction
- `model` – entity classes

## ⚙️ Setup
1. Clone the repository
2. Configure your database in `application.properties`
3. Run the application

## 📈 Future Improvements
- Add enums for status and priority
- Implement DTO layer
- Add exception handling
- Build frontend (React)

## 👩‍💻 Author
Raluca
