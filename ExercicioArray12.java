import java.util.Scanner;

/*Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista.
Após isto, calcule a média anual das temperaturas e mostre todas as temperaturas acima da média anual,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ). */
public class ExercicioArray12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] mediaTemp = new double[12];
        double soma = 0;
        double mediaAnual = 0;
        int i;
        for(i =0; i < 12; i++){
            System.out.println("Entre com a temperatura mensal do mes: " + (i+1));
            mediaTemp[i] = input.nextDouble();
            soma += mediaTemp[i];
            mediaAnual = soma/3;
        }
        for(i =0; i <12; i++){
            if(mediaTemp[i] > mediaAnual){
             switch (i){
                 case 0:
                     System.out.println("Temperatura de janeiro maior que a atual");
                     break;
                 case 1:
                     System.out.println("Temperatura de fevereiro maior que a atual");
                     break;
                 case 2:
                     System.out.println("Temperatura de março maior que a atual");
                     break;
                 case 3:
                     System.out.println("Temperatura de abril maior que a atual");
                     break;
                 case 4:
                     System.out.println("Temperatura de maio maior que a atual");
                     break;
                 case 5:
                     System.out.println("Temperatura de junho maior que a atual");
                     break;
                 case 6:
                     System.out.println("Temperatura de julho maior que a atual");
                     break;
                 case 7:
                     System.out.println("Temperatura de agosto maior que a atual");
                     break;
                 case 8:
                     System.out.println("Temperatura de setembro maior que a atual");
                     break;
                 case 9:
                     System.out.println("Temperatura de outubro maior que a atual");
                     break;
                 case 10:
                     System.out.println("Temperatura de novembro maior que a atual");
                     break;
                 case 11:
                     System.out.println("Temperatura de dezembro maior que a atual");
                     break;
             }

            }
        }
        System.out.println(mediaAnual);
        input.close();

    }
}
