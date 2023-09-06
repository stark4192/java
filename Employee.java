

package p1;

public class Employee {
    protected int empid;
    private String ename;
    public int basic;

    Employee(int empid ,String ename, int basic) {
        this.empid = empid;
        this.basic = basic;
        this.ename=ename;
    }

    void display(){
    System.out.println("employee id : " + empid);
    System.out.println("employee name : " + ename);
    }

    void salary() {
        double DA = basic*0.8;
        double HRA = 0.15*basic;
        double total = DA + basic+HRA;
        System.out.println(empid + " : " + total);

    }
}

class Sales extends Employee {
    double ta;



    Sales(int empid, String ename, int basic) {
        super(empid,ename, basic);

    }

    void tallowance() {
        double ta = 0.05*basic;
        System.out.println(empid + " : " + ta);
    }


}