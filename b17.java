import java.util.*;

public class b17 {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (flag) {
            System.out.print("Enter the first number:");
            int a = sc.nextInt();
            System.out.print("Enter the second number:");
            int b = sc.nextInt();
            try {
                int c = a / b;
                System.out.println("The result is " + c);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(" ");
                System.out.println("Arithmetic Exception occurred: " + e.getMessage());
            } finally {
                System.out.println("Do you want to continue: Y/N ");
                String c = sc.next();
                if (c == "N" || c == "n") {
                    flag = false;
                }
            }
        }
    }
}
