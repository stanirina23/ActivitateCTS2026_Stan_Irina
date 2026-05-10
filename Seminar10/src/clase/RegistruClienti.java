package clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruClienti {
    private Map<String,ClientAbstract> clienti=new HashMap<>();

    public RegistruClienti() {
        this.clienti=new HashMap<>();
    }

    public ClientAbstract getClient(String nume, String telefon, String adresaEmail){
        ClientAbstract client=clienti.get(telefon);
        if (!clienti.containsKey(telefon)) {
            client = new Client(nume, telefon, adresaEmail);
            clienti.put(telefon, client);
        }
        return client;
    }
}