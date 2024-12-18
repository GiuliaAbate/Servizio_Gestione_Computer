//Prima sottoclasse: computer da tavolo che deve contenere attributi per gestire il tipo e valore del monitor con i getter
public class ComputerTavolo extends Computer{
    protected String tipoMonitor;
    protected int valoreMonitor;

    //Cosrtruttore
    public ComputerTavolo(CaseProduttrici marca, int valore, Persona utilizzatore, String tipoMonitor, int valoreMonitor) {
        super(marca, valore, utilizzatore); //super richiama attributi della classe computer
        this.tipoMonitor = tipoMonitor;
        this.valoreMonitor = valoreMonitor;
    }

    public String getTipoMonitor() {
        return tipoMonitor;
    }

    public void setTipoMonitor(String tipoMonitor) {
        this.tipoMonitor = tipoMonitor;
    }

    public int getValoreMonitor() {
        return valoreMonitor;
    }

    public void setValoreMonitor(int valoreMonitor) {
        this.valoreMonitor = valoreMonitor;
    }

    //Metodo: cambiare il valore del monitor
    public void cambiaValoreMonitor(int nuovoValoreMonitor){ //Come parametro vuole nuovo numero con cui si vuole cambiare
        this.valoreMonitor=nuovoValoreMonitor; //Il nuovo valore viene impostato
        valore+=nuovoValoreMonitor;
    }
}