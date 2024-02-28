import java.util.Scanner;

/* Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de 20 elementos,
 cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores.
 */
public class ExercicioArray10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] vetorA = new double[10];
        double[] vetorB = new double[10];
        double[] vetorC = new double[20];

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com um numero:");
            vetorA[i] = input.nextDouble();
        }

        for(int i = 0; i < vetorB.length; i++){
            System.out.println("Entre com um numero:");
            vetorB[i] = input.nextDouble();
        }
        int index = 0;

        for(int i = 0; i < 10; i++){
            vetorC[index++] = vetorA[i];
            vetorC[index++] = vetorB[i];
        }

        for(int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
        input.close();
    }
}
