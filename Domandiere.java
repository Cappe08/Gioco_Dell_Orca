public class Domandiere{
    private Domanda[] domande;
    private int numDomande;

    public Domandiere(int numeroDomande) {
        domande = new Domanda[numeroDomande];
        numDomande = 0;
    }

    public Domanda scegliDomanda(){
        if(numDomande == 0){
            return null;
        }

        int indice=(int)(Math.random()*domande.length);
        return domande[indice];
    }

    public boolean aggiungiDomanda(Domanda singolaDomanda) {
        boolean res = false;
        if(numDomande < domande.length) {
            domande[numDomande] = singolaDomanda;
            numDomande++;
            res = true;
        }
        return res;
    }

}