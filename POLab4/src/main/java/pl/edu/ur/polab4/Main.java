package pl.edu.ur.polab4;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        // TODO zad 4, 5

        Scanner s= new Scanner(System.in);
        Student s1=new Student("Jan");
        Student s2=new Student("Jan","Mleczko");
        Student s3=new Student(1231315);
        Student s4=new Student(1,"Bartosz");
        String imie = s.nextLine();
        String nazwisko = s.nextLine();
        String nazwa_specjalnosci = s.nextLine();
        int nr_indeks=s.nextInt();
        int rok_studiow= s.nextInt();
        Student std = new Student(imie, nazwisko, nr_indeks, nazwa_specjalnosci, rok_studiow);
        s1.pokazDane();
        s2.pokazDane();
        s3.pokazDane();
        s4.pokazDane();

    }

}
