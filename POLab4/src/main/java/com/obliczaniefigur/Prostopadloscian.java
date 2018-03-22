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
public class Prostopadloscian {

    public double a;
    public double b;
    public double c;

    public Prostopadloscian(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double pole(double a, double b, double c) {
        return 2 * (a * b + b * c + a * c);
    }

    public double objetosc(double a, double b, double c) {
        return a * b * c;
    }
}
