package FichaPratica02;

import javax.swing.*;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        System.out.print("Introduza um número: ");
        num2 = input.nextInt();

        if (num1 > num2){
            System.out.print("Maior: " + num1);
        }
        else {
            System.out.print("Maior: " + num2);
        }
        }
    }

