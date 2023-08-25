import java.util.Scanner;

public class Divisor {
    public static  void main(String[] args){
        Scanner divisor = new Scanner(System.in);
        System.out.print("Number: ");
        int number = Integer.parseInt(divisor.nextLine());

       switch (0) {
           case 0 :
               if (number % 3 == 0 && number % 5 ==0) {
                   System.out.println("FizzBuzz");
                   break;
               }
               if (number % 3 ==0){
                   System.out.println("Buzz");
                   break;
               }
               if(number % 5 == 0){
                   System.out.println("Fizz");
                   break;
               }
           default:
               System.out.println(number);
               break;
       }


    }
}
