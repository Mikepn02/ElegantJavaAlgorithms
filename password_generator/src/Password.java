import java.security.SecureRandom;

public class Password {
    public  static  void  main(String[] args){
        int length = 12;
        System.out.println(generatePassword(length));

    }
    public  static  String  generatePassword(int length){
        final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for(int i=0 ;i<length ; i++){
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));



        }
        return password.toString();
    }
}