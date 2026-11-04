package FichaPratica03;

import java.util.Scanner;

public class Ex07parte2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = 1, somatorio = 0;

        while (numero <= 100) {
            System.out.println(numero);

            somatorio = somatorio + numero;
            numero = numero + 1;
        }
        System.out.println("Somatório: " + somatorio);
    }
}


