package lista2_2bim;

import java.util.Scanner;

/**
 *
 * @author 60003233
 */

public class Ex1_EduardoJM {
    
    public static void main(String[] args) {
        
        double num1, num2;
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite o primeiro valor: ");
        num1 = s.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
        num2 = s.nextDouble();
        
        System.out.println("Resultado da divisão: " + divisao(num1, num2));
        
    }
    
    public static double divisao(double n1,double n2){
        if (n2 == 0){
            return 0;
        } else {
            return n1/n2;
        }
    }
    
}
