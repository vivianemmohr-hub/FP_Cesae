package FichaPratica01;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

double produto1, produto2, produto3, valorTotal, valorDesconto;

        System.out.print("Valor produto 1: ");
        produto1 = input.nextDouble();

        System.out.print("Valor produto 2: ");
        produto2 = input.nextDouble();

        System.out.print("Valor produto 3: ");
        produto3 = input.nextDouble();

valorTotal = produto1 + produto2 + produto3;
valorDesconto = valorTotal*0.9;

        System.out.println("O valor total com desconto é de: " + valorDesconto);

    }




}
