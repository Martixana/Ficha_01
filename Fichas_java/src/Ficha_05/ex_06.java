package Ficha_05;

import java.util.Scanner;
public class ex_06 {
    public static void main (String[] args){

     //Importar o Scanner
     Scanner input = new Scanner (System.in);

     // Declarar variáveis
        double [] vetor = new double [10];

      //Ler o vetor
        for( int i = 0; i < vetor.length; i++){
            System.out.print ("Insira um número no vetor["+i+"]: ");
      //Guardar i
            vetor[i] = input.nextDouble();
        }
    }
}
