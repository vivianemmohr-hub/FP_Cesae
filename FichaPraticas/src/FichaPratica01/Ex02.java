package FichaPratica01;

import java.util.Scanner;

public class Ex02 {public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // Criar variáveis
    int num1, num2, soma, subtracao, multiplicacao, divisao;

    // Ler valores do utilizador
    System.out.print("Insira um número: ");
    num1 = input.nextInt();

    System.out.print("Insira um número: ");
    num2 = input.nextInt();

    // Calcular a soma, subtracao, multiplicacao, divisao

    soma = num1 + num2;
    subtracao = num1 - num2;
    multiplicacao = num1 * num2;
    divisao = num1 / num2;


    // Apresentar o resultado

    System.out.println("O resultado da soma é: " + soma);
    System.out.println("O resultado da subtracao é: " + subtracao);
    System.out.println("O resultado da multiplicacao é: " + multiplicacao);
    System.out.println("O resultado da divisao é: " + divisao);
}
}
