public class Casella {

    private int id;
    private String titolo;
    private Casella precedente;
    private Casella successiva;
    private Domanda domanda;
    private Giocatore[] giocatoriPresenti;
    private int numGiocatori;

    // Costruttore
    public Casella(int id, String titolo, Domanda domanda, int maxGiocatori) {
        this.id=id;
        this.titolo=titolo;
        this.domanda=domanda;
        this.giocatoriPresenti=new Giocatore[maxGiocatori];
        this.numGiocatori=0;
    }

    // Getter e setter
    public int getId(){
        return id;
    }

    public String getTitolo(){
        return titolo;
    }

    public Casella getPrecedente(){
        return precedente;
    }

    public void setPrecedente(Casella precedente){
        this.precedente=precedente;
    }

    public Casella getSuccessiva(){
        return successiva;
    }

    public void setSuccessiva(Casella successiva){
        this.successiva=successiva;
    }

    // Numero di giocatori presenti
    public int getNumGiocatori(){
    int count=0;

    for(int i=0;i<giocatoriPresenti.length;i++) {
        if(giocatoriPresenti[i]!=null) {
            count=count+1;
        }
    }
    return count;
    }

    // Aggiunge un giocatore
    public void aggiungiGiocatore(Giocatore g){
        if(numGiocatori<giocatoriPresenti.length){
            giocatoriPresenti[numGiocatori]=g;
            numGiocatori=numGiocatori+1;
            g.setCasellaCorrente(this);
        }else{
        System.out.println("Casella piena, impossibile aggiungere " + g.getNome());
        }
    }

    // Rimuove un giocatore
    public void rimuoviGiocatore(Giocatore g){
        for(int i=0;i<numGiocatori;i++){
            if(giocatoriPresenti[i]==g){
                for(int j=i;j<numGiocatori-1;j++){
                    giocatoriPresenti[j]=giocatoriPresenti[j+1];
                }
                giocatoriPresenti[numGiocatori-1]=null;
                break;
            }
        }
    }

    // Restituisce l'altro giocatore presente sulla casella (per la lotta)
    public Giocatore getAltroGiocatore(Giocatore g){
        for(int i=0;i<giocatoriPresenti.length;i++){
            if(giocatoriPresenti[i]!=null){
                if(giocatoriPresenti[i]!=g){
                    return giocatoriPresenti[i]; // trovato un altro giocatore
                }else{
                    // è lo stesso giocatore, non facciamo nulla
                }
            }else{
            // posizione vuota, non facciamo nulla
            }
        }
        // se non abbiamo trovato nessun altro giocatore
        return null;
    }


    // Attiva la domanda della casella
    public void attivaDomanda(Giocatore g){
        if(domanda==null){
            System.out.println("Nessuna domanda in questa casella.");
            return;
        }

        System.out.println("\n Casella "+(id+1));
        System.out.println(domanda);

        System.out.print("Inserisci la risposta: ");
        String risposta=Leggi.unoString();

        if(domanda.valutaRisposta(risposta)){
            System.out.println("Risposta corretta! +"+domanda.getPunti());
            g.riceviPunti(domanda.getPunti());
        }else{
            System.out.println("Risposta sbagliata! I punti saranno diminuiti.");
            g.diminuisciPunteggio();
        }
    }
}


