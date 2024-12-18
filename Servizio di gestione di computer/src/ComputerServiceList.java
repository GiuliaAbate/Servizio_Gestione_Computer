import java.util.ArrayList;
import java.util.Collections;

//Classe ComputerServiceList con gli stessi metodi della classe ComputerService ma in questo caso si usano solo gli ArrayList
public class ComputerServiceList {
    private Persona titolare;
    private String nome;
    private String indirizzo;
    private ArrayList<Computer> computerslist;

    public ComputerServiceList(Persona titolare, String nome, String indirizzo) {
        this.titolare = titolare;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.computerslist = new ArrayList<>();
    }

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

    public ArrayList<Computer> getComputerslist() {
        return computerslist;
    }

    public void setComputerslist(ArrayList<Computer> computerslist) {
        this.computerslist = computerslist;
    }

    public int insertComputer(Computer c) {
        computerslist.add(c);
        int indice = computerslist.size() - 1 ;
        return indice;
    }

    public Persona vediProprietario(int indice) {
        return computerslist.get(indice).getUtilizzatore();
    }

    public ArrayList<Integer> cercaComputerList(Persona p) {
        ArrayList<Integer> indici = new ArrayList<>();

        for (int i = 0; i < computerslist.size(); i++) {
            if (computerslist.get(i).getUtilizzatore().equals(p)) {
                indici.add(i);
            }
        }
        return indici;
    }

    public void stampaComputerList() {
        for (int i = 0; i < computerslist.size(); i++) {
            String c1 = computerslist.get(i).toString();
            System.out.println(c1);
        }
    }

    public Persona modificaUtilizzatoreList(int indice, Persona nuovoP) {
        if (indice >= 0 && indice < computerslist.size() && computerslist.get(indice) != null) {
            computerslist.get(indice).cambioUtilizzatore(nuovoP);
        }
        return nuovoP;
    }

    public int trovaValore(int indice) {
        return computerslist.get(indice).getValore();
    }

    public int trovaTotale() {
        int somma = 0;
        for (Computer c : computerslist) {
            somma += c.getValore();
        }
        return somma;
    }

    public ArrayList<Integer> MaxMin() {
        int max = computerslist.get(0).getValore();
        int indMax = 0;
        int min = computerslist.get(0).getValore();
        int indMin = 0;

        for (int i = 0; i < computerslist.size(); i++) {
            int valore = computerslist.get(i).getValore();
            if (valore > max) {
                max = valore;
                indMax = i;
            }
            if (valore < min) {
                min = valore;
                indMin = i;
            }
        }
        ArrayList<Integer> risultato = new ArrayList<>();
        risultato.add(max);
        risultato.add(min);
        return risultato;
    }

    public ArrayList<Computer> trovaPerMarcaList(String marca) {
        ArrayList<Computer> risultati = new ArrayList<>();
        for (int i = 0; i < computerslist.size(); i++) {
            if (computerslist.get(i).getMarca().getNome().equals(marca)) {
                risultati.add(computerslist.get(i));
            }
        }
        return risultati;
    }

    public ArrayList<Computer> trovaUnicoUtilizzatoreList() {
        ArrayList<Computer> unicoProprietario = new ArrayList<>();
        for (int i = 0; i < computerslist.size(); i++) {
            if (computerslist.get(i).getnumUtilizzatori()  == 0) {
                unicoProprietario.add(computerslist.get(i));
            }
        }
        return unicoProprietario;
    }

    public ArrayList<Computer> ordinaValore() {
        ArrayList<Computer> ordinato = new ArrayList<>(computerslist);
        Collections.sort(ordinato);
        return ordinato;
    }

}
