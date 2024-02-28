import java.util.Scanner;

//Faça um Programa que leia um vetor A com 10 números inteiros,
// calcule e mostre a soma dos quadrados dos elementos do vetor.
public class ExercicioArray9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        double quadrado = 0;

        for( int i =0; i < vetor.length; i++){
            System.out.println("Entre com um numero inteiro: ");
            vetor[i] = input.nextInt();
            quadrado += Math.pow(vetor[i],2);
        }
        System.out.println(quadrado);
        input.close();
    }

}
