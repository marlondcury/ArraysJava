import java.util.Scanner;

//Faça um Programa que leia 20 números inteiros e armazene-os num vetor.
//Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.
public class ExercicioArray5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[3];
        int[] pares = new int[3];
        int[] impares = new int[3];
        int contadorPar = 0;
        int contadorImpar = 0;


        for(int i = 0; i < numeros.length; i++){
            System.out.println("Entre com um numero inteiro: ");
            numeros[i] = input.nextInt();
            if(numeros[i] %2 == 0){
                pares[contadorPar] = numeros[i];
                contadorPar++;
            }
            else{
                impares[contadorImpar] = numeros[i];
                contadorImpar++;
            }
        }
        System.out.println("vetor original:");
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.println("vetor par:");


        for(int i = 0; i < contadorPar; i++){
           System.out.print(pares[i] + " ");
        }
        System.out.println();

        System.out.println("vetor impar:");

            for(int i = 0; i < contadorImpar; i++){
            System.out.print(impares[i] + " ");
        }
        input.close();

    }
}
