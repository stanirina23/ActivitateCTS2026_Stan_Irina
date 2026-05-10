package clase;

public class Rezervare {
    private int nrMasa;
    private int nrPersoane;
    private int oraRezervare;

    public Rezervare(int nrMasa, int nrPersoane, int oraRezervare) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append('}');
        return sb.toString();
    }
}