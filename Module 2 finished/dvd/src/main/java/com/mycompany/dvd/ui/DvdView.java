/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvd.ui;

import com.mycompany.dvd.dto.Dvd;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public class DvdView {

    private UserIO io;

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. Add DVD");
        io.print("2.Remove DVD");
        io.print("3. Edit DVD");
        io.print("4. List all DVDs");
        io.print("5. View a DVD information");
        io.print("6. Exist");

        return io.readInt("Please select from the above choices.", 1, 11);
    }

    public Dvd getNewDvdInfo() {
        String dvdName = io.readString("Please enter DVD name");
        String releasedYear = io.readString("Please enter release date");
        String mpaaRating = io.readString("Please enter MPAA rating");
        String directorName = io.readString("Please enter director name");
        String movieStudio = io.readString("Please enter movie studio");

        Dvd currentDvd = new Dvd(dvdName);
        currentDvd.setReleasedYear(releasedYear);
        currentDvd.setMpaaRating(mpaaRating);
        currentDvd.setDirectorName(directorName);
        currentDvd.setMovieStudio(movieStudio);

        return currentDvd;
    }

    public void displayCreateDvdBanner() {
        io.print("=== Create Dvd ===");
    }

    public void displayCreateSuccessBanner() {
        io.readString(
                "Dvd successfully created.  Please hit enter to continue");
    }

    public void displayDvdList(List<Dvd> dvdList) {
        for (Dvd currentDvd : dvdList) {
            String dvdInfo = String.format("#%s : %s %s %s",
                    currentDvd.getDvdName(),
                    currentDvd.getReleasedYear(),
                    currentDvd.getDirectorName(),
                    currentDvd.getMovieStudio(),
                    currentDvd.getMpaaRating());
            io.print(dvdInfo);

        }
        io.readString("Please hit enter to continue.");
    }

    public void displayDisplayAllBanner() {
        io.print("=== Display All DVD's ===");
    }

    public void displayDisplayDvdBanner() {
        io.print("=== Display Student ===");
    }

    public String getDvdNameChoice() {
        return io.readString("Please enter the DVD name.");
    }

    public void displayDvd(Dvd dvd) {
        if (dvd != null) {
            io.print(dvd.getDvdName());
            io.print(dvd.getReleasedYear() + " " + dvd.getDirectorName());
            io.print(dvd.getMpaaRating());
            io.print(dvd.getUserRating());
            io.print("");
        } else {
            io.print("Invalid title.");
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayRemoveDvdBanner() {
        io.print("=== Remove DVD ===");
    }

    public void displayRemoveResult(Dvd DvdRecord) {
        if (DvdRecord != null) {
            io.print("DVD successfully removed.");
        } else {
            io.print("No such DVD.");
        }
        io.readString("Please hit enter to continue.");
    }

    public Dvd getNewEditDvdInfo() {
        String dvdName = io.readString("Please enter DVD name");
        String releasedYear = io.readString("Please enter release date");
        String mpaaRating = io.readString("Please enter MPAA rating");
        String directorName = io.readString("Please enter director name");
        String movieStudio = io.readString("Please enter movie studio");

        Dvd currentDvd = new Dvd(dvdName);
        currentDvd.setReleasedYear(releasedYear);
        currentDvd.setMpaaRating(mpaaRating);
        currentDvd.setDirectorName(directorName);
        currentDvd.setMovieStudio(movieStudio);

        return currentDvd;
    }

    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }

    public DvdView(UserIO io) {
        this.io = io;
    }
      public void displayErrorMessage(String errorMsg) {
    io.print("=== ERROR ===");
    io.print(errorMsg);
      }

}
