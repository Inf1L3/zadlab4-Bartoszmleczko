package pl.edu.ur.polab4;

import java.util.Scanner;
import com.obliczaniefigur.*;
import wprowadzDane.Student.*;

public class Main {

    public static void main(String[] args) {
        // TODO zad 4, 5
        int wyb_zad;
        Scanner s = new Scanner(System.in);

        boolean runner = true;
        do {
            System.out.println("Wybierz zadanie 3,4 lub 5. Wcisnij 0 aby zakonczyc.");
            wyb_zad = s.nextInt();
            if (wyb_zad == 0) {
                break;
            }
            switch (wyb_zad) {  

                case 3:                                             //zad 3
                    Student s1 = new Student("Jan");
                    Student s2 = new Student("Jan", "Mleczko");
                    Student s3 = new Student(1231315);
                    Student s4 = new Student(1, "Bartosz");
                    String imie = s.nextLine();
                    String nazwisko = s.nextLine();
                    String nazwa_specjalnosci = s.nextLine();
                    int nr_indeks = s.nextInt();
                    int rok_studiow = s.nextInt();

                    /*Student std = new Student(imie, nazwisko, nr_indeks, nazwa_specjalnosci, rok_studiow);
                     s1.pokazDane();
                     s2.pokazDane();
                     s3.pokazDane();
                     s4.pokazDane();*/
                    break;
                case 4:

                    int choice;
                    boolean doloop = true;

                    do {                                                           //zad4
                        System.out.println("Wybierz figure: 1.Kolo 2.Kula 3.Kwadrat 4.Prostokat 5.Prostopadloscian 6.Stozek 7.Szescian 0.Zakoncz dzialanie zadania 4");
                        choice = s.nextInt();
                        if (choice == 0) {
                            break;
                        }
                        switch (choice) {
                            case 1:
                                double promien = s.nextDouble();
                                Kolo kolo = new Kolo(promien);
                                System.out.println("Pole kola: " + kolo.pole(kolo.promien));
                                System.out.println("Obwod kola: " + kolo.obwod(kolo.promien));
                                break;
                            case 2:
                                promien = s.nextDouble();
                                Kula kula = new Kula(promien);
                                System.out.println("Pole kuli: " + kula.pole(kula.promien));
                                System.out.println("Objetosc kuli: " + kula.objetosc(kula.promien));
                                break;
                            case 3:
                                double bok = s.nextDouble();
                                Kwadrat kwadrat = new Kwadrat(bok);
                                System.out.println("Pole Kwadratu: " + kwadrat.pole(kwadrat.bok));
                                System.out.println("Obwod Kwadratu: " + kwadrat.pole(kwadrat.bok));
                                break;
                            case 4:
                                double bok1 = s.nextDouble();
                                double bok2 = s.nextDouble();
                                Prostokat prostokat = new Prostokat(bok1, bok2);
                                System.out.println("Pole Prostokata" + prostokat.pole(prostokat.bok1, prostokat.bok2));
                                System.out.println("Obwod Prostokata" + prostokat.pole(prostokat.bok1, prostokat.bok2));
                                break;
                            case 5:
                                double a = s.nextDouble();
                                double b = s.nextDouble();
                                double c = s.nextDouble();
                                Prostopadloscian prosto = new Prostopadloscian(a, b, c);
                                System.out.println("Pole prostopadloscianu: " + prosto.pole(prosto.a, prosto.b, prosto.c));
                                System.out.println("objetosc prostopadloscianu: " + prosto.objetosc(prosto.a, prosto.b, prosto.c));
                                break;
                            case 6:
                                double r = s.nextDouble();
                                double dlugosc = s.nextDouble();
                                double he = s.nextDouble();
                                Stozek stozek = new Stozek(r, dlugosc, he);
                                System.out.println("Pole Stozka: " + stozek.pole(stozek.r, stozek.dlugosc));
                                System.out.println("objetosc Stozka: " + stozek.objetosc(stozek.r, stozek.dlugosc, stozek.he));
                                break;
                            case 7:
                                bok = s.nextDouble();
                                Szescian szescian = new Szescian(bok);
                                System.out.println("Pole szescianu: " + szescian.pole(szescian.bok));
                                System.out.println("Objetosc szescianu: " + szescian.objetosc(szescian.bok));
                                break;
                            default:
                                System.out.println("0 aby zakonczyc");
                        }

                    } while (doloop == true);
                    break;
                case 5:
                    Student[] std = new Student[100];

                    for (int i = 0; i < 100; i++) {
                        std[i] = new Student("", "", "", 0, 0);
                    }

                    int indeks;
                    do {                                                        //zad5
                        doloop = true;
                        System.out.println("Wybierz funkcje: 1.Wprowadzanie i edycja danych 2.Usuniecie danych 3.Dany studenta 4. Dane wszystkich 5.Dane wybranego zakresu. Wcisnij 0 aby zakonczyc dzialanie.");
                        choice = s.nextInt();
                        if (choice == 0) {
                            break;
                        }
                        switch (choice) {
                            case 1:
                                System.out.println("Wprowadz lub nadpisz dane studenta. Wybierz indeks: ");
                                indeks = s.nextInt();
                                System.out.print("Imie: ");
                                std[indeks].pobierzDane();
                                break;
                            case 2:
                                System.out.println("Usun dane studenta. Wybierz indeks: ");
                                indeks = s.nextInt();
                                std[indeks] = new Student("", "", "", 0, 0);
                                break;
                            case 3:
                                System.out.println("Wypisz dane studenta o indeksie: ");
                                indeks = s.nextInt();
                                std[indeks].pokazDane();
                                break;
                            case 4:
                                System.out.println("Wysietlanie wszystkich obiektow");
                                for (int i = 0; i < 100; i++) {
                                    System.out.print(i + ": ");
                                    std[i].pokazDane();
                                }
                                break;
                            case 5:
                                System.out.println("Podaj zakres: ");
                                System.out.println("Zakres dolny: ");
                                int zak_dol = s.nextInt();
                                System.out.println("Zakres gorny: ");
                                int zak_gor = s.nextInt();
                                for (int i = zak_dol; i < zak_gor; i++) {
                                    System.out.print(i + ": ");
                                    std[i].pokazDane();
                                }

                                for (int i = zak_dol; i <= zak_gor; i++) {
                                    System.out.print(i + ": ");
                                    std[i].pokazDane();
                                }

                                break;
                            default:
                                System.out.println("Wcisnij 0 aby zakonczyc.");

                        }
                    } while (doloop = true);
                    break;
                default:
                    System.out.println("Wcisnij 0 aby zakonczyc.");
            }
        } while (runner = true);
    }
}
