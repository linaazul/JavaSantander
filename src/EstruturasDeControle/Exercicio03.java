package EstruturasDeControle;

import java.util.Scanner;

public class Exercicio03 {
    // 03. Escreva um código que o usuário entre com um primeiro número, um segundo
    // número maior que o primeiro e escolhe entre a opção par e impar, com isso o
    // código deve informar todos os números pares ou ímpares (de acordo com a seleção
    // inicial) no intervalo de números informados, incluindo os números informados e
    // em ordem decrescente;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número inteiro:");
        int firstNum = scan.nextInt();
        System.out.println("Informe outro número sendo esse maior que " +
                "o número digitado anteriormente:");
        int secondNum = scan.nextInt();
        if(secondNum < firstNum){
            System.out.println("Por favor siga as instruções.");
        }else{
            System.out.println("Agora escolha a opção par ou impar.");
            String option = scan.next();
            switch (option.toLowerCase()){
                case "par":
                    for (int i = secondNum; i >= firstNum; i--) {
                        if(i%2==0){
                            System.out.println(i);
                        }
                    }
                    break;
                case "impar":
                    for (int i = secondNum; i >= firstNum; i--) {
                        if(i%2!=0){
                            System.out.println(i);
                        }
                    }
                    break;
                default:
                    System.out.printf("Envie um valor válido. Par ou impar.");
            }
        }
    }
}
