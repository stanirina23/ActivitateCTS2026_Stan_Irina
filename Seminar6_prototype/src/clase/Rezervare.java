package clase;

public class Rezervare implements IRezervare{
    private String numeClient;
    private int ora;
    private int nrPersoane;
    private String nrCard;

    public Rezervare(String numeClient, int ora, int nrPersoane, String nrCard) {
        this.numeClient = numeClient;
        if(ora>=11&&ora<=22){
            this.ora = ora;
        }
        else{
            this.ora=11;
        }
        this.nrPersoane = nrPersoane;
        if(nrCard.length()==16) {
            this.nrCard = nrCard;
        }
        else{
            this.nrCard="0000000000000000";
        }
    }

    public Rezervare() {

    }

    @Override
    public IRezervare clonare() {
        Rezervare rezervare = new Rezervare();
        rezervare.numeClient=this.numeClient;
        rezervare.ora=this.ora;
        rezervare.nrPersoane=this.nrPersoane;
        rezervare.nrCard=this.nrCard;

        return rezervare; //Liskov...
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setNrCard(String nrCard) {
        this.nrCard = nrCard;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("ora=").append(ora);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", nrCard='").append(nrCard).append('\'');
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
