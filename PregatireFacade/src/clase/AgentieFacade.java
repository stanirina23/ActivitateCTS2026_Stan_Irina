package clase;

public class AgentieFacade {
    private SistemZboruri zboruri;
    private SistemHotelier hotel;
    private SistemPlati plati;

    public AgentieFacade() {
        this.zboruri = new SistemZboruri();
        this.hotel = new SistemHotelier();
        this.plati = new SistemPlati();
    }


    public void rezervaVacantaCompleta(String destinatie, String tipCamera, double pret) {
        System.out.println("--- Incepere proces de rezervare automata ---");

        boolean zborOK = zboruri.verificaDisponibilitateZbor(destinatie);
        boolean hotelOK = hotel.verificaCameraLibera(tipCamera);
        boolean plataOK = plati.proceseazaPlata(pret);

        if (zborOK && hotelOK && plataOK) {
            System.out.println("Succes: Pachetul turistic a fost rezervat!");
        } else {
            System.out.println("Eroare: Rezervarea nu a putut fi finalizata.");
        }
    }
}