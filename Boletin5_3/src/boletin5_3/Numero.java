package boletin5_3;
import java.util.Scanner;
public class Numero {
    Scanner ler = new Scanner(System.in);
    int num1;
    public Numero(){
        
    } 
    public Numero(int n1){
        n1 = num1;
    }
    public void Operaciones(int n1){
        if (n1>0){
            System.out.println("+");
        }
        else if (n1<0){
            System.out.println("-");
        }        
        else {
            System.out.println("0");
        }
        
    }



}




