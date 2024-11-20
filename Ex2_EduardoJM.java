package lista2_2bim;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class Ex2_EduardoJM {
    
    public static void main(String[] args) {
       
        int vetor[] = new int [3];
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite 3 valores: ");
        
        for (int i=0; i < vetor.length; i++){
            vetor[i] = s.nextInt();
        }
        
        imprime_vetor_int(vetor);
        
    }
    
    public static void imprime_vetor_int(int vetor[]){
        
        System.out.println("\nIMPRESSÃO DO VETOR: ");
        for (int i=0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        
    }
    
}
