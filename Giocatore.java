import java.util.ArrayList;

public class Giocatore {

    private String nome;
    private int punteggio;
    private char pedina;
    private Casella casellaCorrente;

    // Lista degli ID delle domande già fatte (per evitare ripetizioni)
    private ArrayList<Integer> domandeAssegnate;

    public Giocatore(String nome, char pedina) {
        this.nome = nome;
        this.pedina = pedina;
        this.punteggio = 0;
        this.domandeAssegnate = new ArrayList<>();
    }

    // ===== Getter =====
    public String getNome() {
        return nome;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public char getPedina() {
        return pedina;
    }

    public Casella getCasellaCorrente() {
        return casellaCorrente;
    }

    public void setCasellaCorrente(Casella casellaCorrente) {
        this.casellaCorrente = casellaCorrente;
    }

    // ===== Logica di gioco =====

    // Aumenta il punteggio
    public void riceviPunti(int punti) {
        punteggio += punti;
    }

    // Dimezza il punteggio (divisione intera)
    public void dimezzaPunteggio() {
        punteggio = punteggio / 2;
    }

    // Segna una domanda come già fatta
    public void aggiungiDomandaAssegnata(Domanda d) {
        domandeAssegnate.add(d.getId());
    }

    // Controlla se una domanda è già stata fatta
    public boolean domandaGiaFatta(Domanda d) {
        return domandeAssegnate.contains(d.getId());
    }
}

