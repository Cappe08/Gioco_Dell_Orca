import java.util.Random;

public class Dado{

    private int numeroFacce;

    // Costruttore
    public Dado(int numeroFacce){
        this.numeroFacce=numeroFacce;
    }

    public int getNumeroFacce(){
        return numeroFacce;
    }

    // Lancia il dado e restituisce un numero tra 1 e numeroFacce
    public int lancia(int numeroFacce){
        Random r=new Random();
        return r.nextInt(numeroFacce)+1;
    }
}

