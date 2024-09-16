/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosmultidimencionales;

/**
 *
 * @author Willi
 */
public class Arreglosmultidimencionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* TODO code application logic here
        int[][] numeros= new int[3][3];
        int i,j;//i= filas j=columnas
        //recorrer las filas
        for ( i = 0; i < numeros.length; i++) {
            System.out.println();
            //recorre columnas 
            for ( j = 0; j < numeros.length; j++) {
             //imprime el valor de la matriz en la posicion actual
                System.out.print(numeros[i][j]);
            }
        }*/
        int[][] matriz= new int[2][2];
        matriz [0][0]=1;
        matriz [0][1]=2;
        matriz [1][0]=3;
        matriz [1][1]=4;
        
        int filas,columnas;//i= filas j=columnas
        
        //recorrer filas
        for(filas=0;filas<matriz.length;filas++){
            System.out.println("");
            //recorrer columnas
            for(columnas=0; columnas<matriz.length;columnas++){
                System.out.print(matriz[filas][columnas]);
            }
        }
        
    }
    
}
