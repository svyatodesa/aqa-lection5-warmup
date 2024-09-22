import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("in nubber");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        isNatural(n);
        }
        public  static boolean isNatural(int n){
            if (n <=1){
                System.out.println("число не є простим");
                return false;
        }
            for (int i = 2; i * i <= n; i++){
                if (n % i == 0) {
                    System.out.println("число не є простим");
                    return false;
                }
            }
                System.out.println("просте число");
                return true;

        }
    }

