import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name:  ");
        String age = scanner.nextLine();
        System.out.println("You are " + age);
    }
}
