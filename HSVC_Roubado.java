import java.util.Scanner;

public class HSVC_Roubado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] quantDinheiro = new int[10];
        System.out.println("Insira a quantidade de dinheiro que cada uma dos 10 tolos possui:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Tolo " + (i + 1) + ": ");
            quantDinheiro[i] = scanner.nextInt();
        }

        System.out.print("Insira a quantidade de dinheiro que o bandido confesso revelou: ");
        int dinheiroBandidoConfesso = scanner.nextInt();

        int Roubado = 0;
        for (int dinheiro : quantDinheiro) {
            if (dinheiro > dinheiroBandidoConfesso) {
                int quantRoubada = dinheiro - dinheiroBandidoConfesso;
                Roubado += quantRoubada;
            }
        }

        System.out.println("O total de dinheiro roubado foi: " + Roubado + " reais.");

        scanner.close();
    }
}