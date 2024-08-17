# Hotel Booking and Management API

## Overview

The **Hotel Booking and Management API** provides APIs for managing hotel reservations and operations. Built with Spring Boot, this API leverages JWT for authentication and Spring Security for secure access.

## Features

- **User Authentication**: Secure login and registration using JWT.
- **Room Management**: APIs to create, update, and delete rooms.
- **Booking Management**: APIs to create, update, and cancel bookings.
- **Reservation Management**: APIs to manage and view reservations.
- **Admin Dashboard**: Admin-specific APIs to manage users and view system metrics.

## Technologies Used

- **Backend**: Spring Boot
- **Authentication**: JWT (JSON Web Token)
- **Security**: Spring Security
- **Build Tool**: Maven
- **Database**: MYSQL

## Getting Started

### Prerequisites

- Java JDK 21+
- Maven
- MYSQL

### Setup

1. **Clone the Repository**:
   ```sh
   git clone https://github.com/GisaKaze/HotelBookingAPIs.git
   cd HotelBookingAPIs
   ```

2. **Configure the Application**:
    - Update `src/main/resources/application.properties` with your MYSQL database credentials and JWT secret key.
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:PORT/hotel_db
      spring.datasource.username=your-username
      spring.datasource.password=your-password
      
      jwt.secret=your_jwt_secret_key
      ```

3. **Build and Run the Application**:
    - Install Maven dependencies:
      ```sh
      mvn install
      ```
    - Start the application:
      ```sh
      mvn spring-boot:run
      ```

## Security

- **JWT Authentication**: Secure endpoints using JWT for authentication and authorization.
- **Spring Security**: Protect sensitive endpoints and manage user roles.

## Contributing

Contributions are welcome! Please follow these steps:

1. **Fork the Repository**.
2. **Create a New Branch**:
   ```sh
   git checkout -b feature/new-feature
   ```
3. **Make Changes** and **Commit**:
   ```sh
   git commit -m "Add new feature"
   ```
4. **Push to the Branch**:
   ```sh
   git push origin feature/new-feature
   ```
5. **Create a Pull Request**.

## Contact

For any questions or support, please contact:

- **Email**: fredson.coder@gmail.com
- **GitHub**: [GisaKaze](https://github.com/GisaKaze)
