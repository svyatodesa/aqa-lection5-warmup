import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("введіть число ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        calculateSumUpToN(n);
    }
    public  static  int calculateSumUpToN(int n){
        int result = 0;
        for (int i = 1; i <=n ; i++){
        result = i + i;
        System.out.println("result " +i  +" + " + i +" = "+ result);
        }

         return result;

    }
}