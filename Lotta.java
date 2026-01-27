public class Lotta {
    private Dado dado;

    // Costruttore
    public Lotta(Dado dado){
        this.dado = dado;
    }

    // Inizia la lotta tra due giocatori
    public Giocatore iniziaLotta(Giocatore giocatore1, Giocatore giocatore2){

        int vittorie1 = 0;
        int vittorie2 = 0;
        int numeroLanci = 3;

        // Tre lanci di dadi come richiesto 
        for(int i = 0; i < numeroLanci; i++){
            int lancio1 = dado.lancia2();
            int lancio2 = dado.lancia2();

            if (lancio1 > lancio2) {
                vittorie1++;
            } else if (lancio2 > lancio1) {
                vittorie2++;
            }
            // in caso di pareggio non viene contato il lancio
        }

        // Determina il vincitore
        if(vittorie1 > vittorie2){
            giocatore1.riceviPunti(giocatore2.getPunteggio());
            giocatore2.diminuisciPunteggio();
            return giocatore1;

        }else if(vittorie2 > vittorie1){
            giocatore2.riceviPunti(giocatore1.getPunteggio());
            giocatore1.diminuisciPunteggio();
            return giocatore2;
        }

        // in caso di pareggio ritorna null
        return null;
    }
}