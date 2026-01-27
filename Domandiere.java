public class Domandiere{
    private Domanda[] domande;

    public Domandiere(Domanda[] domande) {
        this.domande=domande;
    }

    public Domanda scegliDomanda(Domanda[] domande){
        if(domande==null || domande.length==0){
            return null;
        }

        int indice=(int)(Math.random()*domande.length);
        return domande[indice];
    }
}