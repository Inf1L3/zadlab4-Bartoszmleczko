/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obliczaniefigur;

import static java.lang.Math.*;

/**
 *
 * @author Bartosz
 */
public class Kolo {

    public double promien;
    double srednica;

    public Kolo(double promien) {
        this.promien = promien;
    }

    public double pole(double promien) {
        return promien * promien * Math.PI;
    }

    public double obwod(double promien) {
        return promien * 2 * Math.PI;
    }

}
