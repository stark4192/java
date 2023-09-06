import java.util.Scanner;

class c1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        float a1 = s.nextFloat();
        float b1 = s.nextFloat();
        int a2 = s.nextInt();
        int b2 = s.nextInt();
        float ans1 = multiplication(a1, b1);
        int ans2 = multiplication(a2, b2);
        System.out.println("Multiplication of 2 float values : " + ans1);
        System.out.println("Multiplication of 2 integer values : " + ans2);
    }

    // method overloading
    private static int multiplication(int a2, int b2) {
        return a2 * b2;
    }

    private static float multiplication(float a1, float b1) {
        return a1 * b1;
    }
}
