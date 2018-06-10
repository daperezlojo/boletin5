package boletin5_5;
import java.util.Scanner;
public class Numero {
    Scanner ler = new Scanner(System.in);
    public int num1, num2, num3;
    public Numero(){
        
    }
    public Numero(int n1, int n2, int n3){
        n1 = num1;
        n2 = num2;
        n3 = num3;
    }
    public void Condicion(int num1, int num2, int num3){
        if (num1>num2 && num1>num3){
            System.out.println("El primer valor("+num1+") es el mayor de los 3");
        }
        else if (num2>num1 && num2>num3){
            System.out.println("El segundo valor ("+num2+") es el mayor de los 3");
        }
        else {
        System.out.println("El tercer valor ("+num3+") es el mayor de los 3");
    }
    }
}
