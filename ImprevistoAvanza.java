public class ImprevistoAvanza extends Imprevisto {

    private int passi;

    public ImprevistoAvanza(int passi) {
        super("Avanza di " + passi + " caselle");
        this.passi = passi;
    }

    @Override
    public void applicaEffetto(Giocatore g, Tabellone t) {
        t.spostaPedina(g, passi);
    }
}
