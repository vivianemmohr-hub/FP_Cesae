package FichaPratica03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int limite, numero = 1;
        String mensagem;

        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        // Limpar o buffer
        input.nextLine();

        System.out.print("Insira a mensagem: ");
        mensagem = input.nextLine();

        while (numero <= limite) {
            System.out.println(mensagem);
            numero = numero + 1;
        }
    }
}

