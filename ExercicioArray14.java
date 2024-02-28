/*Faça um programa que leia um número indeterminado de valores, correspondentes a notas,
        encerrando a entrada de dados quando for informado um valor igual a -1 (que não deve ser armazenado). Após esta entrada de dados, faça:

        Mostre a quantidade de valores que foram lidos;
        Exiba todos os valores na ordem em que foram informados, um ao lado do outro;
        Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;
        Calcule e mostre a soma dos valores;
        Calcule e mostre a média dos valores;
        Calcule e mostre a quantidade de valores acima da média calculada;
        Calcule e mostre a quantidade de valores abaixo de sete;
        Encerre o programa com uma mensagem; */

import java.util.Scanner;

public class ExercicioArray14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] valores = new double[100];

        double nota;
        int contador = 0;
        double soma = 0;
        int contadorMedia = 0;
        int contadorAbaixo7 = 0;
        while (true) {
            System.out.println("Entre com as notas");
            nota = input.nextDouble();
            if (nota == -1)
                break;
            valores[contador] = nota;
            contador++;
            soma += nota;


        }


        System.out.print("Valores na ordem em que foram informados: ");
        for (int i = 0; i < contador; i++) {
            System.out.print(valores[i] + " ");
        }

        for( int i = contador; i >=0; i--){
            System.out.println(valores[i]);
        }

        System.out.println("Foram inseridos " + contador + " notas");
        System.out.println("A soma foi de: " + soma);
        double media = soma/contador;
        System.out.println("A media foi de: " + media);

        for( int i =0; i < contador; i++){
            if( valores[i] > media){
                contadorMedia++;
            }
        }
        System.out.println("A quantidade de valores acima da media é de: " + contadorMedia);

        for( int i =0; i < contador; i++){
            if(valores[i] < 7){
                contadorAbaixo7++;
            }
        }
        System.out.println("A quantidade de valores abaixo de 7 é de " + contadorAbaixo7);
        System.out.println("Fim do programa");
        input.close();
    }

}
