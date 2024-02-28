import java.util.Scanner;

//Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor.
// Imprima a idade e a altura na ordem inversa a ordem lida.
public class ExercicioArray8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final int numeroPessoas = 5;
        double[] altura = new double[numeroPessoas];
        double[] peso = new double[numeroPessoas];
        for( int i = 0; i <numeroPessoas; i++){
            System.out.println("Entre com a altura da pessoa " + (i+1));
            altura[i] = input.nextDouble();
            System.out.println("Entre com o peso da pessoa " + (i+1));
            peso[i] = input.nextDouble();
        }
        for( int i = 4 ; i >= 0; i--){
            System.out.println("A altura da pessoa "+ (i+1) + " é " + altura[i] + " e seu peso é: " + peso[i]);
            System.out.println();
        }
        input.close();
    }
}
