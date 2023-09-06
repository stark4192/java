    import java.util.Scanner;
class NegativeNumberException extends Exception 
{
public NegativeNumberException(String str)
 {{
        System.out.println(str);
    }
}
public class LAB12_q2
 {
public static void main(String[] args) 
{
        try (Scanner sc = new Scanner(System.in)) 
{
            System.out.print("Enter the number: ");
            int ProcessInput = sc.nextInt();
            ProcessInput(ProcessInput);
        }
    }
static void ProcessInput(int ProcessInput) 
{
        Try
 {
            if (ProcessInput < 0) {
                throw new NegativeNumberException("The number is negative");
            }
          else 
{
                double p = (double) ProcessInput;
                System.out.println(p);
            }
        } catch (NegativeNumberException e) 
{
            System.out.println(e);
        }
    }
}
}
