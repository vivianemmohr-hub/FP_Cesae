package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi, raio, area;

        System.out.print("Valor de pi: " );
        pi = input.nextDouble();

        System.out.print("Valor do raio: ");
        raio = input.nextDouble();

        area = pi * (raio * raio);

        System.out.println("Área da circunferencia: " + area);

    }
}
