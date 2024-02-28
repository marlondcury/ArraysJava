import java.util.Scanner;

/*Foram anotadas as idades e alturas de 30 alunos.
// Faça um Programa que determine quantos alunos com mais de 13 anos possuem
altura inferior à média de altura desses alunos.*/
public class ExercicioArray11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final int qtdAlunos = 4;
        double[] altura = new double[qtdAlunos];
        double[] idade = new double[qtdAlunos];
        double soma = 0;
        double mediaAltura = 0;
        int count =0;
        for (int i = 0; i < qtdAlunos; i++){
            System.out.println("Entre com a idade do aluno " + (i+1));
            idade[i] = input.nextDouble();
            System.out.println("Entre com a altura do aluno " +(i+1) );
            altura[i] = input.nextDouble();
            soma += altura[i];
            mediaAltura = soma/qtdAlunos;
        }
        for (int i =0; i < qtdAlunos; i++){
            if( idade[i] > 13 && altura[i] < mediaAltura){
                count++;
            }
        }

        System.out.println("A quantidade de alunos que possui  mais de 13 anos e altura inferior à média de " +
                "altura desses alunos é: " + count);
        input.close();

    }
}
