import java.util.*;
/**
 * Programa para sumar tres enteros.
 * 
 * @author (Juan León-Leonardo Sotelo) 
 * 
 */
public class Suma_3_Enteros
{
    public static void main(String[] args) 
    {
       int Primer_número;
       int Segundo_número;
       int Tercer_número;
       int Suma_total;
    
          Scanner teclado = new Scanner (System.in);
    
       System.out.print( "Primer número :" );    
       Primer_número= teclado.nextInt();
       System.out.print("Segundo número :" );
       Segundo_número = teclado.nextInt ();
       System.out.print("Tercer número :" );
       Tercer_número = teclado.nextInt ();
       Suma_total = Primer_número + Segundo_número + Tercer_número;
       System.out.println("Suma" + Suma_total);
   
    
    }
} 