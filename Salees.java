package marketing;

import general.employeee;

public class Salees extends employeee {
    public double ta;

    public void tallowance() {
        ta = 0.05 * total;
        System.out.println(" tallowance: " + ta);
    }
}
