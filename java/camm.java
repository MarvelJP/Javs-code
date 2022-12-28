package java;

public class camm {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Argumenys are");
            for (String x : args)
                System.out.print(x + " ");
        } else
            System.out.println("No Arguments");
    }
}
