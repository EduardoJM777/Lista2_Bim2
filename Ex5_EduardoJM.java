package lista2_2bim;

import java.util.Scanner;

/**Crie uma função que receba uma matriz e escreva na tela a soma de cada linha da mesma.
 *
 * @author 60003233
 */

public class Ex5_EduardoJM {
    
    public static void main(String[] args) {
        
        int aux[] = new int [2];
        int matriz [][] = new int [2][2];
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite 4 valores: ");
        
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz.length; j++){
                matriz[i][j] = s.nextInt();
            }
        }
        
        
        System.out.println("\nVALORES DA MATRIZ: ");
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        somaLinhasMatriz(matriz, aux);
          
    }
    
    public static void somaLinhasMatriz(int matriz[][], int aux[]){
    
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz.length; j++){
                aux[j] = aux[j] + matriz[j][i];
            }
        }
        
        
        for (int i=0; i < matriz.length; i++){
             System.out.println("Soma da linha " + (i+1) + ": " + aux[i]);
        }
        
    }
    
}
