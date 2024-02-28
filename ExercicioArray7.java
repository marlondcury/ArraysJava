/*Faça um Programa que peça as quatro notas de 10 alunos,
// calcule e armazene num vetor a média de cada aluno,
imprima o número de alunos com média maior ou igual a 7.0.*/

import java.util.Scanner;

public class ExercicioArray7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[][] notasAlunos = new double[2][4];
        double [] soma = new double[2];
        double media = 0;
        int count = 0;
        for(int i = 0; i < notasAlunos.length; i++){
            for(int j = 0; j < notasAlunos[i].length; j++){
                System.out.println("Entre com a nota: " + (j +1) + " do aluno " + (i+1));
                notasAlunos[i][j] = input.nextDouble();
                soma[i] += notasAlunos[i][j];
            }
        }

        for( int i = 0; i < soma.length; i++){
            System.out.println(soma[i]);
            media = soma[i]/ notasAlunos[i].length;
            if( media >=7){
                count++;
            }
        }

        System.out.println(" A quantidade de alunos com notas maiores ou iguais a 7 é de: "+ count);
        input.close();

    }
}
