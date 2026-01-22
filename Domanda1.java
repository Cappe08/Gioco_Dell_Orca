public class Domanda{
    private String domanda;
    private String[] risposte;
    private int rispostaCorretta;
    private int punti;
    private int livelloDifficolta;
    private int id;

    public Domanda(String domanda, String[] risposte, int rispostaCorretta, int punti, int livelloDifficolta, int id) {
        this.risposte = risposte;
        this.domanda = domanda;
        this.rispostaCorretta = rispostaCorretta;
        this.punti = punti;
        this.livelloDifficolta = livelloDifficolta;
        this.id = id;
    }

    public int getRispostaCorretta() {
        return rispostaCorretta;
    }

    public void setRispostaCorretta(int rispostaCorretta) {
        this.rispostaCorretta = rispostaCorretta;
    }

    public int getPunti() {
        return punti;
    }

    public void setPunti(int punti) {
        this.punti = punti;
    }

    public int getLivelloDifficolta() {
        return livelloDifficolta;
    }

    public void setLivelloDifficolta(int livelloDifficolta) {
        this.livelloDifficolta = livelloDifficolta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDomanda() {
        return domanda;
    }

    public void setDomanda(String domanda) {
        this.domanda = domanda;
    }

    public String[] getRisposte() {
        return risposte;
    }

    public void setRisposte(String[] risposte) {
        this.risposte = risposte;
    }


    public String toString(){
        String s = "\n-------------------------\n" + domanda + "\n\n";
        for(int i = 0; i < risposte.length; i++){
            s = s + (i+1) + ") " + risposte[i] + "\n";
        }
        return s;
    }
    public boolean valutaRisposta(String risposta) {
    String rispostaGiusta = risposte[rispostaCorretta - 1];
    return risposta.equalsIgnoreCase(rispostaGiusta);
}

}
