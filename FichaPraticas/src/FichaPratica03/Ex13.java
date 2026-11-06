package FichaPratica03;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inicio, fim;

// Ler valores

        System.out.println("Número de início: ");
        inicio = input.nextInt();

        System.out.println("Número de fim: ");
        fim = input.nextInt();

        while (inicio <= fim) {

            if (inicio % 5 == 0) {
                System.out.println(inicio);
            }

            inicio++;
        }
    }
}

