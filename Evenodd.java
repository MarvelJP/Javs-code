import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(" Even Number is" + n);
        } else {
            System.out.println(" odd Number is" + n);
        }
    }
}
