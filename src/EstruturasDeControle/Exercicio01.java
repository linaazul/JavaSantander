package EstruturasDeControle;

import java.util.Scanner;

public class Exercicio01 {
    // 01. Escreva um código onde o usuário entra com um número e seja gerada a tabuada
    // de 1 até 10 desse número;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva um número inteiro:");
        int num = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }
}
