package FichaPratica01;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, mediaAritmetica, mediaPonderada, mediaPonderadaFinal;

        System.out.print("Nota 1: ");
        nota1 = input.nextDouble();

        System.out.print("Nota 2: ");
        nota2 = input.nextDouble();

        System.out.print("Nota 3: ");
        nota3 = input.nextDouble();

        mediaAritmetica = (nota1 + nota2 + nota3) / 3;

        mediaPonderada = nota1 * 0.2 + nota2 * 0.3 + nota3 * 0.5;


        System.out.println("Media aritmetica das notas é: " + mediaAritmetica);
        System.out.println("Media ponderada: " + mediaPonderada);



    }
}
