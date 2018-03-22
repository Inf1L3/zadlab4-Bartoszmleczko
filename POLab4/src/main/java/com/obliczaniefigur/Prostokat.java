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
public class Prostokat {

    public double bok1;
    public double bok2;

    public Prostokat(double bok1, double bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    public double pole(double bok1, double bok2) {
        return bok1 * bok2;
    }

    public double obwod(double bok1, double bok2) {
        return 2 * bok1 + 2 * bok2;
    }
}
