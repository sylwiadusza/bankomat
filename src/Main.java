import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cash = 1000;
        System.out.println("Stan konta: " + cash);
        System.out.println("Podaj kwotę do wypłaty:");
        int payoff = scanner.nextInt();
        if (payoff < cash) {
            System.out.println("Wypłaciłeś " + payoff);
            System.out.println("Aktulany stan konta: " + (cash - payoff));
        }
        else {
                System.out.println("Przekroczono limit konta");
            }
        }
    }
