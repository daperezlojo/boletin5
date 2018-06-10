package boletin5_4;
import java.util.Scanner;
public class Boletin5_4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Persoa Per1 = new Persoa();
        System.out.println("Escriba el Nombre 1");
        String nome1 = ler.next();
        System.out.println("Escriba el Peso 1");
        float peso1 = ler.nextFloat();
        System.out.println("Escriba el Nombre 2");
        String nome2 = ler.next();
        System.out.println("Escriba el peso 2");
        float peso2 = ler.nextFloat();
        
        Per1.Comparativa(peso1, peso2);
        
    }
    
}
