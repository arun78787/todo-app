# ✅ Full Stack To-Do List App

This is a secure, full-stack To-Do List application built completely from scratch using **React (frontend)** and **Spring Boot with Spring Security & JWT (backend)**. It includes user authentication, role-based authorization, and complete CRUD functionality for managing personal to-dos.

---

## 🛠 Tech Stack

- **Frontend:** React, Axios, Bootstrap
- **Backend:** Java 17, Spring Boot 3, Spring Security 6, JWT, Maven
- **Database:** MySQL
- **Security:** Role-based access (User/Admin)
- **Tools:** Lombok, ModelMapper

---

## 🧾 Features

### 👤 Authentication
- User registration and login
- Password hashing using BCrypt
- JWT-based authentication
- Role-based access control (`USER`, `ADMIN`)
- Protected routes

### 📋 To-Do Management
- Create new to-dos
- View your to-dos
- Edit/update existing to-dos
- Delete your to-dos
- User-specific to-do visibility
- (Optional) Admin can manage all users/to-dos

---

## 📁 Folder Structure
todo-app/
├── backend/    # Spring Boot secured REST API
└── frontend/   # React UI

👤 Authentication Features

✅ Register new users

✅ Login with JWT authentication

✅ Logout

✅ Password hashing

✅ Role-based authorization (USER, ADMIN)

📝 To-Do Features

✅ Create a new to-do

✅ View your to-dos

✅ Update existing to-dos

✅ Delete to-dos

✅ User-specific to-dos

✅ Admin can view all users/to-dos (if implemented)

🧪 Running the App

▶️ Backend

cd backend
./mvnw spring-boot:run

Runs on http://localhost:8080

Ensure your application.properties includes:

spring.datasource.url=jdbc:mysql://localhost:3306/tododb
spring.datasource.username=root
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update

jwt.secret=your-secret-key
jwt.expiration=86400000

▶️ Frontend

cd frontend
npm install
npm run dev

Runs on http://localhost:5173

Set the API base URL inside frontend/src/services/axios.js or wherever configured:

axios.defaults.baseURL = 'http://localhost:8080/api';

🔐 Spring Security Overview

Feature

Implementation Detail

User Authentication

UsernamePasswordAuthenticationToken

JWT Token Handling

Custom JwtAuthenticationFilter

Password Encoding

BCryptPasswordEncoder

Custom UserDetails

UserDetailsServiceImpl

Authorization Rules

@PreAuthorize, URL-based config

Exception Handling

JwtAuthEntryPoint, AccessDeniedHandler

✨ API Endpoints

Method

Endpoint

Description

POST

/api/auth/register

Register a new user

POST

/api/auth/login

Login + receive JWT

GET

/api/todos

Get user’s todos

POST

/api/todos

Create new to-do

PUT

/api/todos/{id}

Update a to-do

DELETE

/api/todos/{id}

Delete a to-do

🧑‍💻 Roles & Access

Role

Permissions

User

Manage own to-dos

Admin

View/manage all users/to-dos (optional)

✍️ Author

Arun Yadav

GitHub : arun78787
