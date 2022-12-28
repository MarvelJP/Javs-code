package java;
import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("%d is Even Number" + n);
        } else {
            System.out.println("%d is odd Number" + n);
        }
    }
}
