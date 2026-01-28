public class Main {

    public static void main(String[] args) {
        //Creazione domandiere
        Domandiere domandiere = PercorsoFile.creaQuiz();

        //Creazione tabellone
        int numeroCaselle = 20;
        Tabellone tabellone = new Tabellone(numeroCaselle, domandiere);

        //creazione giocatori
        System.out.print("Quanti giocatori partecipano al gioco? ");
        int numGiocatori = Leggi.unInt();
        Giocatore[] giocatori = new Giocatore[numGiocatori];

        for(int i = 0; i < numGiocatori;i++){
            System.out.print("Inserisci il nome del giocatore " + (i+1) + ": ");
            String nome = Leggi.unoString();
            giocatori[i] = new Giocatore(nome, (char)('A'+i));
            // tutti i giocatori devono partire dalla casella 0
            tabellone.getCasella(0).aggiungiGiocatore(giocatori[i]);
        }

        // Creazione degli imprevisti
        Imprevisto[] imprevisti = {
        new ImprevistoAvanza(1),
        new ImprevistoAvanza(3),
        new ImprevistoPerdiPunti(8),
        new ImprevistoPerdiPunti(14)
        };

        //creazione del dado e della lotta
        Dado dado = new Dado(6);
        Lotta lotta = new Lotta(dado);

        // Creazione e avvio del gioco
        boolean giocoInCorso = true;
        int turno = 0;
        while (giocoInCorso) {
            Giocatore g = giocatori[turno];
            System.out.println("\nTocca a " + g.getNome() + " (punteggio: " + g.getPunteggio() + ")");
            System.out.println("Premi INVIO per lanciare il dado");
            Leggi.unoString();

            int passi = dado.lancia(6);
            System.out.println(g.getNome() + " ha ottenuto: " + passi);
            tabellone.spostaPedina(g, passi);
            Casella corrente = g.getCasellaCorrente();
            System.out.println(g.getNome() + " si trova sulla casella " + corrente.getId());

            //controlla se sei arrivato all'ultima casella(se hai vinto) oppure se hai perso(se il punteggio è minore di 0)
            if (corrente.getSuccessiva() == null) {
                System.out.println("\n " + g.getNome() + " ha raggiunto l'ultima casella e ha vinto!");
                giocoInCorso = false;
            } else if (g.getPunteggio() < 0) {
                System.out.println("\n " + g.getNome() + " ha perso!");
                giocoInCorso = false;
            }

            turno++;
            if (turno >= giocatori.length) {
                turno = 0; // torna al primo giocatore
            }
        }

        System.out.println("Gioco Terminato");
        for (int i = 0; i < giocatori.length; i++) {
            System.out.println(giocatori[i].getNome() + ": " + giocatori[i].getPunteggio());
        }
    }
}