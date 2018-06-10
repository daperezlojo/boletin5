package boletin5_6;

public class Artigos {

public String nome;
public int ventas;

public Artigos(){
    
}
public Artigos(String nom, int vent){
    nom = nome;
    vent = ventas;
}
public void condicion(int ventas){
    
    if(ventas<=100)
        System.out.println("É un artigo de consumo baixo");
    
    else if(ventas<=500)
        System.out.println("É un artigo de consumo medio");
    
    else if(ventas<=1000)
        System.out.println("É un artigo de consumo alto");
    
    else if(ventas>1000)
        System.out.println("É un artigo de primeira necesidade");
    }
    
}


