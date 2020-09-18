/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.dao;

import com.sg.classroster.dao.ClassRosterDAOFileImpl;
import com.sg.classroster.dto.Student;
import java.io.FileWriter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mohamed
 */
public class ClassRosterDAOFileImplTest {

    ClassRosterDAO testDao;

    public ClassRosterDAOFileImplTest() {
    }

    @BeforeEach
    public void setUp() throws Exception {
        String testFile = "testroster.txt";
        // Use the FileWriter to quickly blank the file
        new FileWriter(testFile);
        testDao = new ClassRosterDAOFileImpl(testFile);
    }
    @Test
    public void testGetSudent() throws Exception{
        Student newStudent = new Student("1");
        newStudent.setFirstName("Mike");
        newStudent.setLastName("Jones");
        newStudent.setCohort("Java");
        String studentId = newStudent.getStudentId();
        testDao.addStudent(studentId, newStudent);

        
        Student grabedStudent = testDao.getStudent(studentId);
        
        assertEquals(newStudent, grabedStudent, "Expected to be 1, Mike Jones Java");
    }

}
