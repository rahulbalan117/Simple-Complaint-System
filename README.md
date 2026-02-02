📌 Complaint Registration System

This is a menu-driven Java application developed using Core Java, JDBC, and MySQL that allows users to register and manage complaints efficiently. The application follows a layered architecture using DTO, DAO, Service, and Database connection classes to ensure clear separation of responsibilities.

Users can submit complaints with their details, view all registered complaints, and update the complaint status. The Main class handles user interaction, the Service layer processes business logic, the DAO layer manages database operations using JDBC, and MySQL is used for persistent data storage.

This project demonstrates practical implementation of CRUD operations, JDBC connectivity, and object-oriented design principles, making it suitable for academic projects and internship portfolios.

🛠️ Technologies Used

Java (Core Java)

JDBC

MySQL

VS Code

If you want, I can also give you:

⭐ A one-line description (for GitHub repo header)

📂 Project structure section

🚀 How to run the project steps

📝 A more simplified version (for beginners)

Just tell me 👍

I need project explanation, features, technologies used(Eclipse IDE ,not VsCode), Project structure, Database setup, Database connection and configuration, How to run project, applicaion menu, Sample execution.

Below is a complete, clean, and GitHub-ready README content for your Complaint Registration System.
You can copy–paste directly into your README.md.

📌 Complaint Registration System
📖 Project Explanation

The Complaint Registration System is a simple, menu-driven Java application developed using Core Java, JDBC, and MySQL. The system allows users to register complaints, view all registered complaints, and update the status of existing complaints.

The project follows a layered architecture consisting of Main, Service, DAO, DAO Implementation, DTO, and Database Connection classes. This separation improves code readability, maintainability, and scalability. All complaint data is stored persistently in a MySQL database and accessed using JDBC.

✨ Features

Register a new complaint with user details

View all registered complaints

Update complaint status (Pending, In Progress, Resolved, etc.)

Menu-driven console-based application

Uses JDBC for database connectivity

Follows DAO and DTO design patterns

🛠️ Technologies Used

Java (Core Java)

JDBC (Java Database Connectivity)

MySQL

Eclipse IDE

MySQL Connector/J

📂 Project Structure
Complaint-Registration-System
│
├── MainApp.java               // Application entry point
├── ComplaintDTO.java          // Data Transfer Object
├── ComplaintDAO.java          // DAO interface
├── ComplaintDAOImpl.java      // DAO implementation
├── ComplaintService.java      // Business logic
├── DBConnection.java          // Database connection utility
└── mysql-connector-j.jar      // MySQL JDBC Driver

🗄️ Database Setup
Step 1: Create Database
CREATE DATABASE complaint_db;
USE complaint_db;

Step 2: Create Table
CREATE TABLE complaints (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    description VARCHAR(255),
    status VARCHAR(50)
);

🔗 Database Connection and Configuration

MySQL connection is handled in the DBConnection class.

JDBC is used to connect Java with MySQL.

Update the database credentials in DBConnection.java:

private static final String URL = "jdbc:mysql://localhost:3306/complaint_db";
private static final String USER = "root";
private static final String PASSWORD = "your_password";


Add mysql-connector-j.jar to the project build path in Eclipse:

Right Click Project → Build Path → Add External JAR

▶️ How to Run the Project

Install Java JDK and MySQL

Open Eclipse IDE

Create a new Java project

Add all .java files to the project

Add MySQL Connector/J to the build path

Ensure MySQL server is running

Run MainApp.java

📋 Application Menu
--- Complaint Registration System ---
1. Register Complaint
2. View All Complaints
3. Update Complaint Status
4. Exit

🧪 Sample Execution
--- Complaint Registration System ---
1. Register Complaint
2. View All Complaints
3. Update Complaint Status
4. Exit
Choose option: 1

Enter Name: Sanjana
Enter Email: sanjana@gmail.com
Enter Complaint: Internet not working
Complaint Registered Successfully

--- Complaint Registration System ---
Choose option: 2

---- Complaints List ----
1 | Sanjana | sanjana@gmail.com | Internet not working | Pending

🎯 Conclusion

This project demonstrates a practical implementation of Java JDBC, MySQL integration, and layered application architecture. It is suitable for academic submissions, internship portfolios, and beginners learning Java backend development.

Developed by Rahul Balan, CSE 6th Sem.
