import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("введіть число ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        isPerfectSquare(n);
    }
    public  static double isPerfectSquare (int n){
        double  result = Math.sqrt(n);
         System.out.println(result);
         if (result % 1 == 0){
            System.out.println(result + " є квадратом цілого числа " + n);
         }else {
             System.out.println(result + "  не є квадратом цілого числа ");
         }
         return result;
    }
}