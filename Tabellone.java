public class Tabellone {

    private int numeroCaselle;
    private Casella[] listaCaselle;

    public Tabellone(int numeroCaselle, Domandiere domandiere){
        this.numeroCaselle=numeroCaselle;
        this.listaCaselle=new Casella[numeroCaselle];

        costruisciTabellone(domandiere);
    }
    public void costruisciTabellone(Domandiere domandiere){

    Domanda[] domande=domandiere.getDomande();

    // creo le caselle
    for(int i=0;i<numeroCaselle;i=i+1){
        Domanda d=domandiere.scegliDomanda(domande);
        listaCaselle[i]=new Casella(
            i,
            "Casella"+i,
            d,
            5
        );
    }

    // collego le caselle
    for(int i=0;i<numeroCaselle;i=i+1){
        if(i>0){
            listaCaselle[i].setPrecedente(listaCaselle[i-1]);
        }else{
            // prima casella
        }
        if(i<numeroCaselle-1){
            listaCaselle[i].setSuccessiva(listaCaselle[i+1]);
        }else{
            // ultima casella
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

