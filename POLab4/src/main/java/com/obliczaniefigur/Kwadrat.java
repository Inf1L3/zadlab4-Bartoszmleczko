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
public class Kwadrat {

    public double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    public double pole(double bok) {
        return bok * bok;
    }

    public double obwod(double bok) {
        return 4 * bok;
    }
}
