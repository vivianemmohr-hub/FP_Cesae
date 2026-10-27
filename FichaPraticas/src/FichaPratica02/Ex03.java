package FichaPratica02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Criar variáveis

        double salario, taxa;

        System.out.print("Insira o salário anual: ");
        salario = input.nextDouble();

        // Calcular Taxa 20%

        if (salario <= 15000) {
            taxa = salario * 0.2;
            System.out.print("Taxa 20%: " + taxa + " €");
        }

    // Calcular Taxa 30%

        if (salario > 15000 && salario <=20000) {
    taxa = salario * 0.3;
        System.out.print("Taxa 30%: " + taxa + " €");

    }
        //Calcular Taxa 35%

    if (salario > 20000 && salario <=25000) {
        taxa = salario * 0.35;
     System.out.print("Taxa 35%: " + taxa + " €");

}
        //Calcular Taxa 40%

if (salario > 25000) {
    taxa = salario * 0.4;
    System.out.print("Taxa 40%: " + taxa + " €");
}
    }
}