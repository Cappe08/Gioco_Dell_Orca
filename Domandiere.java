public class Domandiere{
    private Domanda[] domande;
    private int numDomande;

    public Domandiere(int numeroDomande) {
        domande = new Domanda[numeroDomande];
        numDomande = 0;
    }

    public Domanda scegliDomanda(){
        if(domande==null || domande.length==0){
            return null;
        }

        int indice=(int)(Math.random()*domande.length);
        return domande[indice];
    }

    public boolean aggiungiDomanda(Domanda singolDomanda) {
        boolean res = false;
        if(numDomande < domande.length) {
            domande[numDomande] = singolDomanda;
            numDomande++;
            res = true;
        }
        return res;
    }

}