import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Enter the choice");
            System.out.println("1.Addition of two number");
            System.out.println("2.Subtraction of two number");
            System.out.println("3.Multiplication of two numbers");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the two numbers");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("The sum is " + (a + b));
                    break;
                case 2:
                    System.out.println("Enter the two numbers");
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    System.out.println("The difference is " + (c - d));
                    break;
                case 3:
                    System.out.println("Enter the two numbers");
                    int e = sc.nextInt();
                    int f = sc.nextInt();
                    System.out.println("The product is " + (e * f));
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue? Press 1 for yes and 2 for no");
            ch = sc.nextInt();
        } while (ch == 1);
        System.out.println("Thank you");
    }
}