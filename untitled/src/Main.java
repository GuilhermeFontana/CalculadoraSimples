import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Calculadora simples");
        System.out.println("2 - Fatorar numero");
        System.out.println("3 - Tabuada");
        System.out.println("4 - Sair" );
        System.out.print("Escolha alguma das opções: ");
        int escolha1 = scanner.nextInt();

        switch (escolha1){
            case 1:
                System.out.print("Digite o primeiro numero: ");
                int numero1 = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Escolha uma operação ( +, -, /, * ): ");
                String operacao = scanner.nextLine();

                System.out.print("Digite o segundo numero: ");
                int numero2 = scanner.nextInt();

                int resultado;

                switch (operacao) {
                    case "+":
                        resultado = numero1 + numero2;
                        System.out.print("Resultado: " + resultado);
                        break;
                    case "-":
                        resultado = numero1 - numero2;
                        System.out.print("Resultado: " + resultado);
                        break;
                    case "*":
                        resultado = numero1 * numero2;
                        System.out.print("Resultado: " + resultado);
                        break;
                    case "/":
                        if (numero2 == 0) {
                            System.out.println("Não é o possivel divisao por 0!");
                        } else {
                            resultado = numero1 / numero2;
                            System.out.print("Resultado: " + resultado);
                            break;
                        }
        }
        break;
            case 2:
                System.out.println("======FATORANDO======");
                System.out.print("Digite o numero que deseja fatorar: " );
                int numeroEscolhido = scanner.nextInt();

                int resultadoFatorado = 1;

                for (int i = 1; i <= numeroEscolhido; i++) {
                    resultadoFatorado *= i;
                }
                System.out.println(resultadoFatorado);
                break;
            case 3:
                System.out.println("==========TABUADA==========");
                System.out.print("Digite um numero: ");
                int numeroRecebido = scanner.nextInt();

                for (int i = 0; i <= 10; i++) {
                    System.out.println(numeroRecebido + " x " + i + " = " + numeroRecebido * i);
                }
                break;
            case 4:
                System.out.println("Saindo do programa, aguarde!");
                return;
            default:
                System.out.println("Opçao nao existe!! Encerrando programa!");


        }
    }
}
