package FichaPratica02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Introduza um número: ");
        num = input.nextInt();

        if (num / 2) {
            System.out.print("Número par");
        }
        else {
            System.out.print("Número ímpar");
        }
    }
}
