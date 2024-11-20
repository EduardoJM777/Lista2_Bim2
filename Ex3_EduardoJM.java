package lista2_2bim;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class Ex3_EduardoJM {
    
    public static void main(String[] args) {
        
        String matriz[][] = new String [2][2];
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite 4 Strings: ");
        
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz.length; j++){
                matriz[i][j] = s.next();
            }
        }
        
        System.out.println("\n");
        
        imprime_vetor_string(matriz);
        
    }
    
    public static void imprime_vetor_string(String matriz[][]){
        
        System.out.println("IMPRESSÃO DA MATRIZ: ");
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
    
}
