public class b15 {
    int rollno;
    String name;
    String city;

    b15(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public String toString() {// overriding the toString() method
        return rollno + " " + name + " " + city;
    }

    public static void main(String args[]) {
        b15 s1 = new b15(101, "Raj", "lucknow");
        b15 s2 = new b15(102, "Vijay", "ghaziabad");
        System.out.println(s1);// compiler writes here s1.toString()
        System.out.println(s2);// compiler writes here s2.toString()
    }
}
