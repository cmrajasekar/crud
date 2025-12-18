# 🎓 Student Management System (Spring Boot CRUD)

A simple **Student Management System** built using **Spring Boot**, **Spring MVC**, and **Spring Data JPA** that performs basic **CRUD (Create, Read, Update, Delete)** operations on student records stored in a **MySQL database**.

This project is ideal for **beginners learning Spring Boot** and demonstrates clean implementation of the **MVC architecture**.

---

## 📌 Features

- ➕ Add new student records
- 📋 View all students
- ✏️ Update existing student details
- ❌ Delete student records using ID
- 🔄 Redirect-based navigation to avoid duplicate actions

---

## 🛠️ Tech Stack

- **Backend:** Spring Boot, Spring MVC
- **Database:** MySQL
- **ORM / Data Access:** Spring Data JPA (JDBC-based)
- **Frontend:** HTML, CSS
- **Build Tool:** Maven
- **Server:** Embedded Tomcat

---

## 🧱 Project Architecture (MVC)

- **Model** → `student` entity class representing database table
- **Repository** → `StudentRepository` for database operations
- **Controller** → Handles HTTP requests and responses
- **View** → HTML pages for user interaction

---

## 📂 Project Structure

```
com.jdbc.crud
│
├── controller
│   └── StdController.java
│
├── model
│   └── student.java
│
├── repository
│   └── StudentRepository.java
│
├── resources
│   ├── templates
│   │   ├── home.html
│   │   ├── createFile.html
│   │   ├── display.html
│   │   ├── update.html
│   │   └── delete.html
│   └── application.properties
```

---

## ⚙️ How It Works

1. User interacts with HTML pages
2. Requests are sent to Spring Controller
3. Controller communicates with Repository
4. Repository performs database operations
5. Results are displayed using views

---

## 🗄️ Database Configuration

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ How to Run the Project

1. Clone the repository
   ```bash
   git clone https://github.com/your-username/student-management-system.git
   ```
2. Open in IntelliJ / Eclipse
3. Configure MySQL database
4. Run the Spring Boot application
5. Open browser and visit:
   ```
   http://localhost:8080/
   ```

---

## 🎯 Learning Outcomes

- Understanding Spring Boot fundamentals
- Implementing CRUD operations
- Working with MySQL & JPA
- MVC architecture in real projects

---

## 🚀 Future Enhancements

- User authentication & login
- REST API version
- Pagination & search
- UI improvements with Bootstrap / Material UI

---

## 👨‍💻 Author

**Rajasekar**  
Spring Boot & Java Learner

---

⭐ If you like this project, don’t forget to star the repository!

