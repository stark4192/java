import java.util.Scanner;
class Time {
public static void main(String[] args) throws InvalidTimeException 
{

    Scanner sc = new Scanner(System.in);
    while (true) {
    System.out.println("Enter the start time");
    int startTime = sc.nextInt();
    System.out.println("Enter the end time");
    int endTime = sc.nextInt();
    if (startTime > endTime) 
    {
    System.out.println("Try Again!!!");
    throw new InvalidTimeException("Start time cannot be greater than end time");
    }
    else 
    {
    int diff = endTime - startTime;
    System.out.println("Difference between start time and end time is: " + diff);
    System.out.println("Do you want to try again? (Yes/No)");
    String str = sc.next();
    if (str.compareToIgnoreCase("No") == 0) {
    break;
        }
    }
    sc.close();
    }
    }
    class InvalidTimeException extends Exception {
    public InvalidTimeException(String message) {
    super(message);
    }
    }
}