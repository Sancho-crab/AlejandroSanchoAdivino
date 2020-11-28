//Corregido por Luisa
package com.proyectocolab.alejandrosanchoadivino;

import java.util.Scanner;

public class Aciertos {

    public static void main(String[] args) {
        int n = 0,cont = 0;
        //Limitando el valor random a entre 10 y 50
        //int x = (int)((Math.random()*(50-10))+10); //Luisa: este Math Random solo te cuenta del 10 al 49, faltaría el 50
        int x = (int)((Math.random()*(50-10)+1)+10); //Luisa: esta sería una opcion correcta o tambíen pordría ser (Math.random()*41+10);
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.println("Te pasaste Amigo");
            } else if (n < x){
                System.out.println("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
        
        /*for(int i=1 ; i<=100; i++) // Luisa: esto lo he usado para comprobar que sea correcto.
        {
        	int x = (int) (Math.random()*(50-10)+1)+10);
        	System.out.println(x);
        } */
    }
}
