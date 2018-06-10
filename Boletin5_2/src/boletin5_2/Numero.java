package boletin5_2;
import java.util.Scanner;
public class Numero {
 Scanner pedir = new Scanner(System.in);
 private short numero1;
 private short numero2;
 public Numero(){
    
}
 public Numero(short n1,short n2){
     n1 = numero1;
     n2 = numero2;
 }
public void operaciones(short n1, short n2){
    short resta, suma;
    suma = (short) (n1+n2);
    resta = (short) (n1-n2);
    if (n1>=n2){ 
        System.out.println("Valor de la Resta = "+ resta);
        System.out.println("Valor de la Suma =  "+ suma);
}
else{
            System.out.println("Valor de la Suma =  "+ suma);
}
}
}




