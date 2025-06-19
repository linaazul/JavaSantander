package EstruturasDeControle;

import java.util.Scanner;

public class Exercicio02 {
    // 02. Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu
    // IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, informe sua altura:");
        double altura = scan.nextDouble();
        System.out.println("Por favor, informe seu peso:");
        int peso = scan.nextInt();
        double imc = peso/(altura * altura);
        if (imc <= 18.5){
            System.out.println("Você está abaixo do peso.");
        } else if(imc >=18.6 && imc <= 24.9){
            System.out.println("Parabéns, você tem o peso ideal.");
        } else if(imc >=25 && imc < 30){
            System.out.println("Você está levemente acima do peso.");
        } else if(imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade grau I.");
        } else if(imc >= 35 && imc < 40){
            System.out.println("Obesidade grau II (Severa).");
        } else{
            System.out.println("Obesidade grau III (Mórbida).");
        }
    }
}
