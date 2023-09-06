import java.util.*;
public class q2lab13 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        String s1 = str1.concat(str2);
        String s2 = str1.replaceFirst("m",str2);
        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }
}
