/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachine.dto;

import java.math.BigDecimal;

/**
 *
 * @author Mohamed
 */
public enum Denominations {
    HUNDREDS(new BigDecimal("100.00")),
    FIFTIES(new BigDecimal("50.00")),
    TWENTIES(new BigDecimal("20.00")),
    TENS(new BigDecimal("10.00")),
    FIVES(new BigDecimal("5.00")),
    SINGLES(new BigDecimal("1.00")),
    QUARTERS(new BigDecimal("0.25")),
    DIMES(new BigDecimal("0.10")),
    NICKELS(new BigDecimal("0.05")),
    PENNIES(new BigDecimal("0.01"));

    public final BigDecimal description;

    Denominations(BigDecimal denomination) {
        description = denomination;

    }
}
