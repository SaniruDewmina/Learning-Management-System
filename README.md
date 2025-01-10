# Learning Management System (LMS)

The **Learning Management System (LMS)** is a Java-based desktop application designed to manage educational data for schools, colleges, or universities. It includes features for administrators, lecturers, and students to manage courses, results, and schedules efficiently.

---

## Features

### Admin Features:
- Manage courses, students, lecturers, and results.
- Generate and view detailed reports using JasperReports.
- Assign students to courses and lecturers to subjects.

### Lecturer Features:
- View assigned courses and subjects.
- Manage student results for specific subjects.
- Access student details relevant to their courses.

### Student Features:
- View enrolled courses, subjects, and schedules.
- Access their grades and performance reports.

### General Features:
- Database-driven backend using **MySQL**.
- Real-time updates to courses, subjects, and student data.
- Seamless navigation with a user-friendly GUI.

---

## Tech Stack

### Frontend:
- **Java Swing**: For creating the graphical user interface (GUI).

### Backend:
- **MySQL**: For managing and storing data.
- **JDBC**: For database connectivity.

### Reporting:
- **JasperReports**: For generating detailed reports.

---

## Prerequisites

To run this project locally, ensure you have the following installed:
1. **Java JDK** (version 8 or higher)
2. **MySQL Server**
3. **JasperReports** library
4. Any compatible IDE like **NetBeans**, **Eclipse**, or **IntelliJ IDEA**.

---

## Database Schema

The LMS database consists of the following tables:

1. **Course**:
   - `courseID` (Primary Key)
   - `courseName`, `numberOfStudents`, `startDate`, `endDate`

2. **Lecturer**:
   - `lecturerID` (Primary Key)
   - `lecturerName`, `lecturerNIC`, `lecturerContactNo`, `lecturerEmail`, `lecturerDOB`, `lecturerGender`, `lecturerPassword`, `lecturerSecretPin`

3. **Admin**:
   - `adminID` (Primary Key)
   - `adminName`, `adminNIC`, `adminPassword`, `adminSecretPin`

4. **Student**:
   - `studentID` (Primary Key)
   - `studentName`, `studentNIC`, `studentDOB`, `studentAddress`, `studentContactNo`, `studentEmail`, `studentGender`, `studentPassword`, `studentSecretPin`, `courseID` (Foreign Key)

5. **Timetable**:
   - `scheduleDate`, `scheduleTime`, `subjectName`, `courseID` (Foreign Key), `lecturerID` (Foreign Key)

6. **Result**:
   - `subjectName`, `studentID` (Foreign Key), `studentMarks`, `Grade`

7. **Subject**:
   - `subjectName` (Primary Key)
   - `courseID` (Foreign Key)

---

## How to Run

### Step 1: Clone the Repository
```bash
git clone https://github.com/yourusername/LMS.git
cd LMS
