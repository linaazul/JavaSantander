package FundamentosJava;

import java.util.Scanner;

public class Exercicio1 {
    // 1. Escreva um código que receba o nome e o ano de nascimento de alguém e imprima
    // na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        String name = scan.next();
        System.out.println("Informe seu ano de nascimento:");
        int birthYear = scan.nextInt();
        int age = 2025 - birthYear;
        System.out.println("Olá, "+name+", você tem "+age+" anos!");
    }

}
