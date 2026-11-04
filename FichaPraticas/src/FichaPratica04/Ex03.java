package FichaPratica04;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variáveis

        int numero;

        System.out.println("Insira um número: ");
        numero = input.nextInt();

        //Apresentar os divisores
        for (int div = 1; div <=numero ; div++) {
            if(numero%div==0){
                System.out.println(div);
            }
        }
    }
}
