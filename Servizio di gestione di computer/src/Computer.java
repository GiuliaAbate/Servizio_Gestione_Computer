//La classe per gestire i computer deve gestire in modo privato il numero dei computer costruiti, id unico, utilizzatore, marca, valore e numero di utilizzatori
public class Computer implements Comparable<Computer> {
    private static int numeroCostruiti=0;
    private int idUnico;
    private static int conteggio=0;
    private Persona utilizzatore; //Utilizzatore si collega alla classe Persona
    private CaseProduttrici marca; //La marca si collega alla classe CaseProduttrici
    protected int valore;
    private int numUtilizzatori=0;

    //Il costruttore non deve assegnare utilizzatore, per prima cosa inizializza a vuoto
    public Computer() {
        this.utilizzatore= null;
        this.marca= null;
        this.valore= 0;
        this.numUtilizzatori= 0;
        this.idUnico=0;
    }

    //Al secondo costruttore si passano la marca, il valore del computer e l'utilizzatore
    public Computer(CaseProduttrici marca, int valore,Persona utilizzatore) {
        conteggio ++;
        this.utilizzatore= utilizzatore;
        this.marca= marca;
        this.valore= valore;
        this.numUtilizzatori= 0;
        numeroCostruiti++;
        this.idUnico= conteggio;
    }

    //Getter per tutte le variabili, Setter per tutte tranne id e numero utilizzatori
    public static int getnumeroCostruiti() {
        return numeroCostruiti;
    }

    public int getIdUnico() {
        return idUnico;
    }

    public Persona getUtilizzatore() {
        return utilizzatore;
    }

    public CaseProduttrici getMarca() {
        return marca;
    }

    public int getValore() {
        return valore;
    }

    public  int getnumUtilizzatori() {
        return numUtilizzatori;
    }

    public void setnumeroCostruiti(int numeroCostruiti) {
        Computer.numeroCostruiti = numeroCostruiti;
    }

    public void setUtilizzatore(Persona utilizzatore) {
        this.utilizzatore = utilizzatore;
    }

    public void setMarca(CaseProduttrici marca) {
        this.marca = marca;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    //Metodo: aumentare il valore del computer
    public int aumentoValore(int aumento){ //Per prima cosa si inserica un int, la quantità da aumentare
        this.valore+=aumento; //Il valore inserito viene poi aggiunto e restituito
        return this.valore;
    }

    //Metodo: cambiare l'utilizzatore con aumento del numero di utilizzatori
    public void cambioUtilizzatore(Persona utilizzatore) {
        this.utilizzatore = utilizzatore;
        aumentanumUtilizzatori(); //chiama il metodo seguente per aumentare il numero di utilizzatori
    }

    //Metodo privato: aumento utilizzatori
    private void aumentanumUtilizzatori() {
        this.numUtilizzatori++;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "idUnico=" + idUnico +
                ", utilizzatore=" + utilizzatore +
                ", marca=" + marca +
                ", valore=" + valore +
                ", numUtilizzatori=" + numUtilizzatori +
                '}';
    }

    //Comparare due elementi tra di loro. Questo metodo servirà in seguito per ordinare i computer per valore, per farlo si comparano prima tra di loro
    @Override
    public int compareTo(Computer c) {
        if(this.valore < c.valore){
            return -1;
        } else if (this.valore > c.valore){
            return  1;
        } else {
            return 0;
        }
    }

}