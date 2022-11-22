package Bingo;
import java.util.Random;
import java.security.SecureRandom;

public class Bola {
    
    public int aleatorio() {
        Random aleatorio = new Random(System.currentTimeMillis());
        int intAletorio = aleatorio.nextInt(90);
        System.out.println(" ");
        System.out.println(" " + intAletorio);
        System.out.println(" ");
        return intAletorio;
}
}
