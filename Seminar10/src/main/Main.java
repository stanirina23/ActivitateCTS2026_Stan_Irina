package main;

import clase.ClientAbstract;
import clase.RegistruClienti;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {

        RegistruClienti registru=new RegistruClienti();
        ClientAbstract client=registru.getClient("Andreea","1234567890","andreea@gmail.com");
        ClientAbstract client2=registru.getClient("Marin","2345678912","marin@yahoo.com");

        Rezervare rezervare1=new Rezervare(1,2,13);
        Rezervare rezervare2=new Rezervare(2,5,17);

        client.afiseazaRezervare(rezervare1);
        client2.afiseazaRezervare(rezervare2);
        client2.plateste(rezervare2,50);

        registru.getClient("Andrei","123456789","andrei@gmail.com").afiseazaRezervare(rezervare1);
        registru.getClient("Andrei","123456789","andrei@gmail.com").afiseazaRezervare(rezervare2);
        Rezervare rezervare3=new Rezervare(3,4,20);
        registru.getClient("Andrei","123456789","andrei@gmail.com").afiseazaRezervare(rezervare3);


    }
}