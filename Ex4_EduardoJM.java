package lista2_2bim;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author user
 */

public class Ex4_EduardoJM {
    
    public static void main(String[] args) {
       
        int vetor[] = new int [5];
        
        Random r = new Random();
        
        for (int i=0; i < vetor.length; i++){
            vetor[i] = r.nextInt(1, 10);
        }
        
        
        System.out.println("VALORES DO VETOR: ");
        for (int i=0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        
        ordena_vetor(vetor);
        
        System.out.println("\n");
        System.out.println("\nVALORES DO VETOR ORDENADOS: ");
        for (int i=0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        
        System.out.println("\n");
        
    }
    
    public static void ordena_vetor(int vetor[]){
        Arrays.sort(vetor);
    }
    
}
