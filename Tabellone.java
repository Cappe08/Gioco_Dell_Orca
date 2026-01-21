public class Tabellone {

    private int numeroCaselle;
    private Casella[] listaCaselle;

    public Tabellone(int numeroCaselle, Domandiere domandiere) {
        this.numeroCaselle = numeroCaselle;
        this.listaCaselle = new Casella[numeroCaselle];

        costruisciTabellone(domandiere);
    }

    public void costruisciTabellone(Domandiere domandiere) {

        Domanda1[] domande = domandiere.getDomande();

        for (int i = 0; i < numeroCaselle; i++) {
            Domanda1 d = domandiere.scegliDomanda(domande);

            listaCaselle[i] = new Casella(
                i,
                "Casella " + i,
                d,
                4
            );
        }

        for (int i = 0; i < numeroCaselle; i++) {
            if (i > 0) listaCaselle[i].setPrecedente(listaCaselle[i - 1]);
            if (i < numeroCaselle - 1) listaCaselle[i].setSuccessiva(listaCaselle[i + 1]);
        }
    }

    public void spostaPedina(Giocatore g, int passi) {

        Casella attuale = g.getCasellaCorrente();
        Casella destinazione = spostaCasella(attuale, passi);

        attuale.rimuoviGiocatore(g);
        destinazione.aggiungiGiocatore(g);
        destinazione.attivaDomanda(g);
    }

    public Casella spostaCasella(Casella c, int passi) {
        Casella corrente = c;

        for (int i = 0; i < passi && corrente.getSuccessiva() != null; i++) {
            corrente = corrente.getSuccessiva();
        }
        return corrente;
    }

    public Casella getCasella(int indice) {
        return listaCaselle[indice];
    }
}
