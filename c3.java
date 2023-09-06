class c3 {

    public static void main(String[] args) {
        Manager m = new Manager(121, 23400, 4590);
        m.salary();
    }

}

class Employee {
    int empid;
    int basic;
    int DA;

    Employee(int empid, int basic, int DA) {
        this.empid = empid;
        this.basic = basic;
        this.DA = DA;
    }

    void salary() {
        int total = DA + basic;
        System.out.println(empid + " : " + total);
    }
}

class Manager extends Employee {
    float tallowance;

    Manager(int empid, int basic, int DA) {
        super(empid, basic, DA);
        tallowance = basic;
    }

    @Override
    void salary() {
        float total = basic + DA + tallowance;
        System.out.println(empid + " : " + total);
    }
}