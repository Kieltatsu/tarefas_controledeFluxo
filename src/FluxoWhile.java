import java.util.Scanner;

public class FluxoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        while (true) {
            System.out.print("Digite a nota (digite -1 para sair): ");
            nota = scanner.nextInt();

            if (nota == -1) {
                break;
            }

            if (nota >= 7 && nota <= 10) {
                System.out.println("Aprovado");
            } else if (nota >= 5 && nota <= 6) {
                System.out.println("Recuperação");
            } else if (nota < 4) {
                System.out.println("Reprovado");
            } else {
                System.out.println("Nota inválida");
            }
        }

        System.out.println("Encerrando o programa");
        scanner.close();
    }
}
