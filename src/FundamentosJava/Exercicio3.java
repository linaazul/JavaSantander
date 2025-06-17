package FundamentosJava;

import java.util.Scanner;

public class Exercicio3 {
    // Escreva um código que receba a base e a altura de um retângulo, calcule sua área e
    // exiba na tela
    // fórmula: área=base X altura
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a base do retângulo: ");
        int base = scan.nextInt();
        System.out.println("Informe a altura do retângulo: ");
        int altura = scan.nextInt();
        int area = base * altura;
        System.out.println("A área do retângulo é: " +area);
    }
}
