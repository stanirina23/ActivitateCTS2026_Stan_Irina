package main;

import clase.Logger;

public class Main {
    public static void main(String[] args) {

        Logger instance=Logger.getInstanta("Interfata","afisare");
        instance.afiseazaLog("fisierul JSON nu e afisat corect");
        instance.afiseazaLog("fisierul XML nu este formatat corespunzator");

        Logger instanta2=Logger.getInstanta("Backend","baza de date");
        instanta2.afiseazaLog("eroare la conexiunea cu BD ");

        instanta2.setSender("Backend");
        instanta2.setCategorie("baza de date");
        instanta2.afiseazaLog("eroare la inserare");
    }
}