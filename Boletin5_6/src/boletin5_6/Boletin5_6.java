package boletin5_6;
import java.util.Scanner;
public class Boletin5_6 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       Artigos art1 = new Artigos();
        
       System.out.println("Introduzca o nome do artigo");
        String nome = ler.next();
       
       System.out.println("Introduzca la cantidad de ventas anuales");
        int ventas = ler.nextInt();
        art1.condicion(ventas);
    }
    
    
}
