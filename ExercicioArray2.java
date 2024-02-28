import java.util.Scanner;

/*Consoantes: Faça um Programa que leia um vetor de 6 caracteres,  e diga quantas consoantes
foram lidas. Imprima as consoantes.*/
public class ExercicioArray2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = 0;
        char[] vetor = new char[3];
        String caracter = "";
        for (int i = 0; i < vetor.length; i++)  {
            System.out.println("Entre com o caracter:");
            vetor[i] = input.next().charAt(0);
        }
        int numeroConsoantes = 0;
        for (char caractere : vetor) {
            if ("aeiou".indexOf(caractere) == -1) {
                numeroConsoantes++;
                System.out.print(caractere + " ");
            }
        }
        System.out.println();
        System.out.println("Numero de consoantes: "+ numeroConsoantes);
        input.close();
    }
}
