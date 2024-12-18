//La classe Persona deve gestire un id unico, il cognome e indirizzo. Solo per l'indirizzo ci devono essere getter e setter
public class Persona {
    private int id;
    private String cognome;
    private String indirizzo;
    private static int idUnico=0;

    //Costruttore. Indirizzo vuoto perchè si setterà nel main
    public Persona(String cognome) {
        this.cognome = cognome;
        this.indirizzo = "";
        this.id = idUnico++;
    }

    public Persona(String cognome, String indirizzo) {
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.id = idUnico++;
    }

    public int getId() {
        return this.id;
    }

    public String getCognome() {
        return cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    //Usato per permettere di vedere gli attributi e valori quando si stamperà il metodo.
    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", cognome='" + cognome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                '}';
    }
}
