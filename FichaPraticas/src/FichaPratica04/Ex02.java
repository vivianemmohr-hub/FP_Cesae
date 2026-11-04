package FichaPratica04;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        int i, somatorio = 0;

        for (i = 11; i <= 51; i = i + 2) {
            System.out.println(i);

            somatorio = somatorio + i;
            System.out.println("Somatório: " + somatorio);
        }
    }
}
