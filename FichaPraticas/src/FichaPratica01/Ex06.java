package FichaPratica01;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        // Atribuir valores as variáveis

        System.out.print("Valor 1: ");
        valor1 = input.nextInt();

        System.out.print("Valor 2: ");
        valor2 = input.nextInt();

        valor1 = valor1+valor2;
        valor2=valor1-valor2;
        valor1=valor1-valor2;

        System.out.println("\nValor1: " + valor1);
        System.out.println("Valor2: " + valor2);





    }
}
