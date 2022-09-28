/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author erick
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][]= new int [3][3];
        int cont = 1;
        
        for (int f = 0; f < 3; f++){
        for (int c = 0; c < 3; c++){
            matriz[f][c] = cont ++;
        }
    }
        
        for (int i = 0; i<3; i++  )
        {
            for (int j= 0; j < 3; j++)
            {
               System.out.print(("   "+ matriz[i][j]));
            }
            System.out.println(" ");
        }
        int diagonal1[]= new int [matriz.length];
        int diagonal2[]= new int [matriz.length];
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
              if(i == j){
                  diagonal1[i] = matriz[i][j];
              }
              if ( (1+j)==matriz.length-1){
                  diagonal2[i]= matriz[i][j];
              }
            }
        }
        int sumaD1 = 0;
        System.out.println("\nSumatoria diagonal 1:" );
        for(int elemento: diagonal1){
            System.out.print("\t" + elemento);
            sumaD1 = sumaD1+elemento;
        }
        System.out.print("= "+ sumaD1);
        System.out.println("");
        
        int sumaD2 = 0;
        System.out.println("\nSumatoria diagonal 2:" );
        for(int elemento: diagonal2){
            System.out.print("\t" + elemento);
            sumaD2 = sumaD2+elemento;
        }
        System.out.print("= "+ sumaD2);
        System.out.println("");
        
        int sumaTotal = 0;
        sumaTotal = sumaD1 + sumaD2;
        
       System.out.print("\nLa suma total de las diagonales es :" + sumaTotal);
            System.out.println("");    
    }
    
}
