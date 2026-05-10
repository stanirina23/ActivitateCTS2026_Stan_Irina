package main;

import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare("Timber",10,23,"00000");
        Rezervare r1 = (Rezervare) rezervare.clonare();

        r1.setNrPersoane(21);
        System.out.println(rezervare);
        System.out.println(r1);
    }
}