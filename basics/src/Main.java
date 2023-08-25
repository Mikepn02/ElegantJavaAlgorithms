import java.text.NumberFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format(0.1);
        System.out.println(result);

    }
  }