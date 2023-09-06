import java.io.IOException;
import java.util.*;

class LessBalanceException extends Exception {
    public String getString() {
        return "Withdrwaw amount is not valid.";
    }
}

public class b6 {
    float AccountBalance;

    b6(float ac) {
        AccountBalance = ac;
    }

    void withdrawal(float val) {
        AccountBalance -= val;
        System.out.println("Your new account balance is:" + AccountBalance);
    }

    void deposit(float val) {
        AccountBalance += val;
        System.out.println("Your new account balance is:" + AccountBalance);
    }

    float readBalance() {
        return AccountBalance;
    }

    public static void main(String[] args) {
        b6 ac = new b6(500);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter deposit amount:");
        float dep = sc.nextFloat();
        try {
            if (dep < 0)
                throw new LessBalanceException();
            else {
                ac.deposit(dep);
            }
            System.out.println("Enter withdrawal amount:");
            float with = sc.nextFloat();
            float bal = ac.readBalance();
            if (with > bal)
                throw new LessBalanceException();
            else {
                ac.withdrawal(with);
            }
        } catch (LessBalanceException e) {
            LessBalanceException obj = new LessBalanceException();
            System.out.println(obj.getString());
        }
    }
}
