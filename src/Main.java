import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner CaixaDeCalculo = new Scanner(System.in);


        double numero1, numero2, resultado;
        char operacao;


        System.out.println("======BEM-VINDO A CALCULADORA======");
        System.out.println("===================================");


        System.out.print("Digite o primeiro numero: ");
        numero1 = CaixaDeCalculo.nextInt();
        System.out.println("===================================");

        System.out.print("Digite a operação (+,-,*,/): ");
        operacao = CaixaDeCalculo.next().charAt(0);
        System.out.println("===================================");

        System.out.print("Digite o segundo numero: ");
        numero2 = CaixaDeCalculo.nextInt();
        System.out.println("===================================");

        switch (operacao){
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (numero2 != 0){
                    resultado =numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                }else {
                    System.out.println("Impossivel divisao por 0. Reinicie o programa!");
                }
                break;
            default:
                System.out.println("Sinal inexistente. Reinicie o programa!");
        }

    }
}
