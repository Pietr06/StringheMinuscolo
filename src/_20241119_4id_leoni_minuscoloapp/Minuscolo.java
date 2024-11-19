/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _20241119_4id_leoni_minuscoloapp;
import java.util.Scanner;
/**
 *
 * @author ospite
 */
public class Minuscolo {
    static final int TANTI = 30;
    String parola;
    char[] arrayMin = new char[TANTI];
    
    public void Scan(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nInserisci una parola : ");
        parola = in.next();
        in.close();
    }
    
    public void Convert(){
            for (int x=0; x < parola.length(); x++)
                arrayMin[x]=parola.charAt(x);
    }
    
    public void ToLowercase(){
        for (int x=0; x < parola.length(); x++)
            arrayMin[x] = Character.toLowerCase(arrayMin[x]);
    }
    
    public void Print(){
        System.out.print("La parola in minuscolo (array) : ");
        for (int x=0; x < parola.length(); x++)
            System.out.print(arrayMin[x]);
        
        String stringMin= new String(arrayMin);
        System.out.print("\nLa parola in minuscolo (oggetto): ");
        System.out.println(stringMin);
    }
    
    
}
