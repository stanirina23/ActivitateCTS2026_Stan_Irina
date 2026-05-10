package clase;

public class SistemZboruri {
    public boolean verificaDisponibilitateZbor(String destinatie) {
        System.out.println("Sistem Zboruri: Verificare locuri catre " + destinatie + "...");
        return true;
    }
}

class SistemHotelier {
    public boolean verificaCameraLibera(String tipCamera) {
        System.out.println("Sistem Hotelier: Verificare disponibilitate " + tipCamera + "...");
        return true;
    }
}

class SistemPlati {
    public boolean proceseazaPlata(double suma) {
        System.out.println("Sistem Plati: Se debiteaza suma de " + suma + " EUR...");
        return true;
    }
}