package main;

import clase.IRezervare;
import clase.Rezervare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Rezervare rezervare=new Rezervare("laKong");
        Rezervare rezervare2 = (Rezervare) rezervare.clonare();

        System.out.println(rezervare);
        System.out.println(rezervare2);

    }
}