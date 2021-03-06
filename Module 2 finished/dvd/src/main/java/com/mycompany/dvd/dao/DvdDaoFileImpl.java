/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvd.dao;

import com.mycompany.dvd.dto.Dvd;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class DvdDaoFileImpl implements DvdDao {
    public static final String Dvd_FILE = "dvd.txt";
    public static final String DELIMITER = "::";
    private Map<String, Dvd> dvds = new HashMap<>();

    @Override
    public Dvd addDvd(String DvdName, Dvd dvd) throws DvdDaoException {
        loadDvd();
        Dvd newDvd = dvds.put(DvdName, dvd);
        writeDvd();
        return newDvd;

    }

    @Override
    public Dvd getDvd(String DvdName) throws DvdDaoException {
        loadDvd();
        return dvds.get(DvdName);
    }

    @Override
   public Dvd removeDvd(String DvdName)throws DvdDaoException {
    loadDvd();
    Dvd removedDvd = dvds.remove(DvdName);
    writeDvd();
    return removedDvd;
}

    @Override
    public List<Dvd> getAllDvds() throws DvdDaoException {
        loadDvd();
        return new ArrayList(dvds.values());
    }
// Unmarshalling is taking string from file and turning it into an object.
    private Dvd unmarshallDvd(String dvdAsText) {
        // studentAsText is expecting a line read in from our file.
        // For example, it might look like this:
        // 1234::Ada::Lovelace::Java-September1842
        //
        // We then split that line on our DELIMITER - which we are using as ::
        // Leaving us with an array of Strings, stored in studentTokens.
        // Which should look like this:
        // ______________________________________
        // |    |   |        |                  |
        // |1234|Ada|Lovelace|Java-September1842|
        // |    |   |        |                  |
        // --------------------------------------
        //  [0]  [1]    [2]         [3]
        String[] dvdTokens = dvdAsText.split(DELIMITER);

        // Given the pattern above, the student Id is in index 0 of the array.
        String DvdName = dvdTokens[0];

        // Which we can then use to create a new Student object to satisfy
        // the requirements of the Student constructor.
        Dvd dvdFromFile = new Dvd(DvdName);

        // However, there are 3 remaining tokens that need to be set into the
        // new student object. Do this manually by using the appropriate setters.
        // Index 1 - FirstName
        dvdFromFile.setReleasedYear(dvdTokens[1]);

        // Index 2 - LastName
        dvdFromFile.setMpaaRating(dvdTokens[2]);

        // Index 3 - Cohort
        dvdFromFile.setDirectorName(dvdTokens[3]);
        
         dvdFromFile.setMovieStudio(dvdTokens[4]);
        
         dvdFromFile.setUserRating(dvdTokens[5]);
         
         

        // We have now created a student! Return it!
        return dvdFromFile;
    }

    private void loadDvd() throws DvdDaoException {
        Scanner scanner;

        try {
            // Create Scanner for reading the file
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(Dvd_FILE)));
        } catch (FileNotFoundException e) {
            throw new DvdDaoException(
                    "-_- Could not load roster data into memory.", e);
        }
        // currentLine holds the most recent line read from the file
        String currentLine;
        // currentStudent holds the most recent student unmarshalled
        Dvd currentDvd;
        // Go through ROSTER_FILE line by line, decoding each line into a 
        // Student object by calling the unmarshallStudent method.
        // Process while we have more lines in the file
        while (scanner.hasNextLine()) {
            // get the next line in the file
            currentLine = scanner.nextLine();
            // unmarshall the line into a Student
            currentDvd = unmarshallDvd(currentLine);

            // We are going to use the student id as the map key for our student object.
            // Put currentStudent into the map using student id as the key
            dvds.put(currentDvd.getDvdName(), currentDvd);
        }
        // close scanner
        scanner.close();
    }
//Marshalling equal turning object into string to write into File.
    private String marshallDvd(Dvd aDvd) {
        // We need to turn a Student object into a line of text for our file.
        // For example, we need an in memory object to end up like this:
        // 4321::Charles::Babbage::Java-September1842

        // It's not a complicated process. Just get out each property,
        // and concatenate with our DELIMITER as a kind of spacer. 
        // Start with the student id, since that's supposed to be first.
        String dvdAsText = aDvd.getDvdName()+ DELIMITER;

        // add the rest of the properties in the correct order:
        // FirstName
        dvdAsText += aDvd.getReleasedYear()+ DELIMITER;

        // LastName
        dvdAsText += aDvd.getMpaaRating()+ DELIMITER;
         dvdAsText += aDvd.getDirectorName() + DELIMITER;

        // Cohort - don't forget to skip the DELIMITER here.
        dvdAsText += aDvd.getMovieStudio() + DELIMITER;
        dvdAsText += aDvd.getUserRating(); 

        // We have now turned a student to text! Return it!
        return dvdAsText;
    }

    /**
     * Writes all students in the roster out to a ROSTER_FILE. See loadRoster
     * for file format.
     *
     * @throws ClassRosterDaoException if an error occurs writing to the file
     */
    private void writeDvd() throws DvdDaoException {
        // NOTE FOR APPRENTICES: We are not handling the IOException - but
        // we are translating it to an application specific exception and 
        // then simple throwing it (i.e. 'reporting' it) to the code that
        // called us.  It is the responsibility of the calling code to 
        // handle any errors that occur.
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(Dvd_FILE));
        } catch (IOException e) {
            throw new DvdDaoException(
                    "Could not save student data.", e);
        }

        // Write out the Student objects to the roster file.
        // NOTE TO THE APPRENTICES: We could just grab the student map,
        // get the Collection of Students and iterate over them but we've
        // already created a method that gets a List of Students so
        // we'll reuse it.
        String dvdAsText;
        List<Dvd> dvdList = new ArrayList(dvds.values());
        for (Dvd currentDvd : dvdList) {
            // turn a Student into a String
            dvdAsText = marshallDvd(currentDvd);
            // write the Student object to the file
            out.println(dvdAsText);
            // force PrintWriter to write line to the file
            out.flush();
        }
        // Clean up
        out.close();
    }
}
