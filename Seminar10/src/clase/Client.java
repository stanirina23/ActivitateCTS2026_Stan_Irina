package clase;

public class Client implements ClientAbstract{
    private String nume;
    private String numarTelefon;
    private String adresaEmail;

    protected Client(String nume, String numarTelefon, String adresaEmail) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresaEmail = adresaEmail;
    }

    @Override
    public void afiseazaRezervare(Rezervare rezervare) {
        System.out.println(this.nume+" cu nr de telefon: "+this.numarTelefon+" si adresa de email: "+this.adresaEmail
                +" are rezervarea: "+ rezervare.toString());
    }

    @Override
    public void plateste(Rezervare rezervare, double taxaPerPersoana) {
        System.out.println(this.nume+ " plateste suma de: "+rezervare.getNrPersoane()*taxaPerPersoana);
    }
}