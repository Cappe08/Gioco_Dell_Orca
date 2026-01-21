public class Casella {

    private int id;
    private String titolo;
    private Casella precedente;
    private Casella successiva;
    private Domanda1 domanda;
    private Giocatore[] giocatoriPresenti;
    private int numGiocatori;

    // Costruttore
    public Casella(int id, String titolo, Domanda1 domanda, int maxGiocatori) {
        this.id = id;
        this.titolo = titolo;
        this.domanda = domanda;
        this.giocatoriPresenti = new Giocatore[maxGiocatori];
        this.numGiocatori = 0;
    }

    // Getter e setter
    public int getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public Casella getPrecedente() {
        return precedente;
    }

    public void setPrecedente(Casella precedente) {
        this.precedente = precedente;
    }

    public Casella getSuccessiva() {
        return successiva;
    }

    public void setSuccessiva(Casella successiva) {
        this.successiva = successiva;
    }

    // Numero di giocatori presenti
    public int getNumGiocatori() {
        int count = 0;
        for (Giocatore g : giocatoriPresenti) {
            if (g != null) count++;
        }
        return count;
    }

    // Aggiunge un giocatore
    public void aggiungiGiocatore(Giocatore g) {
        if (numGiocatori < giocatoriPresenti.length) {
            giocatoriPresenti[numGiocatori++] = g;
            g.setCasellaCorrente(this);
        } else {
            System.out.println("Casella piena, impossibile aggiungere " + g.getNome());
        }
    }

    // Rimuove un giocatore
    public void rimuoviGiocatore(Giocatore g) {
        for (int i = 0; i < numGiocatori; i++) {
            if (giocatoriPresenti[i] == g) {
                for (int j = i; j < numGiocatori - 1; j++) {
                    giocatoriPresenti[j] = giocatoriPresenti[j + 1];
                }
                giocatoriPresenti[--numGiocatori] = null;
                break;
            }
        }
    }

    // Restituisce l'altro giocatore presente sulla casella (per la lotta)
    public Giocatore getAltroGiocatore(Giocatore g) {
        for (Giocatore giocatore : giocatoriPresenti) {
            if (giocatore != null && giocatore != g) {
                return giocatore;
            }
        }
        return null; // nessun altro giocatore
    }

    // Attiva la domanda della casella
    public void attivaDomanda(Giocatore g) {
        if (domanda == null) {
            System.out.println("Nessuna domanda in questa casella.");
            return;
        }

        System.out.println("\nCasella " + (id + 1));
        System.out.println(domanda);

        System.out.print("Inserisci la risposta: ");
        String risposta = Leggi.unoString();

        if (domanda.valutaRisposta(risposta)) {
            System.out.println("Risposta corretta! +" + domanda.getPunti());
            g.riceviPunti(domanda.getPunti());
        } else {
            System.out.println("Risposta sbagliata! Punti dimezzati.");
            g.dimezzaPunteggio();
        }
    }
}
