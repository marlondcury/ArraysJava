import java.util.Scanner;

//Faça um Programa que leia um vetor de 5 números inteiros,
// mostre a soma, a multiplicação e os números.
public class ExercicioArray6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] numeros = new int[5];
        int soma = 0;
        int mult = 1;
        for( int i = 0; i < numeros.length; i++){
            System.out.println("Entre com um numero inteiro: ");
            numeros[i] = input.nextInt();
            soma += numeros[i];
            mult *= numeros[i];
        }

        for( int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.println(soma);
        System.out.println(mult);
        input.close();
    }
}
