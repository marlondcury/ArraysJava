import java.util.Scanner;

//Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
public class ExercicioArray1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] vetor = new double[5];
        for ( int i = 0; i <5; i++){
            System.out.println("Entre com o vetor:");
            vetor [i] = input.nextDouble();
        }
        for ( int i = 4; i >=0 ; i--){
            System.out.println(vetor[i]);
        }
        input.close();
    }
}