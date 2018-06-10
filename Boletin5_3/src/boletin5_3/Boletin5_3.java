package boletin5_3;
import java.util.Scanner;
public class Boletin5_3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Numero num1 = new Numero();
        System.out.println("Escriba el valor del numero:");
        int n1 = ler.nextInt();
        num1.Operaciones(n1);
    }
    
    
}
