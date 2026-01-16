import java.util.ArrayList;

public class Giocatore {

    // Il nome del giocatore
    private String nome;

    // I punti totali del giocatore
    private int punteggio;

    // La pedina/simbolo del giocatore sul tabellone
    private char pedina;

    // La casella in cui si trova il giocatore
    private Casella casellaCorrente;

    // Lista degli ID delle domande già fatte dal giocatore
    // Serve per evitare di ripetere la stessa domanda
    private ArrayList<Integer> domandeAssegnate;

    // Costruttore: crea un nuovo giocatore con nome e pedina
    public Giocatore(String nome, char pedina){
        this.nome = nome;
        this.pedina = pedina;
        this.punteggio = 0;               // inizialmente 0 punti
        this.casellaCorrente = null;      // non è ancora posizionato sul tabellone
        this.domandeAssegnate = new ArrayList<>(); // lista vuota di domande fatte
    }

    // Aumenta il punteggio del giocatore
    public void riceviPunti(int punti){
        this.punteggio = this.punteggio + punti;
    }

    // Dimezza il punteggio (per eventi negativi)
    public void dimezzaPunteggio(){
        this.punteggio = this.punteggio / 2;
    }

    // Salva l'ID di una domanda già fatta
    // Prende una domanda (oggetto Domanda) e salva il suo ID
    public void aggiungiDomandaAssegnata(Domanda domanda){
        domandeAssegnate.add(domanda.getId());
    }

    // Controlla se una domanda è già stata fatta
    public boolean domandaGiaFatta(Domanda domanda){
        return domandeAssegnate.contains(domanda.getId());
    }

    // Getter: restituisce il nome del giocatore
    public String getNome(){
        return nome;
    }

    // Getter: restituisce il punteggio
    public int getPunteggio(){
        return punteggio;
    }

    // Getter: restituisce la pedina del giocatore
    public char getPedina(){
        return pedina;
    }

    // Getter: restituisce la casella corrente
    public Casella getCasellaCorrente(){
        return casellaCorrente;
    }

    // Setter: aggiorna la casella corrente
    public void setCasellaCorrente(Casella casellaCorrente){
        this.casellaCorrente = casellaCorrente;
    }

    // Getter: restituisce la lista degli ID delle domande già fatte
    public ArrayList<Integer> getDomandeAssegnate(){
        return domandeAssegnate;
    }
}
