## 📘 Student Management System (Java + Hibernate + MySQL)

This is a **console-based CRUD application** developed using **Core Java, Hibernate ORM, and MySQL**. It allows users to manage student records directly through a simple command-line interface.

Ideal for beginners looking to get hands-on with backend technologies like Hibernate and relational databases.

---

 ✅ Features

* ➕ Add a new student
* 🔍 Search student by roll number
* 📋 View all student records
* 📝 Update existing student details
* ❌ Delete student by roll number
* 🔗 Database integration with MySQL
* ⚙️ Hibernate used for automatic SQL handling (ORM)

---

 🧰 Tech Stack

| Tech               | Description                     |
| ------------------ | ------------------------------- |
| Java               | Main programming language       |
| Hibernate ORM      | Object Relational Mapping       |
| MySQL              | Relational database             |
| Maven              | Build and dependency management |
| IntelliJ / Eclipse | IDEs used for development       |

---

 🗂 Project Structure

```
student-management/
├── com.student/
│   ├── Student.java          # Entity class
│   ├── StudentDAO.java       # DAO for CRUD operations
│   └── Main.java             # Main app with user menu
├── hibernate.cfg.xml         # Hibernate configuration
└── pom.xml                   # Maven dependencies
```

---

🛠 How It Works

1. The user runs the console application.
2. A menu appears with options to manage students.
3. Based on the selected option, the application performs DB operations via Hibernate.
4. All data is stored in a `student_ms` database in MySQL.

---

🔧 Setup Instructions

1. Clone this repo:

   ```bash
   git clone https://github.com/your-username/student-management-hibernate.git
   cd student-management-hibernate
   ```

2. Configure `hibernate.cfg.xml` with your MySQL credentials and DB info.

3. Make sure MySQL is running and create the database:

   ```sql
   CREATE DATABASE student_ms;
   ```

4. Build and run the project using your preferred IDE.

---

### 📚 What You’ll Learn

* Hibernate CRUD operations
* How to map Java objects to relational DB tables
* Using Hibernate configuration (`hibernate.cfg.xml`)
* Writing clean DAO-based backend logic
* Transaction handling in Hibernate

---
🤛️ Author

**Dharma Selvaraj**
Aspiring Full-Stack / Backend Developer 💻
*Java | Hibernate | Spring Boot | MySQL*
