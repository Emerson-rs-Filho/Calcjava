import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA");

        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        Calculadora calc = new Calculadora(num1, num2);

        boolean executando = true;
        while (executando) {
            System.out.println("--------------------------------------------------");
            System.out.println("Digite o simbolo de operação matematica desejado:");
            System.out.println("+ Somar");
            System.out.println("- Subtrair");
            System.out.println("/ Dividir");
            System.out.println("* Multiplicar");
            System.out.println("Digite '.' para sair");
            System.out.println("--------------------------------------------------");
            System.out.print("Selecione opcao: ");
            String escolha = scanner.nextLine();

            int resultado = 0;
            boolean operacaoValida = true;

            switch (escolha) {
                case "+":
                    resultado = calc.soma(calc.getNum1(), calc.getNum2());
                    System.out.println("Resultado: " + calc.exibirOperacao("+", resultado));
                    break;
                case "-":
                    resultado = calc.subtraia(calc.getNum1(), calc.getNum2());
                    System.out.println("Resultado: " + calc.exibirOperacao("-", resultado));
                    break;
                case "/":
                    try {
                        resultado = calc.divida(calc.getNum1(), calc.getNum2());
                        System.out.println("Resultado: " + calc.exibirOperacao("/", resultado));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                        operacaoValida = false;
                    }
                    break;
                case "*":
                    resultado = calc.multiplique(calc.getNum1(), calc.getNum2());
                    System.out.println("Resultado: " + calc.exibirOperacao("*", resultado));
                    break;
                case ".":
                    executando = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
                    operacaoValida = false;
            }

            if (operacaoValida && !escolha.equals(".") && !escolha.equals("5") && !escolha.equals("6")) {
                System.out.println("=====================================");
            }
        }

        scanner.close();
    }
}
