package lista2_2bim;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class Ex7_EduardoJM {
    
    public static void main(String[] args) {
        
        String nome = "";
        
        retornaNome(nome);
        
    }
    
    public static void retornaNome(String nome){
        nome = "";
        Scanner s = new Scanner (System.in);
        
        while(nome.length() < 10){
            System.out.println("Informe um produto (min 10 caracteres): ");
            nome = s.next();
            if (nome.length() < 10){
                System.out.println("Nome deve conter ao menos 10 caracteres!");
            }
        }
        
        System.out.println("\nPRODUTO VÁLIDO: " + nome);
        
    }
    
}
