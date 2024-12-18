import java.util.Arrays;

//Classe ComputerService deve poter gestire un insieme di computer e deve avere una persona come titolare, un nome e un indirizzo
public class ComputerService {
    private Persona titolare;
    private String nome;
    private String indirizzo;
    private Computer[] computers; //Vettore dei computer, ogni computer ha un proprio indice che corrisponde alla posizione nell'array
    private int conteggio;


    public ComputerService(Persona titolare, String nome, String indirizzo, int quanti) { //l'int quanto indica quanti computer si possono inserire, quindi dimensione dell'array
        this.titolare = titolare;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.computers = new Computer[quanti];
        //For che inizializza ogni posizione dell'array
        for (int i = 0; i < quanti; i++) {
            computers[i] = new Computer();
        }
    }

    //Getter e Setter
    public Persona getTitolare() {
        return titolare;
    }

    public void setTitolare(Persona titolare) {
        this.titolare = titolare;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    //Metodo: inserire computer nel service, questo deve restituire l'indice in cui viene inserito
    public int inserisciComputer(Computer c) { //Come parametro si inserisce un computer definito come C
        computers[conteggio] = c; //Si assegna il computer alla posizione nel nettore
        int indice = conteggio; //Si salva l'indice corrente nella variabile "indice"
        conteggio++;
        return indice;
    }

    //Metodo: visualizzare il proprietario dato l'indice
    public Persona visualizzaProprietario(int indice) {
        return computers[indice].getUtilizzatore(); //Si accede all'elemento dell'array con l'indice specificato e prende l'utilizzatore
    }

    //Metodo: cercare gli indici dei computer posseduti da una persone
    public int[] cercaComputer(Persona p) { //Si inserisce la persona desiderata, il metodo restituisce un array
        int[] indice = new int[conteggio]; //Si crea array di indici
        int count = 0;

        //Ciclio sull'array
        for (int i = 0; i < conteggio; i++) {
            if (computers[i].getUtilizzatore().equals(p)) { //equals vuole verificare che l'utilizzatore sia uguale alla persona specificata
                indice[count++] = i; //Se è la stessa persona aggiunge l'indice all'array
            }
        }
        int[] risultato = Arrays.copyOf(indice, count);
        return risultato; //Infine restituisce array di indici
    }

    //Metodo: stampare i dati di ognuno dei computer
    public void stampaComputer() {
        for (int i = 0; i < conteggio; i++) {
            String c1 = computers[i].toString(); //Inserisce in una stringa l'elenco dei computer
            System.out.println(c1);
        }
    }

    //Metodo: modificare l'utilizzatore dato l'indice
    public Persona modificaUtilizzatore(int indice, Persona nuovoP) { //Si inserisce l'indice e nuovo utilizzatore
        if (indice >= 0 && indice < conteggio && computers[indice] != null) { //Verifica che l'indice sia valido
            computers[indice].cambioUtilizzatore(nuovoP); //chiama il metodo per modificare utilizzatore
        }
        return nuovoP;
    }

    //Metodo: dato l'indice restituisce valore del computer
    public int visualizzaValore(int indice) {
        return computers[indice].getValore();
    }

    //Metodo: calcolare il totale dei valori dei computer presenti nel service
    public int calcoloTotale() {
        int somma = 0;
        //Ciclo FOREACH. Per ogni oggetto c che appartiene all'array si aggiunge il valore del computer corrente alla sotta totale
        for (Computer c : computers) {
            somma += c.getValore();
        }
        return somma;
    }

    //Metodo: trovare il computer con valore massimo e quello con valore minimo
    public int[] trovaMaxMin() {
        int max = computers[0].getValore();
        int indMax = 0;
        int min = computers[0].getValore();
        int indMin = 0;

        //CICLO FOR
        for (int i = 0; i < conteggio; i++) {
            int valore = computers[i].getValore();
            if (valore > max) { //Si vede se il valore corrente è maggiore al massimo trovato prima e se è vero aggiorna il massimo e l'indice
                max = valore;
                indMax = i;
            }
            if (valore < min) {
                min = valore;
                indMin = i;
            }
        }
        int[] risultato = {max, min}; //Si crea array che contiene il min e max e lo restituisce
        return risultato;
    }

    //Metodo: trovare i computer di una data marca inserita
    public Computer[] trovaPerMarca(String marca) {
        Computer[] risultati = new Computer[conteggio]; //Crea array
        int count = 0;
        for (int i = 0; i < conteggio; i++) {
            if (computers[i].getMarca().getNome().equals(marca)) { //Se la marca del computer è uguale a quella specificata
                risultati[count++] = computers[i]; //Si aggiunge il computer all'array
            }
        }
        return risultati;
    }

    //Metodo: trovare i computer che non hanno mai cambiato utilizzatore
    public Computer[] trovaUnicoUtilizzatore() {
        Computer[] ComputerUnicoProprietario = new Computer[conteggio];
        int count = 0;
        for (int i = 0; i < conteggio; i++) {
                if (computers[i].getnumUtilizzatori()  == 0) { //Se i numero di utilizzatori è 0, quindi non è mai stato camabiato
                    ComputerUnicoProprietario[count++] = computers[i]; //Viene aggiunto all'array che verrà restituito
                }
            }
        return ComputerUnicoProprietario;
    }

    //Metodo: ordinare i computer in base al valore crescente
    public Computer[] ordinaPerValore(){
        Computer[] ordinato=computers;
        Arrays.sort(ordinato); //Si usa metodo della classe Arrays importata
        return ordinato;
    }

}


