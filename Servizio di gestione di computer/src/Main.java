import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Istanze
        Persona p1=new Persona("rossi","via blu");
        Persona p2=new Persona("verdi","via rossa");
        Persona p3=new Persona("bianchi","via verdi");

        CaseProduttrici azienda1=new CaseProduttrici("lenovo","cina");
        CaseProduttrici azienda2=new CaseProduttrici("hp","stati uniti");

        Computer c1= new Computer(azienda2,130,p3);
        Computer c2= new Computer(azienda1,1000,p2);
        Computer c3= new Computer(azienda1,1300,p2);
        Computer c4= new Computer(azienda1,2000,p2);
        Computer c5= new Computer(azienda2,2500,p1);

        //Aumento valore
        System.out.println("Il valore è aumentato a " + c1.aumentoValore(10));
        
        //Si vuole avere il numero di computer costruiti
        int y= Computer.getnumeroCostruiti();
        System.out.println("I computer costruiti sono: " + y);

        //Si vuole cambiare utilizzatore
        c5.cambioUtilizzatore(p3);

        //Istanze
        ComputerTavolo tavolo= new ComputerTavolo(azienda2,200,p3,"LCD",35);
        ComputerTavolo tavolo1= new ComputerTavolo(azienda1,250,p2,"LCD",500);

        //Cambiare il valore del monitor
        tavolo.cambiaValoreMonitor(100);
        System.out.println(tavolo.getValoreMonitor());
        //Valore iniziale
        System.out.println(tavolo.getValore());

        //Istanza
        ComputerPrivato privato= new ComputerPrivato(azienda1,300,p1);
        
        //Cambiare utilizzatore ma non è possibile
        privato.setUtilizzatore(p2);

        //Istanza
        ComputerService service1=new ComputerService(p2,"Pippo","Torino",5);

        //Da posizione del computer inserito
        System.out.println("Il computer inserito è in posizione " + service1.inserisciComputer(c2));

        //Si inseriscono altri computer
        service1.inserisciComputer(c5);
        service1.inserisciComputer(c3);
        service1.inserisciComputer(c4);
        service1.inserisciComputer(tavolo1);

        //Si visualizza proprietario
        System.out.println("Il proprietario è " + service1.visualizzaProprietario(0));

        //Si cerca l'indice del computer posseduto dalla persona specificata
        System.out.println(Arrays.toString(service1.cercaComputer(p2)));

        //Stampare i dati di tutti i computer
        service1.stampaComputer();

        //Modificare utilizzatore specificando indice del computer e nuovo utilizzatore
        System.out.println("Il nuovo proprietario è " + service1.modificaUtilizzatore(0,p1));

        //Vedere valore del computer specificando indice
        System.out.println("Il valore è " + service1.visualizzaValore(1));

        //Calcolare il totale dei valori dei computer
        System.out.println("Il totale dei valori dei computer gestiti è " + service1.calcoloTotale());

        //Trovare il valore massimo e minimo
        System.out.println(Arrays.toString(service1.trovaMaxMin()));

        //Cercare computer in base alla marca
        System.out.println(Arrays.toString(service1.trovaPerMarca("lenovo")));

        //Trovare computer con un solo utilizzatore
        System.out.println(Arrays.toString(service1.trovaUnicoUtilizzatore()));

        //Ordinare i computer in ordine di valore
        System.out.println(Arrays.toString(service1.ordinaPerValore()));

        //Istanze
        ComputerServiceList serviceList=new ComputerServiceList(p3,"servizio","via finale");
        ComputerServiceList serviceList1=new ComputerServiceList(p1,"pippo","via paperopoli");

        //Metodi della classe ComputerServiceList
        serviceList.insertComputer(tavolo);

        System.out.println("Il computer inserito nella lista è in posizione " + serviceList.insertComputer(privato));
        
        serviceList.insertComputer(c1);

        System.out.println("Il proprietario è " + serviceList.vediProprietario(2));

        System.out.println(serviceList.cercaComputerList(p3));

        serviceList.stampaComputerList();

        System.out.println("Il nuovo proprietario è " + serviceList.modificaUtilizzatoreList(2,p1));

        System.out.println("Il valore è: " + serviceList.trovaValore(1));

        System.out.println("Il totale è: " + serviceList.trovaTotale());

        System.out.println(serviceList.MaxMin());

        System.out.println(serviceList.trovaPerMarcaList("hp"));

        System.out.println(serviceList.trovaUnicoUtilizzatoreList());
        
        System.out.println(serviceList.ordinaValore());

        //Istanza
        YellowPages pagine=new YellowPages();

        //Classe YellowPages, aggiungere le città e rispettivi computer service 
        System.out.println(pagine.aggiungiCitta("Torino",serviceList));
        System.out.println(pagine.aggiungiCitta("Milano",serviceList));
        System.out.println(pagine.aggiungiCitta("Roma",serviceList1));
        System.out.println(pagine.aggiungiCitta("Torino",serviceList1));

        //Trovare nome e indirizzo del ComputerService specificando la città
        System.out.println(pagine.trovaService("Roma"));

        //Eliminare ComputerService specificando la città
        System.out.println(pagine.eliminaService("Milano"));

        //Elencare le città in cui è presente un ComputerSerice
        System.out.println(pagine.elencaCitta());
    }
}