/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// The object you are working with and be passed around (students) Getters and Setters 
package com.mycompany.classroster.dto;

/**
 *
 * @author Mohamed
 */
public class Student {
    private String firstName;
    private String lastName;
    private String studentId;
    // Programming Language + cohort month/year
    private String cohort;
    
    public Student(String studentId){
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }

    public String getStudentId() {
      return studentId;
    }
    
  
    
}
