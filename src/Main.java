import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("введіть число від 1 до 5");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        getGrade(n);

        }
        public static int checkNumber(int n){
        if (1 <=n && n < 5){
            System.out.println("поганна оцінка");

        }else {
            System.out.println("відмінна оцінка");

        }
            return n;
        }

      public static boolean getGrade (int n){
        if(1<= n && n <= 5 ){
            checkNumber(n);
            return true;
        }
        System.out.println("ввели не то число");
        return false;
      }
    }
