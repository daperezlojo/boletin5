package boletin5_4;
import java.util.Scanner;
public class Persoa {
Scanner ler = new Scanner(System.in);
public String nome1, nome2;
public float peso1, peso2;
public Persoa(){
    
}

public Persoa(String nome1,String nome2,float peso1,float peso2){
    this.nome1 = nome1;
    this.peso1 = peso1;
    this.nome2 = nome2;
    this.peso2 = peso2;
}
 public void Comparativa(float peso1, float peso2 ){
     float dif1, dif2;
     dif1 = (float)(peso1-peso2);
     dif2 = (float)(peso2-peso1);
     if (peso1>peso2){
         System.out.println("Pesa máis "+   nome1+" con "+dif1+"kg de diferenza");
     }
     else{
         System.out.println("Pesa máis "+   nome2+" con "+dif2+"kg de diferenza");
     }
 }
    
}


