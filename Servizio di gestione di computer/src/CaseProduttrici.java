//Classe per gestire le case produttrici di computer
public class CaseProduttrici {
    //Nome e nazioni devono essere gestite in modo privato
    private String nome;
    private String nazione;

    public CaseProduttrici(String nome, String nazione) {
        this.nome = nome;
        this.nazione = nazione;
    }
    
    public String getNome() {
        return nome;
    }
    public String getNazione() {
        return nazione;
    }
    //Scrivere il valore con un setter solo per la nazione della casa produttrice
    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    @Override
    public String toString() {
        return "CaseProduttrici{" +
                "nome='" + nome + '\'' +
                ", nazione='" + nazione + '\'' +
                '}';
    }
}