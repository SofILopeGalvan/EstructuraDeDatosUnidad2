/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tanques;

/**
 *
 * @author sofilop
 */
public class Tanques {

 public static String  mostarDatos(){
int datos[][]={{25,20,20,50,50,30},
               {20,15,15,90,80,90},
               {15,10,10,40,30,40}};

     String res="";

     for (int i = 0; i <= 2; i++) {
         for (int j = 0; j <=5; j++) {
             res=res+datos[i][j]+" ";
         }
         res=res+"\n";
     }

     
     return res;
     
 }
    
 //Suma filas 
 public static String sumaFila(){
   int  mat[][]={{25,20,20,50,50,30},
               {20,15,15,90,80,90},
               {15,10,10,40,30,40}};
      double sum=0;
      String result="";
      
        for (int fila = 0; fila <mat.length; fila++) {
             sum=0;
                for (int  columnoa = 0; columnoa < mat[fila].length; columnoa++) {
                   
            sum=sum+mat[fila][columnoa];
             // result=result+sum+" portetil  ";
            }
                
        result=result+sum+"\n";
        }
        
return result;
    }
 

        

 ////

 public static String  Columans (){
int datos[][]={{25,20,20,50,50,30},
               {20,15,15,90,80,90},
               {15,10,10,40,30,40}};

     String res="";
int total=0;
     for (int i = 0; i <= 5; i++) {
         total=0;
         for (int j = 0; j <=2; j++) {
             total=total+datos[j][i];
             
         }
         res=res+total+"  ";
     }

     
     return res;
     
 }
}
