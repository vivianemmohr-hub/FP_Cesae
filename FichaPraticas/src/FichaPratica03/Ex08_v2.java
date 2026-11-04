package FichaPratica03;

import java.util.Scanner;

public class Ex08_v2 {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int numero, sub, adi;

    System.out.print("Introduza um número inteiro: ");
    numero = input.nextInt();

    sub = numero - 5;
    adi = numero + 5;

    while (sub <= adi) {

        if (sub != numero) {
            System.out.println(sub);
        }
        sub++;
    }
}
}
