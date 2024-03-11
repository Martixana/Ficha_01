package Ficha_05;

import java.util.Scanner;

public class Ex_07 {
}
import java.util.Scanner;
public class ex_07 {
    public static void main (String[] args){

        //Importar o Scanner
        Scanner input = new Scanner(System.in);

     //Declarar variáveis
     int[] vetor = new int [10];
     int maior_par;

     //cycle through to add numbers to array and save
     for(int i = 0; i <  vetor.length; i++){
     System.out.print(" Insira um número no vetor ["+i+"]:");
     vetor[i] = input.nextInt();
     }
     System.out.println(vetor[i]);

     //find largest even number
        //while you cycle through this:
        for(int i = 1; i < vetor.length; i++){
            //find the numbers that are both even and larger than the last number in the cycle
            if(vetor[i] % 2 == 0 && vetor[i] > i-1){
                maior_par = vetor[i];
                System.out.println("O maior par é: " + " " + maior_par);
            }
            else{
                System.out.print("Não existe número par neste array.");
            }

        }

    }
