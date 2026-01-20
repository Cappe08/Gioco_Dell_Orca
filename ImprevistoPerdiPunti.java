public class ImprevistoPerdiPunti extends Imprevisto {

    private int puntiPersi;

    public ImprevistoPerdiPunti(int puntiPersi) {
        super("Perdi " + puntiPersi + " punti");
        this.puntiPersi = puntiPersi;
    }

    @Override
    public void applicaEffetto(Giocatore g, Tabellone t) {
        g.riceviPunti(-puntiPersi);
    }
}
