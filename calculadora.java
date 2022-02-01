import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        System.out.println("  - Calculadora - ");
        
        int opcao;
        do {
            System.out.println("- Escolha a opção para usar sua calculadora:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("Para sair digite ( 0 )");

            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();
            processar (opcao);
        } while (opcao != 0); 
    }
    public static void processar(int opcao) {
        Scanner scanner = new Scanner(System.in);
        switch (opcao) {
            case 1: {
                System.out.println("Somando dois números:");

                System.out.print("Digite o primeiro número:");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número:");
                int numero2 = scanner.nextInt();

                int resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            }
            case 2: {
                System.out.println("Subtraindo dois números:");

                System.out.print("Digite o primeiro número:");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número:");
                int numero2 = scanner.nextInt();

                int resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            }
            case 3: {
                System.out.println("Multiplicando dois números:");

                System.out.print("Digite o primeiro número:");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número:");
                int numero2 = scanner.nextInt();

                int resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            }
            case 4: {
                System.out.println("Dividindo dois números:");

                System.out.print("Digite o primeiro número:");
                double numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número:");
                double numero2 = scanner.nextInt();
                
                if (numero2 ==0) {
                    System.out.println("Impossível dividir por 0");
                } else {
                double resultado = numero1 / numero2;
                System.out.println("Resultado: " + resultado);
                }
                break;
            }
        }         
    }
}