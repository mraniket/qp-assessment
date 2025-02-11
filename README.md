## Project Overview

This project is a *Grocery Booking Application* built using *Spring Boot*. The application provides APIs for managing users, roles, and grocery bookings. The key focus is on secure authentication and efficient database management.

---

## Features

1. *API Development*  
   - Built REST APIs using *Spring Boot* to support grocery booking functionalities.  
   - Followed best practices for API design and implementation.

2. *Authentication & Authorization*  
   - Integrated *Basic Authentication* using *Spring Security*.  
   - Passwords are stored securely in a *hashed format* in the database and automatically decrypted by Spring Security during authentication.

3. *Database*  
   - Used *MySQL* as the relational database.  
   - Designed database schema with a focus on user management:
     - *User Table*: Stores user details including hashed passwords.
     - *Role Table*: Stores roles such as "Admin" or "User".  
     - Established a *many-to-many relationship* between the User and Role tables to assign multiple roles to a user.

4. *Repository Layer*  
   - Used *JPA Repository* for database operations.  
   - Ensured efficient CRUD operations for all database entities.

---

## Getting Started

1. Clone the repository and build the application using Maven/Gradle.  
2. Update the application.properties file with your database credentials.  
3. Start the application on your local machine.  

---

## Dependencies Used

- *Spring Boot* - Framework for building REST APIs.  
- *Spring Security* - For authentication and password management.  
- *Spring Data JPA* - For database operations.  
- *MySQL Driver* - For connecting to the MySQL database.

---

## Postman Collection

A Postman collection is attached to the repository for testing all APIs. Import the collection into Postman.

---

## Deployment

- The application can be packaged as a *WAR file* for deployment.  
- If required, the WAR file can be shared separately upon request.

---

## Contact

For any queries or to request the WAR file, please reach out to me at *aashinde20@gmail.com*.
