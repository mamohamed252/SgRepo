/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvd.dao;

import com.mycompany.dvd.dto.Dvd;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public interface DvdDao {

    Dvd addDvd(String dvdName, Dvd dvd) throws DvdDaoException;

    List<Dvd> getAllDvds()throws DvdDaoException;

    Dvd getDvd(String dvdName)throws DvdDaoException;

    Dvd removeDvd(String dvdName)throws DvdDaoException;

}
