/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvd.controller;

import com.mycompany.dvd.dao.DvdDao;
import com.mycompany.dvd.dao.DvdDaoException;
import com.mycompany.dvd.dao.DvdDaoFileImpl;
import com.mycompany.dvd.dto.Dvd;
import com.mycompany.dvd.ui.DvdView;
import com.mycompany.dvd.ui.UserIO;
import com.mycompany.dvd.ui.UserIOConsoleImpl;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public class DvdController {

    private DvdView view;
    private DvdDao dao;
    private UserIO io = new UserIOConsoleImpl();

    public DvdController(DvdDao dao, DvdView view) {
        this.dao = dao;
        this.view = view;
    }

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {

            while (keepGoing) {

                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        createDvd();
                        break;
                    case 2:
                        removeDvd();
                        break;
                    case 3:
                        createDvd();
                        break;

                    case 4:
                        listDvds();
                        break;
                    case 5:
                        viewDvd();
                        break;
                    case 6:
                        io.print("Exit");
                        break;

                    default:
                        unknownCommand();

                }

            }
            exitMessage();

        } catch (DvdDaoException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    public void createDvd() throws DvdDaoException {
        view.displayCreateDvdBanner();
        Dvd newDvd = view.getNewDvdInfo();
        dao.addDvd(newDvd.getDvdName(), newDvd);
        view.displayCreateSuccessBanner();
    }

    private void listDvds() throws DvdDaoException {
        view.displayDisplayAllBanner();
        List<Dvd> dvdList = dao.getAllDvds();
        view.displayDvdList(dvdList);
    }

    private void viewDvd() throws DvdDaoException {
        view.displayDisplayDvdBanner();
        String DvdName = view.getDvdNameChoice();
        Dvd dvd = dao.getDvd(DvdName);
        view.displayDvd(dvd);
    }

    private void removeDvd() throws DvdDaoException {
        view.displayRemoveDvdBanner();
        String DvdName = view.getDvdNameChoice();
        Dvd removedDvd = dao.removeDvd(DvdName);
        view.displayRemoveResult(removedDvd);
    }

    public void EditDvd() throws DvdDaoException {
        view.displayCreateDvdBanner();
        Dvd newDvd = view.getNewDvdInfo();
        dao.addDvd(newDvd.getDvdName(), newDvd);
        view.displayCreateSuccessBanner();
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }

}
