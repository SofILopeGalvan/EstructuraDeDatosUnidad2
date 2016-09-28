/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

import java.util.Scanner;

/**
 *
 * @author sofilop
 */
public class Burbuja {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
          Scanner leer2=new Scanner(System.in);
        int tam;
        System.out.println("Ingrese el tamañ del arreglo");
        tam=leer.nextInt();
        String [] arreglo=new String [tam];
        for (int i = 0; i <arreglo.length; i++) {
            System.out.println("Ingresa el texto ["+i +"]:");
            arreglo[i]=leer2.nextLine();
            
        }
        // imprimir desordordenado 
            for (int i = 0; i <arreglo.length; i++) {
            System.out.println("arreglo ["+i +"]:"+arreglo[i]);
        
            
        }
            System.out.println("Desordenados");
            String aux;
                for (int i = 1; i <arreglo.length; i++) {
                    for (int j = 0; j <arreglo.length-1; j++) {
                        
                        if (arreglo[j].compareTo(arreglo[j+1])>0){
                            aux=arreglo[j];
                            arreglo[j]=arreglo[j+1];
                            arreglo[j+1]=aux;
                        }else{
                            break;
                        }
                    }
        }
                
                // imprimir ordenados 
                System.out.println("Ordenados ");
            for (int i = 0; i <arreglo.length; i++) {
            System.out.println("arreglo ["+i +"]:"+arreglo[i]);
        
            
        }
    }
    
}
