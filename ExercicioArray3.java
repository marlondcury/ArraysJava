import java.util.Scanner;

//Números Aleatórios: Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
// Ao final, mostre os números e seus sucessores.
public class ExercicioArray3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] vetorAleatorio = new int[3];
        int sucessor = 0;
        for(int i = 0; i < vetorAleatorio.length; i++){
            vetorAleatorio[i] = (int) (Math.random() * 100);
        }

        for(int i = 0; i < vetorAleatorio.length; i++){
            System.out.println(vetorAleatorio[i]);
            sucessor = vetorAleatorio[i] + 1;
            System.out.println(sucessor);
        }

    }
}
