public class Domanda {
    private int id;
    private String titolo;
    private String[] risposte;
    private int corretta;
    private int punti;
    private String livelloDifficolta;

    public int getCorretta(){
        return corretta;
    }

    public void setCorretta(int corretta){
        this.corretta = corretta;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitolo(){
        return titolo;
    }

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }

    public String[] getRisposte(){
        return risposte;
    }

    public void setRisposte(String[] risposte){
        this.risposte = risposte;
    }

    public int getPunti(){
        return punti;
    }

    public void setPunti(int punti){
        this.punti = punti;
    }

    public String getLivelloDifficolta(){
        return livelloDifficolta;
    }

    public void setLivelloDifficolta(String livelloDifficolta){
        this.livelloDifficolta = livelloDifficolta;
    }

    public Domanda(int id, String titolo, String[] risposte, int corretta, int punti, String livelloDifficolta){
        this.id = id;
        this.titolo = titolo;
        this.risposte = risposte;
        this.corretta = corretta;
        this.punti = punti;
        this.livelloDifficolta = livelloDifficolta;
    }

    // Metodo per valutare la risposta dell'utente
    public boolean valutaRisposta(int id){
        if(id == corretta)
            return true;
        else{
            return false;
        }   
    }
}