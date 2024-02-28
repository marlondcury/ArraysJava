import java.util.Scanner;

/*
Em uma competição de salto em distância cada atleta tem direito a cinco saltos.
O resultado do atleta será determinado pela média dos cinco valores restantes.
Você deve fazer um programa que receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos e depois informe o nome, os saltos e a média dos saltos.
O programa deve ser encerrado quando não for informado o nome do atleta.

 */
public class ExercicioArray15 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            double soma = 0;
            double media;
            System.out.print("Digite o nome do atleta (ou pressione Enter para sair): ");
            double[] saltos = new double[5];
            String nomeAtleta = input.nextLine();
            // Verifica se o usuário deseja sair
            if (nomeAtleta.isEmpty()) {
                break;
            }

            for (int i = 0; i < saltos.length; i++) {
                System.out.println("Digite a distancia do salto:" + (i+1));
                saltos[i] = input.nextDouble();
                soma +=saltos[i];
            }
            media = soma/saltos.length;

            System.out.println("Nome do atleta: " + nomeAtleta);
            System.out.println("media do atleta: " + media);
            System.out.print("Saltos: ");
            for (double salto : saltos) {
                System.out.print(salto + " ");
            }
            System.out.println();
            input.nextLine();
        }
    }

}

