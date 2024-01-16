import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.print("Digite um número: ");
        BigDecimal primeiroNumero = scanner.nextBigDecimal();

        System.out.print("Digite um número: ");
        BigDecimal segundoNumero = scanner.nextBigDecimal();

        BigDecimal total = primeiroNumero.add(segundoNumero);

        System.out.println("A soma total é: " + total);
    }
}
