package general;
public class employeee {
protected int empid;
private String ename;
public int basic;
double total;
public employeee(int empid, String ename )
{
this.empid = empid;
this.ename = ename;
System.out.println("employee id : " + empid);
System.out.println("employee name : " + ename);
}
public void earnings(int basic) {
double DA = basic * 0.8;
double HRA = 0.15 * basic;
total = DA + basic + HRA;
System.out.println(" total salary: " + total);
}
}
