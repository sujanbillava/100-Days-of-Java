# Student Management System

# Project Overview

The Student Management System is a menu-driven console application developed using Core Java. It allows users to manage student records by performing basic operations such as displaying, searching, adding, updating, and deleting student information. It can also calculate a student's grade based on their marks.

This project was developed as my **Day 100 Java learning project** to apply the concepts I learned throughout my 100-day Java journey.

##  Features

1. **Display Students** – View the ID, name, and marks of all students.
2. **Search Student** – Find a student using their unique ID.
3. **Add Student** – Add a new student with an ID, name, and marks.
4. **Update Marks** – Modify the marks of an existing student.
5. **Delete Student** – Remove a student's record using their ID.
6. **Show Grade** – Calculate and display a grade based on the student's marks.
7. **Exit** – Exit the application.

##  Technologies Used

- Java
- Core Java concepts
- Object-Oriented Programming (OOP)
- ArrayList
- Scanner class for user input
- Loops and conditional statements
- Switch statement
- Constructors and methods

##  How It Works

1. The `Student` class represents a student with an ID, name, and marks.
2. A constructor initializes each student's details.
3. An `ArrayList<Student>` stores the student objects while the program is running.
4. A menu allows the user to select an operation.
5. A `switch` statement executes the selected operation.
6. Loops search through the list to find student records.
7. Conditional statements determine the grade based on the student's marks.

##  Grading System

| Marks | Grade |
|---|---|
| 90–100 | A |
| 75–89 | B |
| 35–74 | C |
| Below 35 | F |


##  Current Limitations

- Student records are stored in memory and are lost when the program exits.
- The application currently runs in the console.
- Input validation and duplicate-ID prevention can be added as future improvements.

##  Future Enhancements

- Prevent duplicate student IDs.
- Validate student marks and other inputs.
- Store student records permanently using files or a database.
- Add a graphical user interface.
- Connect the application to a database using JDBC.

