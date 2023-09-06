import java.util.Scanner;

class printingname {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first name :");
        String first = s.next();
        System.out.println("Enter last name : ");
        String last = s.next();
        System.out.print(last + " " + first);
    }
}
