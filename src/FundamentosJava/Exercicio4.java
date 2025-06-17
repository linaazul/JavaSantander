package FundamentosJava;

import java.util.Scanner;

public class Exercicio4 {
    // 4. Escreva um código que receba o nome e a idade de 2 pessoas e imprima
    // a diferença de idade entre elas
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o seu nome e o de um amigo:");
        String name = scan.next();
        String friendsName = scan.next();
        System.out.println("Agora informe a sua idade primeiro depois a idade dele:");
        int age = scan.nextInt();
        int friendsAge = scan.nextInt();
        int difference = age - friendsAge;
        if (difference < 0){
            difference *= -1;
        }
        System.out.println("A diferença de idade de vocês é "+difference+ " ano(s)");
    }
}
