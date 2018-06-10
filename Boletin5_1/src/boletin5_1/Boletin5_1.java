package boletin5_1;
import java.util.Scanner;
public class Boletin5_1 {

    public static void main(String[] args) {
        Scanner pedir = new Scanner(System.in);
        Numero num1 = new Numero();
        System.out.println("Escriba el valor de num1");
        int n1 = pedir.nextInt();
        num1.mostrar(n1);
           
        
    }
    
}
