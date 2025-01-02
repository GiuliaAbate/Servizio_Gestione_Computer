# Servizio di gestione di computer

L'applicazione è un servizio dedicato alla gestione di computer in cui vengono definiti metodi per gestire diverse funzionalità in classi specifiche e utilizzati poi nel main del progetto.
Le classi che costituiscono l'applicazione sono:
  - **Computer:** definizione dei suoi attributi per gestire le caratteristiche di ogni computer come id, utilizzatore, marca, valore, numero degli utilizzatori e dei computer costruiti.
  - **Persona:** utilizzatore del computer che ha come attributi un id, cognome e indirizzo
  - **Case Produttrici:** marca del computer a cui si attribuiscono nome e nazione.
  - **Computer Privato:** prima sottoclasse di computer.
  - **Computer Tavolo:** seconda sottoclasse di computer che ha due suoi attributi: tipo e valore del monitor
  - **Computer Service:** gestisce insieme di computer (array) e deve avere un titolare, nome e indirizzo.
  - **Computer ServiceList:** classe identica alla precedente che però utilizza ArrayList invece degli array.
  - **Yellow Pages:** classe che contiene HashMap in cui associato al nome di una città c'è il rispettivo ComputerService
I metodi definiti nelle classi elencate sono state poi utilizzate nel main per testare il lavoro.

## Tecnologie
- Java

## Funzionalità
I metodi del progetto sono svariati e alcuni consistono in:
  - Aumento del valore 
  - Ricavare il numero di computer costruiti
  - Cambiare utilizzatore con aumento del numero di utilizzatori
  - Cambiare il valore del monitor
  - Riprovare a cambiare utilizzatore ma in questo caso dà errore
  - Dare la posizione nell'array del computer inserito
  - Ricavare il proprietario dato l'indice
  - Cercare indice del computer posseduto dalla persona specificata
  - Stampare i dati di tutti i computer
  - Modificare utilizzatore specificando indice del computer e nuovo utilizzatore
  - Vedere valore del computer specificando indice
  - Calcolare il totale dei valori dei computer
  - Trovare il valore massimo e minimo
  - Cercare computer in base alla marca
  - Trovare computer con un solo utilizzatore
  - Ordinare i computer in ordine di valore
  - Trovare nome e indirizzo del ComputerService specificando la città
  - Eliminare ComputerService specificando la città
  - Elencare le città in cui è presente un ComputerSerice

## Installazione
1. **Prerequisiti**
   - Installare un JDK
   - Installare un editor di testo o IDE
     
2. **Installazione**
   - Clonare il repository oppure scaricare il file ed estrarlo nella propria directory
   - Aprire il progetto nel proprio editor di testo/IDE
     
3. **Utilizzo**
   - Eseguire il file principale MAIN
