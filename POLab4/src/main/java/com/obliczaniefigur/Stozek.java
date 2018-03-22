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
public class Stozek {
    public double r;
    public double dlugosc;
    public double he;

    public Stozek(double r, double dlugosc, double he) {
        this.r = r;
        this.dlugosc = dlugosc;
        this.he=he;
    }
    public double pole(double r, double dlugosc)
    {
        return Math.PI*r*(r+dlugosc);
    }
        public double objetosc(double r, double dlugosc, double he)
    {
        return (Math.PI*r*r*he)/3;
    }
}
