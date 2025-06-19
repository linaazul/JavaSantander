package EstruturasDeControle;

import java.util.Scanner;

public class Exercicio04 {
    // 04. Escreva um código onde o usuário informa um número inicial, posteriormente irá informar
    // outros N números, a execução do código irá continuar até que o número informado dividido
    // pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro
    // número devem ser ignorados.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número inteiro:");
        int num = scan.nextInt();
        boolean flag = true;
        while(flag){
            System.out.println("Informe outro número:");
            int num2 = scan.nextInt();
            double result = num2 % num;
            System.out.println(num2 + " % " + num + " = " +result);
            if(num2<num){
                System.out.println("Informe um número maior que " + num);
            } else if(num2 % num != 0){
                flag = false;
            }
        }
    }
}
