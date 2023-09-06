class lab7q4 {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A();
        A obj3 = new A();
        int numObjects = obj1.count;
        System.out.println("No. of object : " + numObjects);

    }
}

class A {
    static int count;

    A() {
        count++;
    }
}
