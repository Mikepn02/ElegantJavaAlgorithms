import java.util.Scanner;

public class loop {
    public static void main(String[] args){
//        for(int i = 0; i<=5 ; i++){
//            System.out.println("Hello world  " + i);
//        }

//        String input = "";
//        while (true){
//            System.out.print("input: ");
//            Scanner scanner = new Scanner(System.in);
//            input = scanner.next().toLowerCase();
//            if(input.equals("pass"))
//                continue;
//
//            if(input.equals("quit"))
//                break;
//            System.out.println(input);
//        }
//        String input = ""
//        do {
//            System.out.print("input: ");
//            Scanner scanner = new Scanner(System.in);
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//
//        }while (!input.equals("quit"))


        String[] fruits = {"Apple", "Mango","Orange"};
        for (int i=0 ; i< fruits.length ; i++)
            System.out.println(fruits[i]);
        for(String fruit: fruits)
            System.out.println(fruit);
    }


}
