package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis

        int numSequencia, primeiro, i = 1, numero = 0;

        System.out.print("Quantos números deseja inserir: ");
        numSequencia = input.nextInt();

        System.out.print("Introduza um número: ");
        primeiro = input.nextInt();

        boolean crescente = true;

        while (i < numSequencia) {
            System.out.print("Introduza um número: ");
            numero = input.nextInt();

            primeiro = numero;
            i++;
        }

        if (numero <= primeiro) {
            crescente = true;
        }

    if (crescente) {
            System.out.println("Crescente");
        }

        else {
            System.out.println("Não crescente");
        }
    }
}
