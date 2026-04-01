package clase;

public class Rezervare implements IRezervare{
    public String nume;

    public Rezervare(String nume) {
        this.nume = nume;

    }


    public Rezervare() {
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nume='" + nume + '\'' +
                '}';
    }

    @Override
    public IRezervare clonare() {

        Rezervare rezervare=new Rezervare();
        rezervare.nume=nume;
        return rezervare;

    }
}
