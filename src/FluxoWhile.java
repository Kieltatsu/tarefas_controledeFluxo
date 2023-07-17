import java.util.Scanner;

public class FluxoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0;
        double media;
        int contador = 0;

        while (contador < 4) {
            System.out.print("Digite a nota " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
            contador++;
        }

        media = somaNotas / 4;

        if (media >= 7 && media <= 10) {
            System.out.println("Média: " + media);
            System.out.println("Situação: Aprovado");
        } else if (media >= 5) {
            System.out.println("Média: " + media);
            System.out.println("Situação: Recuperação");
        } else {
            System.out.println("Média: " + media);
            System.out.println("Situação: Reprovado");
        }

        scanner.close();
    }
}
