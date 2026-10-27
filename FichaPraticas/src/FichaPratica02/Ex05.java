package FichaPratica02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int valor1, valor2;

        System.out.print("Introduza um número: ");
        valor1 = input.nextInt();

        System.out.print("Introduza um número: ");
        valor2 = input.nextInt();

        if (valor1 > valor2){
            System.out.print(valor2+" "+valor1);
        }

        else {
            System.out.print(valor1+" "+valor2);
        }
    }
}
