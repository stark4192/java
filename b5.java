import java.io.FileNotFoundException;

public class b5 {
    public static void main(String[] args) {
        try {
            int x = 100 / 0;
            System.out.println("value:" + x);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception is " + e);
        } catch (NegativeArraySizeException e) {
            System.out.println("the exception is " + e);
        } finally {
            System.out.println("this isa finally");
        }
    }

}
