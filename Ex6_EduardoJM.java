package lista2_2bim;

import java.util.Random;

/**
 *
 * @author user
 */

public class Ex6_EduardoJM {
    
    public static void main(String[] args) {
        
        int aux[] = new int [2];
        int matriz[][] = new int [2][2];
        
        Random r = new Random();
        
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz.length; j++){
                matriz[i][j] = r.nextInt(1, 20);
            }
        }
        
        System.out.println("VALORES DA MATRIZ: ");
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        somaColunasMatriz(matriz, aux);
       
    }
    
    public static void somaColunasMatriz(int matriz[][], int aux[]){
    
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz.length; j++){
                aux[i] = aux[i] + matriz[j][i];
            }
        }
        
        for (int i=0; i < matriz.length; i++){
            System.out.println("Soma da Coluna " + (i+1) + ": " + aux[i]);
        }
        
    }
    
}
