/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster;

import com.sg.classroster.controller.ClassRosterController;
import com.sg.classroster.dao.ClassRosterAuditDAO;
import com.sg.classroster.dao.ClassRosterAuditDAOFileImpl;
import com.sg.classroster.dao.ClassRosterDAO;
import com.sg.classroster.dao.ClassRosterDAOFileImpl;
import com.sg.classroster.service.ClassRosterServiceLayer;
import com.sg.classroster.service.ClassRosterServiceLayerImpl;
import com.sg.classroster.ui.ClassRosterView;
import com.sg.classroster.ui.UserIO;
import com.sg.classroster.ui.UserIOConsoleImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 *
 * @author Mohamed
 */
public class App {

    public static void main(String[] args) {

//        UserIO myIo = new UserIOConsoleImpl();
//        ClassRosterView myView = new ClassRosterView(myIo);
//        ClassRosterDAO myDao = new ClassRosterDAOFileImpl();
//        ClassRosterAuditDAO myAuditDAO = new ClassRosterAuditDAOFileImpl();
//        ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao, myAuditDAO);
//        ClassRosterController controller = new ClassRosterController(myService, myView);
//        controller.run();

ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
ClassRosterController controller = ctx.getBean("controller", ClassRosterController.class);
controller.run();

    }
}
