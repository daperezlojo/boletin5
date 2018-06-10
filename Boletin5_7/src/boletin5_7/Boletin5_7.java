
package boletin5_7;


import java.util.Scanner;


public class Boletin5_7 {

    
    public static void main(String[] args) {
        
    Scanner ler=new Scanner(System.in);
    final double PI=3.14;
    
    
    System.out.println("Pulse 1 para calcular a superficie do cadrado");
    System.out.println("Pulse 2 para calcular a superficie do triángulo"); 
    System.out.println("Pulse 3 para calcular a superficie do círculo"); 
    int num=ler.nextInt();
    
    Variables var1=new Variables();
  
    switch(num) { 
        
        case 1: System.out.println("Introduce valor do lado: ");
        int lado=ler.nextInt();
        System.out.println("A superficie do cadrado é "+ (lado*lado));
        break;
        
        case 2: System.out.println("Introduce valor da base: ");
        int base=ler.nextInt();
        System.out.println("Introduce valor da altura: ");
        int altura=ler.nextInt();
        System.out.println("A superficie do triángulo é "+ (base*altura/2));
        break;
        
        case 3: System.out.println("Introduce valor do radio: ");
        double radio=ler.nextDouble();
        System.out.println("A superficie do círculo é "+ (PI*Math.pow(radio, 2)));
        break;
        default: System.out.println("Opción incorrecta");
    }
       
  }
    
}