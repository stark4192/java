import java.io.IOException;
import java.util.Scanner;

public class b9 {
    public static void main(String[] args) {
        char ch[] = { 'a', 'b', 'c' };
        String s = new String(ch);
        String s1 = new String(ch, 1, 2);
        String s2 = new String(s);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s == s2 + ',');

        String age = "19";
        String s3 = "he is " + age + " years old ";
        System.out.println(s3);

        System.out.println(s3.length());

        String fruit = "mango";
        char ch1 = fruit.charAt(3);
        System.out.println(ch1);

        String s4 = new String("MONSOON MAURYA");
        int start = 4, end = 7, destoffset = 0;
        try {
            char ch2[] = new char[end - start];
            s4.getChars(start, end, ch2, destoffset);
            System.out.println(ch2);
            System.out.println(s4.substring(4, 7));
        } catch (Exception f) {
            System.out.println(f);
        }
        String s5 = s4.substring(4);
        String s6 = s4.substring(3, 4);
        System.out.println("s5: " + s5 + " s6: " + s6);

        int index1 = s4.indexOf("on");
        System.out.println(index1);

        Scanner sc = new Scanner(System.in);
        String s7 = sc.nextLine();
        String s8 = sc.nextLine();
        System.out.println(s7 + " " + s8);
        System.out.println(s7.concat(s8));
        System.out.println(s4.replace("O", "T"));
        System.out.println(s4.length());
        System.out.println(s4.toLowerCase());
        System.out.println(s7 == s8 + ",");
        System.out.println(s7.equals(s8));
        String s9 = String.format("name is %s", s4, 8);
        System.out.println(s9);
        byte[] barr = s4.getBytes();
        System.out.println(barr);
        int a = 9;
        String s10 = String.valueOf(a);
        System.out.println(s10);

        int arr[] = new int[10];
        System.out.println("array inputs are :");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("displaying array");
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
        StringBuffer s11 = new StringBuffer("hello");
        s11.reverse();
        System.out.println(s11);
    }

}
