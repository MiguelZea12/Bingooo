package Bingo;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Random;
import java.security.SecureRandom;

public class Bingo {

    public void aleatorio() { 
        

        Bola bola1 = new Bola();
        Tabla tabla1 = new Tabla();


        int[] casillero = new int [90];
        
        Scanner input = new Scanner(System.in);
        System.out.println("Aplasta `ENTER` para empezar: ");
        input.nextLine();
        tabla1.tabla();
    
        int i = 0;
        int numero;
        while(true){
            do{
                tabla1.tabla();
                numero = bola1.aleatorio();
                casillero[i] = numero; 
                System.out.println("El numero de la bola es: "+ casillero[i]);
                System.out.println("Press Enter");
                input.nextLine();
                i ++;

            }while(casillero[i] != numero);
            

            

            
            
             
         }
    }
   

}
    

    
    

