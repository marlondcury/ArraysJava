import java.util.Scanner;

//Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
public class ExercicioArray4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] notas = new double[4];
        double media = 0;
        for (int i = 0; i < notas.length; i++ ) {
            System.out.println("Entre com a nota:");
            notas[i] = input.nextDouble();
            media += notas[i];
        }
        media = media / notas.length;
        for (double nota:notas) {
            System.out.println(" A nota é: "+ nota);

        }
        System.out.println("A media é: "+ media);
        input.close();
    }
}
