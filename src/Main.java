import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite um número: ");
        Scanner primeiroNumeroScanner = new Scanner(System.in);
        int primeiroNumero = primeiroNumeroScanner.nextInt();

        System.out.print("Digite um número: ");
        Scanner segundoNumeroScanner = new Scanner(System.in);
        int segundoNumero = segundoNumeroScanner.nextInt();

        int total = primeiroNumero + segundoNumero;

        System.out.println("A soma total é: " + total);
    }
}
