/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojava2021;

import java.util.Scanner;
/**
 *
 * @author Marco
 */
public class EjemploJava2021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("¿Cuanto la diagonal menor de tu rombo?");
        System.out.println("");
        Scanner entrada = new Scanner(System.in);
        int base = entrada.nextInt();

        if(base % 2 == 0){
            System.out.println("La base del triángulo debe ser impar, vuelve a introducirla:");
            base = entrada.nextInt();
        }

        int espacio = base/2;
        int altura;
        int rellenable = 0;

        for(altura = 0;base >= -1;altura++){
        
            base-=2;
        }
     
        for(int j = 1;altura > j;j++){
            System.out.println();

            for(int k = 0;k < (espacio-(rellenable/2));k++){
                System.out.print(" ");
            }
        
            for(int l = 0;l <= rellenable; l++){
                System.out.print("#");
            }

            for(int m = 0;m < (espacio-(rellenable/2));m++){
                System.out.print(" ");
            }
            
            rellenable += 2;
        }

        rellenable-=4;
     
        for(int j = 1;altura > j;j++){
            System.out.println();

            for(int k = 0;k < (espacio-(rellenable/2));k++){
                System.out.print(" ");
            }
        
            for(int l = 0;l <= rellenable; l++){
                System.out.print("#");
            }

            for(int m = 0;m < (espacio-(rellenable/2));m++){
                System.out.print(" ");
            }
            
            rellenable -= 2;
        }
        
    }
    
}

