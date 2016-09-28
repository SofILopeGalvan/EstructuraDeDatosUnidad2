/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaMinas;

import java.util.Scanner;

/**
 *
 * @author sofilop
 */
public class Buscaminas {

 
  
 public static String  mostarDatos(){
int datos[][]={{0,0,0,0,0},
               {0,0,0,0,0,},
               {0,0,0,0,0},
                {0,0,0,0,0},
               {0,0,0,0,0}};

     String res="";

     for (int i = 0; i <= 4; i++) {
         for (int j = 0; j <=4; j++) {
             res=res+datos[i][j]+" ";
         }
         res=res+"\n";
     }
     return res;
     
 }
 
 public static int[][] asiganacion(){
int datos[][]={{0,1,0,0,0},
               {0,0,0,0,1},
               {0,0,1,0,0},
               {0,1,0,0,0}, 
               {1,0,0,0,0}};

  
     return datos;
     
 }
    public static void main(String[] args) {
         
        System.out.println(""+mostarDatos());
        Scanner leer=new Scanner(System.in);
        int fila;
        int columna;
                int [][]juego;
        juego=asiganacion();
       int i;
        for ( i = 1; i <=5; i++) {
            
        System.out.print ("\t Ingrese La cordenada de x ");
        columna=leer.nextInt();
          System.out.print("\t Ingrese la cordenada de  y ");
        fila=leer.nextInt();
                if(juego[fila][columna]==0){
                    System.out.println( "\n **Continua as corrido con suerte ** \n");
                }else if(juego[fila][columna]==1){
                    System.out.println(" PERDEDOR ☻");
                    break;
                                    
                
            }
             if(i==5){
         System.out.println(" ► FELICIDADES AS GANADO !!! ");
    }
        }
      
    }
}
