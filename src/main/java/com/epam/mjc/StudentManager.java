package com.epam.mjc;


import java.sql.SQLException;

public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find (long studentID) throws StudentNotFoundException {
    for (long id : IDs) {
      if (id == studentID) {
        return Student.getValueOf(studentID);
      }
    }
    throw new StudentNotFoundException(Long.toString(studentID));
  }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    for (int i = 0; i < IDs.length; i++) {
      Student student = manager.find(IDs[i]);
      System.out.println("Student name " + student.getName());
    }

  }
}
