public class Main {

    public static void main(String[] args) {
        //Creazione domandiere
        Domandiere domandiere = PercorsoFile.creaQuiz();

        //Creazione tabellone
        System.out.println("");
        System.out.print("Inserisci il numero di caselle del tabellone(non deve superare 100, in caso contrario verrà inserito di default 100 caselle ");
        int numeroCaselle = Leggi.unInt();
        if(numeroCaselle > 100){
            numeroCaselle = 99;
        }
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

        // assegna gli imprevisti alle caselle specifiche
        tabellone.getCasella(1).setImprevisto(imprevisti[0]);
        tabellone.getCasella(9).setImprevisto(imprevisti[1]);
        tabellone.getCasella(13).setImprevisto(imprevisti[2]);
        tabellone.getCasella(17).setImprevisto(imprevisti[3]);

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
            System.out.println("Oppure scrivi: imprevisto1, imprevisto2, imprevisto3, imprevisto4, lotta");
            String comando = Leggi.unoString();

            int passi = 0;
            if(comando.equals("invio")){
                passi = dado.lancia(6);
                System.out.println(g.getNome() + " ha ottenuto: " + passi);
                tabellone.spostaPedina(g, passi);
            }else if(comando.equals("imprevisto1")){
                imprevisti[0].applicaEffetto(g, tabellone);

            }else if(comando.equals("imprevisto2")){
                imprevisti[1].applicaEffetto(g, tabellone);

            }else if(comando.equals("imprevisto3")){
                imprevisti[2].applicaEffetto(g, tabellone);

            }else if(comando.equals("imprevisto4")){
                imprevisti[3].applicaEffetto(g, tabellone);

            }else if(comando.equalsIgnoreCase("lotta")){
                Casella corrente = g.getCasellaCorrente();
                Giocatore altro = corrente.getAltroGiocatore(g);

                if(altro == null){
                    System.out.println("Nessun giocatore con cui combattere su questa casella.");
                }else{
                    System.out.println("lotta tra " + g.getNome() + " e " + altro.getNome());
                    Giocatore vincitore = lotta.iniziaLotta(g, altro);

                    if(vincitore != null){
                        System.out.println("Ha vinto: " + vincitore.getNome());
                    }else{
                        System.out.println("La lotta è finita in pareggio.");
                    }
                }

            }else{
                System.out.println("Comando non valido!");
                continue;
            }

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
