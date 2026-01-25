public class Tabellone{
    private int numeroCaselle;
    private Casella[] listaCaselle;

    public Tabellone(int numeroCaselle, Domandiere domandiere){
        this.numeroCaselle=numeroCaselle;
        this.listaCaselle=new Casella[numeroCaselle];
        costruisciTabellone(domandiere);
    }

    public void costruisciTabellone(Domandiere domandiere){
        for(int i=0;i<numeroCaselle;i=i+1){
            Domanda d=domandiere.scegli(null);
            listaCaselle[i] = new Casella(
            i,
            "Casella " + i,
            d,
            5
            );
        }
        /*Collegamento bidirezionale delle caselle:
        ogni casella viene collegata a quella precedente e a quella successiva,
        in modo da permettere lo spostamento avanti e indietro sul tabellone*/
        for(int i=0;i<numeroCaselle;i=i+1){
            if(i>0){
                listaCaselle[i].setPrecedente(listaCaselle[i-1]);
            }
            if(i<numeroCaselle-1){
                listaCaselle[i].setSuccessiva(listaCaselle[i+1]);
            }
        }
    }
    
    public void spostaPedina(Giocatore g,int passi){
        Casella attuale=g.getCasellaCorrente();
        Casella destinazione=spostaCasella(attuale,passi);
        attuale.rimuoviGiocatore(g);
        destinazione.aggiungiGiocatore(g);
        destinazione.attivaDomanda(g);
    }

    public Casella spostaCasella(Casella c,int passi){
        Casella corrente=c;
        for(int i=0;i<passi && corrente.getSuccessiva()!=null;i++){
            corrente=corrente.getSuccessiva();
        }
        return corrente;
    }

    public Casella getCasella(int indice){
        return listaCaselle[indice];
    }
}
