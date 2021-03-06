/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// This is where you run main 
package com.mycompany.classroster;

import com.mycompany.classroster.controller.ClassRosterController;
import com.mycompany.classroster.dao.ClassRosterAuditDao;
import com.mycompany.classroster.dao.ClassRosterAuditDaoFileImpl;
import com.mycompany.classroster.dao.ClassRosterDao;
import com.mycompany.classroster.dao.ClassRosterDaoFileImpl;
import com.mycompany.classroster.service.ClassRosterServiceLayer;
import com.mycompany.classroster.service.ClassRosterServiceLayerImpl;
import com.mycompany.classroster.ui.ClassRosterView;
import com.mycompany.classroster.ui.UserIO;
import com.mycompany.classroster.ui.UserIOConsoleImpl;

/**
 *
 * @author Mohamed
 */
public class App {
    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();
        ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao, myAuditDao);
        ClassRosterController controller = new ClassRosterController(myService, myView);
        controller.run();
    }
    
}
