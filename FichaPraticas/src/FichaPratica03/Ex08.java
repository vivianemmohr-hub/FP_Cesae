package FichaPratica03;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, sub, adi;

        System.out.print("Introduza um número inteiro: ");
        numero = input.nextInt();

        sub = numero - 5;
        adi = numero + 5;

        // Imprimir os 5 números anteriores
        while (sub < numero) {
            System.out.println(sub);
            sub++;

        }
            // Imprimir os 5 números posteriores
        numero++;

        while (numero <= adi) {
            System.out.println(numero);
            numero++;
        }

    }
}