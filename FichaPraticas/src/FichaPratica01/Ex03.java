package FichaPratica01;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    // Criar variáveis

    int num1, num2, area, perimetro;

    // Ler valores do utilizador

        System.out.print("Insira a base: ");
        num1 = input.nextInt();

        System.out.print("Insira a altura: ");
        num2 = input.nextInt();

    // Calcular a area, perimetro

        area = num1 * num2;
        perimetro = num1 + num1 + num2 + num2;

    // Apresentar o resultado

        System.out.println("O resultado da area é: " + area);
        System.out.println("O resultado do perimetro é: " + perimetro);
}
}