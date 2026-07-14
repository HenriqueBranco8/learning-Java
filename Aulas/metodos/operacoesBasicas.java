

import java.util.Scanner;

public class operatesBasics {

    public static void soma(){
        System.out.println("Atualmente você está na operação de somar");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite outro número: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;

        System.out.println("Resultado da Soma: " + result);
    }

    public static void subtracao(){
        System.out.println("Atualmente você está na operação de subtração");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite outro número");
        double num2 = scanner.nextDouble();

        double result = num1 - num2;

        System.out.println("Resultado da subtração: " + result);
    }

    public  static void multiplicacao(){
        System.out.println("Atualmente você está na operação de multiplicação");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite outro: ");
        double num2 = scanner.nextDouble();

        double result = num1 * num2;

        System.out.println("O resultado da multiplicação: " + result);

    }

    public static void  divisao(){
        System.out.println("Atualmente você está na operação de divisão");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite outro número: ");
        double num2 = scanner.nextDouble();

        double result = num1 / num2;
        System.out.println("resultado: " + result);
    }

}

public class menuDeOperacoes {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Bem-Vindo ao meu sistema de calculos");

        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.println("Digite a opção que você deseja: ");

        int opcao = scanner.nextInt();

        if(opcao == 1){
            operatesBasics.soma();
        } else if(opcao == 2){
            operatesBasics.subtracao();
        } else if(opcao == 3){
            operatesBasics.multiplicacao();
        } else if(opcao == 4){
            operatesBasics.divisao();
        }

    }

}

void main() {
    menuDeOperacoes.menu();
}

