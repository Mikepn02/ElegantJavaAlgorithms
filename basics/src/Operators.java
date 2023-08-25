public class Operators {
    public static  void  main(String[] args) {
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        System.out.println(isEligible);
    }
}


class Logical {
    public static void main(String[] args) {
        int income = 120_000;
        String className = income > 100_000 ? "First" : "''Economic";
    }
}


class If{
    public static  void  main(String[] args) {
        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("You are an admin");
                break;
            case  " moderator":
                System.out.println("You are  a moderator");
                break;
            default:
                System.out.println("You are a guest");

        }
        if (role == "admin")
            System.out.println("You are an admin");
        else if (role == "moderator")
            System.out.println("You are  a moderator");
        else
            System.out.println("You are a guest");
    }
}
