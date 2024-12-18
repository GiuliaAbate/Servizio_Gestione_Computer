import java.util.HashMap;
import java.util.ArrayList;

//Classe YellowPages che contiene un HashMap in cui associato al nome di una città c'è il rispettivo ComputerService
public class YellowPages {
    private HashMap<String,ComputerServiceList> citta;

    public YellowPages(){
        this.citta = new HashMap<>();
    }

    public HashMap<String, ComputerServiceList> getCitta() {
        return citta;
    }

    public void setCitta(HashMap<String, ComputerServiceList> citta) {
        this.citta = citta;
    }

    //Metodo: aggiungere una città e il suo ComputerService
    public String aggiungiCitta(String city, ComputerServiceList c) {
        if (citta.get(city) == null) {
            citta.putIfAbsent(city, c);
            return "Città e ComputerService aggiunti con successo";
        } else {
            return "La città esiste già"; //Se la città esiste già restituisce errore
        }
    }

    //Metodo: trovare nome e indirizzo del ComputerService data la città
    public String trovaService(String city){
        if(citta.get(city) != null){
            ComputerServiceList service = citta.get(city); 
            return "Il nome è " + service.getNome() + " mentre l'indirizzo è " + service.getIndirizzo();
        } else {
            return "Il service non esiste.";
        }
    }

    //Metodo: eliminare un ComputerService inserendo la città
    public String eliminaService(String city) {
        citta.remove(city);
        return "Computer Service eliminato per  " + city;
    }

    //Metodo: elencare le città in cui è presente un ComputerService
    public String elencaCitta() {
        ArrayList<String> elenco = new ArrayList<>();
        //Si cicla attraverso le chiavi presenti e in ogni ciclo 'city' ha un valore di una chiave diversa
        for (String city : citta.keySet()) { //keySet è un metodo di HashMap che restituisce un insieme contenente le chiavi presenti
            elenco.add(city);
        }
        return "Le città esistenti sono: " + elenco;
    }
}







