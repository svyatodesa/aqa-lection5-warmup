import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("введіть вік користувача");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        checkAge(n);
    }
    public  static int checkAge(int n){
        if(n > 0 && n < 18 ){
            System.out.println("ви не доросла людина");
        }
        if ( n >= 18 && n <= 99){
            System.out.println("ви доросла людина");
        }
        if(n < 0 || n > 120){
            System.out.println(" ви ввели некоректне число");
        }
        return n;
    }
}