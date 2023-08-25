import java.util.Scanner;

public class LoanCalculator {
    public static  void main(String[] args){
        final byte  PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;

        int principal =0;
        double monthlyInterest =0;
        int numberOfPayment = 0;

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter the amount of Principal: ");
            principal = scanner.nextInt();
            if(principal >=1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter the value between 1000 and 1000000");
        }

        while(true) {
            System.out.print("Annual Interest Rate (%): ");
            double annualInterest = scanner.nextDouble();
            if(annualInterest >=1 && annualInterest <=30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter the value between 1 and 30");
        }

        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if(years >= 1 && years <=30){
                numberOfPayment = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter the value between 1 and 30");

        }

        double Mortage = principal
                * monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment)
                /(Math.pow(1 + monthlyInterest , numberOfPayment) -1);


    }
}
