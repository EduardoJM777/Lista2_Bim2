package lista2_2bim;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class Ex10_EduardoJM {
    
    public static void main(String[] args) {
        
        String matrizNomes[][] = {{"Ana Maria Silva"		,"54830271"},
                                  {"João Pedro Oliveira"	,"97342658"},
                                  {"Maria Clara Santos"		,"10284963"},
                                  {"Lucas Henrique Costa"	,"65192037"},
                                  {"Laura Beatriz Pereira"	,"28416739"},
                                  {"Rafael Augusto Lima"        ,"80739512"},
                                  {"Gabriela Souza Almeida"	,"16348290"},
                                  {"Carlos Eduardo Martins"	,"42906185"},
                                  {"Beatriz Ferreira Rocha"	,"59027461"},
                                  {"Pedro Lucas Albuquerque"	,"75803924"}};
        String nome;
        
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite um nome: ");
        nome = s.next();
        
        String[][] filtrados = busca_aluno(matrizNomes, nome);
        
        if(filtrados.length > 0){
            for (int i=0; i < filtrados.length; i++){
                System.out.println("Nome: " + filtrados[i][0] + " RA: " + 
                                    filtrados[i][1]);
            }
        }
        
    }
    
    public static String[][] busca_aluno(String[][] matrizNomes, String nome){
        
        int count=0;
        for (int i=0; i < matrizNomes.length; i++){
            if (matrizNomes[i][0].toLowerCase().contains(nome.toLowerCase())){
                count++;
            }
        }
        String alunos[][]  = new String [count][2] ;
        
        int j=0;
        for (int i=0; i < matrizNomes.length; i++){
            if (matrizNomes[i][0].toLowerCase().contains(nome.toLowerCase())){
                alunos[j]=matrizNomes[i];
                j++;
            }
        }
        return alunos;
    }
   
    
}
