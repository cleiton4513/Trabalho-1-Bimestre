package com.mycompany.trabalhoordenacao;

import java.util.Scanner;

public class TrabalhoOrdenacao {

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Insira o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        
        int[] vetor = new int[tamanho];
        
        System.out.println("Insira os valores do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Vetor[" + (i) + "]: ");
            vetor[i] = scanner.nextInt();
        }
      
        System.out.println("""
                           Informe como deseja ordenar seu vator:
                           1 = Insercao
                           2 = Selecao
                           3 = Bolha""");                           
        int ordenacao = scanner.nextInt(); 
        int inicio; 
        int j;
        
        
        switch (ordenacao) {
            case 1 ->                 {
                    for(int v = 1; v < vetor.length; v++){
                        inicio = vetor[v];
                        
                        for(j = v - 1;
                                (j >= 0 && vetor[j] > inicio); j--){
                            
                            vetor[j+1] = vetor[j];
                        }
                        vetor[j+1] = inicio;
                    }       String msg = "";
                    for(int v = 0; v < vetor.length; v++){
                        msg += vetor[v];
                        if(v < vetor.length-1)
                            msg += "]-[";
                    }
                    System.out.println(
                    "Seu metodo de ORDENACAO escolhido foi INSERCAO =["+msg+"]");
                }
            case 2 ->                 {
                    for(int v = 0; v < vetor.length; v++){
                        int posicaoMenor = v;
                        
                        for(int s = v+1; s < vetor.length; s++){
                            if(vetor[s] < vetor[posicaoMenor]){
                                posicaoMenor = s;
                            }
                        }
                        
                        if(posicaoMenor != v){
                            int aux = vetor[v];
                            vetor[v] = vetor[posicaoMenor];
                            vetor[posicaoMenor] = aux;
                        }
                        
                    }       String msg = "";
                    for(int v = 0; v < vetor.length; v++){
                        msg += vetor[v];
                        if(v < vetor.length - 1){
                            msg += "]-[";
                        }
                    }       
                    System.out.println(
                    "Seu metodo de ORDENACAO escolhido foi SELECAO =["+msg+"]");
                }
            case 3 ->                 {
                    boolean houveTroca = true;
                    while(houveTroca){
                        houveTroca = false;
                        
                        for(int v = 0; v < vetor.length - 1; v++){
                            
                            if(vetor[v] > vetor[v+1]){
                                int aux = vetor[v];
                                vetor[v] = vetor[v+1];
                                vetor[v+1] = aux;
                                houveTroca = true;
                            }
                        }
                    }       String msg = "";
                    for(int v = 0; v < vetor.length; v++){
                        msg += vetor[v];
                        if(v < vetor.length - 1){
                            msg += "]-[";
                        }
                    }   
                    System.out.println(
                    "Seu metodo de ORDENACAO escolhido foi BOLHA =["+msg+"]");
                }
            default -> {
            }
        }
    }
}
  
    
