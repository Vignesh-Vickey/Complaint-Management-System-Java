<h1 align="center">🧾 Complaint Management System using Java & MySQL</h1>

<p align="center">
  A simple and efficient complaint tracking system built using <b>Core Java</b> and <b>MySQL (JDBC)</b>.  
  This mini-project allows users to register and view complaints through a console-based interface.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Database-MySQL-blue?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/IDE-IntelliJ%20IDEA-red?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Version-1.0-green?style=for-the-badge"/>
</p>

---

## 📖 Overview
The **Complaint Management System** is a beginner-friendly Java console application that demonstrates how to connect Java with a MySQL database using **JDBC (Java Database Connectivity)**.  

It allows users to:
- Register a complaint (stored in the database)  
- View all submitted complaints  
- Interact through a simple command-line interface  

This project is ideal for students learning **Java Full Stack (JFS)** and **database integration** concepts.

---

## 🎯 Features
✅ Add new complaints  
✅ View all registered complaints  
✅ MySQL database integration with JDBC  
✅ Console-based interactive menu  
✅ Lightweight, fast, and beginner-friendly  

---

## 🧠 Technologies Used
| Technology | Description |
|-------------|-------------|
| **Java** | Core programming language |
| **JDBC** | For connecting Java to MySQL |
| **MySQL** | Relational database for storing complaints |
| **IntelliJ IDEA** | IDE for coding and execution |

---
🔎 How to Run the Project --- Step-by-Step
========================================

### ✅ Step 1 --- Install Required Software

Make sure these tools are already installed:

-   Java JDK 21 (or higher)

-   IntelliJ IDEA (Ultimate/Community)

-   MySQL Server 8.0+

-   MySQL Workbench or XAMPP (optional)

-   MySQL Connector/J (JDBC Driver)

* * * * *

### ✅ Step 2 --- Download/Clone the Project

If using GitHub:

`git clone https://github.com/<your-username>/Complaint-Management-System.git`

Or manually download the ZIP and extract it.

* * * * *

### ✅ Step 3 --- Open the Project in IntelliJ IDEA

📌 Go to:

`File → Open → Select Project Folder → OK`

* * * * *

### ✅ Step 4 --- Create MySQL Database

Open MySQL Workbench → Run this SQL:

`CREATE DATABASE complaintdb;

USE complaintdb;

CREATE TABLE complaints (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    complaint TEXT
);`

* * * * *

### ✅ Step 5 --- Add MySQL Connector Library

Go to:

`File → Project Structure → Modules → Dependencies → + Add JAR`

Select:

`mysql-connector-j-xxx.jar`

Click:

`Apply → OK ✅`

* * * * *

### ✅ Step 6 --- Configure Database Credentials

In `DBConnectionTest.java` and `ComplaintManagementSystem.java`, verify:

`String url = "jdbc:mysql://localhost:3306/complaintdb";
String user = "root";
String password = "yourpassword"; // Set your MySQL password`

* * * * *

### ✅ Step 7 --- Test DB Connection

Right-click → **Run `DBConnectionTest`**

Expected output:

`✅ Connected to MySQL successfully!`

If not → Check username/password/MySQL service running

* * * * *

### ✅ Step 8 --- Run the Main Application

Right-click on:

`ComplaintManagementSystem.java`

Then select:

`Run ComplaintManagementSystem.main()`

* * * * *

### ✅ Step 9 --- Use the Menu Options

You will see:

=== Complaint Management System ===
1. Add Complaint
2. View Complaints
3. Exit`

Enter:

-   `1` → Add a complaint ✅

-   `2` → Show all complaints ✅

-   `3` → Exit ❌

* * * * *

### DONE! Complaining System is Sunning Successfully ✅


