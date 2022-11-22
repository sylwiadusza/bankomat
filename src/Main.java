import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cash = 1000;
        System.out.println("Stan konta: " + cash);
        System.out.println("Podaj kwotę do wypłaty:");
        Scanner scanner = new Scanner(System.in);
        int payoff = scanner.nextInt();
        if (payoff > cash) {
            System.out.println("Przekroczono limit konta");
            return;
        }
        System.out.println("Wypłaciłeś " + payoff);
        System.out.println("Aktulany stan konta: " + (cash - payoff));
    }
}