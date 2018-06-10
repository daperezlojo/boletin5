package boletin5_5;
import java.util.Scanner;
public class Boletin5_5 {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Numero num = new Numero();
        System.out.println("Escriba el primer valor:");
        int num1 = ler.nextInt();
        System.out.println("Escriba el segundo valor");
        int num2 = ler.nextInt();
        System.out.println("Escriba el tercer valor:");
        int num3 = ler.nextInt();
        num.Condicion(num1, num2, num3);
    }
    
    
}
