/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author student
 */
public class Student {
            String imie="Bartosz";
        String nazwisko="Mleczko";
        int nr_indeks=123345;
        String nazwa_specjalnosci="Aplikacje webowe";
        int rok_studiow=1;

        public Student(String imie) {
            this.imie = imie;
        }

        public Student(String imie, String nazwisko) {
            this.imie = imie;
            this.nazwisko = nazwisko;
        }

        public Student(int nr_indeks) {
            this.nr_indeks = nr_indeks;
        }

        public Student(String nazwa_specjalnosci, int rok_studiow) {
            this.nazwa_specjalnosci = nazwa_specjalnosci;
        }
        public Student(int rok_studiow, String imie)
        {
            this.rok_studiow=rok_studiow;
        }

    public Student(String imie, String nazwisko, int nr_indeks, String nazwa_specjalnosci, int rok_studiow) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.nr_indeks = nr_indeks;
            this.nazwa_specjalnosci = nazwa_specjalnosci;
            this.rok_studiow=rok_studiow;
    }

        public void pokazDane(){
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("nr indeksu: " + this.nr_indeks);
        System.out.println("nazwa specjalnosci: " + this.nazwa_specjalnosci); 
        System.out.println("rok: " + this.rok_studiow);
        }

    @Override
    public String toString() {
        return "Student{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", nr_indeks=" + nr_indeks + ", nazwa_specjalnosci=" + nazwa_specjalnosci + ", rok_studiow=" + rok_studiow + '}';
    }
        

}
