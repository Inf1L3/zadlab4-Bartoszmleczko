/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obliczaniefigur;

/**
 *
 * @author Bartosz
 */
public class Kula {

    public double promien;

    public Kula(double promien) {
        this.promien = promien;
    }

    public double pole(double promien) {
        return 4 * Math.PI * promien;
    }

    public double objetosc(double promien) {
        return (4 / 3) * Math.PI * promien;
    }

}
