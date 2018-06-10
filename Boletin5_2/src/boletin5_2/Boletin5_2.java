package boletin5_2;
import java.util.Scanner;
public class Boletin5_2 {

    public static void main(String[] args) {
        Numero num1 = new Numero();
        Scanner pedir = new Scanner(System.in);
        System.out.println("Escriba el valor de N1");
        short n1 = pedir.nextShort();
        System.out.println("Escriba el valor de N2");
        short n2 = pedir.nextShort();
        num1.operaciones(n1, n2);
        
    }
    
}
