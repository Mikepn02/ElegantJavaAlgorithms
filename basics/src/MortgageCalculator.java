import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Annual Interest Rate (%): ");
        double annualInterest = scanner.nextDouble();
        double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String mortgageFormatted = currencyFormat.format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
