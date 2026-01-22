public class Domandiere {
    private Domanda[] domande;
    private String percorsoFileDomande;

    public Domandiere(Domanda[] domande, String percorsoFileDomande){
        this.domande = domande;
        this.percorsoFileDomande = percorsoFileDomande;
    }

    public String getPercorsoFileDomande(){
        return percorsoFileDomande;
    }

    public void setPercorsoFileDomande(String percorsoFileDomande){
        this.percorsoFileDomande = percorsoFileDomande;
    }

    public Domanda[] getDomande(){
        return domande;
    }

    public void setDomande(Domanda[] domande){
        this.domande = domande;
    }

    //metodo per scegliere una domanda casuale dall'array di domande
    public Domanda scegliDomanda(Domanda[] domande){
        if(domande.length == 0 || domande == null){
            return null;
        }

        int indice = (int)(Math.random() * domande.length);
        return domande[indice];
    }

    // Legge il file e restituisce il contenuto come String
    public String leggiFile(String percorsoFile) {
        String contenuto = "";

        try {
            java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(percorsoFile));

            String linea;
            while ((linea = br.readLine()) != null) {
                contenuto += linea + "\n";
            }

            br.close();
        } catch (java.io.IOException e) {
            System.out.println("Errore nella lettura del file");
        }

        return contenuto;
    }

}

