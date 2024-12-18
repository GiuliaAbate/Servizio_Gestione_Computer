//Seconda sottoclasse: Computer privato
public class ComputerPrivato extends Computer {
    public ComputerPrivato(CaseProduttrici marca, int valore, Persona utilizzatore) {
        super(marca, valore, utilizzatore);
    }
    
    //Si vuole sovrascrivere il metodo per cambiare utilizzatore, in questo caso il cambio non deve essere possibile
    @Override
    public void setUtilizzatore(Persona NuovoUtilizzatore) {
        System.out.println("Errore:non è possibile cambiare proprietario");
    }
}
