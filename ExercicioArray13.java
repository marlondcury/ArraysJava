import java.util.Scanner;

/*Utilizando listas faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
 Caso contrário, ele será classificado como "Inocente".
 */
public class ExercicioArray13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] perguntas = new String[5];
        int count = 0;

        System.out.println("Telefonou para a vitima?");
        perguntas[0] = String.valueOf(input.next().charAt(0));
        if(perguntas[0].equalsIgnoreCase("s")){
                count++;
            }
        System.out.println("Esteve no local do crime?");
        perguntas[1] = String.valueOf(input.next().charAt(0));
        if(perguntas[1].equalsIgnoreCase("s")){
            count++;
            }

        System.out.println("Mora perto da vítima?");
        perguntas[2] = String.valueOf(input.next().charAt(0));
        if(perguntas[2].equalsIgnoreCase("s")){
            count++;
        }
        System.out.println("Devia para a vítima?");
        perguntas[3] = String.valueOf(input.next().charAt(0));
        if(perguntas[3].equalsIgnoreCase("s")){
            count++;
        }
        System.out.println("Esteve no local do crime?");
        perguntas[4] = String.valueOf(input.next().charAt(0));
        if(perguntas[4].equalsIgnoreCase("s")){
            count++;
        }

        System.out.println(count);
        switch (count){
            case 2:
                System.out.println("Suspeito");
                break;
            case 3:
            case 4:
                System.out.println("Cumplice");
                break;
            case 5:
                System.out.println("Assasino");
                break;
            default:
                System.out.println("Inocente");
        }
    input.close();

    }

}
