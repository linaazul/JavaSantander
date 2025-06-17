package FundamentosJava;

import java.util.Scanner;

public class Exercicio2 {
    // 2.Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e
    // exiba na tela
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o lado do quadrado: ");
        int lado = scan.nextInt();
        int area = lado * lado;
        System.out.println("A área do quadrado é: "+area);

    }
}
