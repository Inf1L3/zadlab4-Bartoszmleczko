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
public class Szescian {
    public double bok;

    public Szescian(double bok) {
        this.bok = bok;
    }
    public double pole(double bok)
    {
        return 6*bok*bok;
    }
    public double objetosc(double bok)
    {
        return bok*bok*bok;
    }
}
