interface personal_loan {
    float find_interest(float balance, int year);

}

class Bank1 implements personal_loan {
    static float roi1 = 0.05f;

    public float find_interest(float balance, int year) {
        return roi1 * balance * year;
    }

}

class Bank2 implements personal_loan {
    static float roi2 = 0.06f;

    public float find_interest(float balance, int year) {
        return roi2 * balance * year;
    }
}

class b13 {
    public static void main(String args[]) {
        Bank1 b1 = new Bank1();
        Bank2 b2 = new Bank2();
        float ir1 = b1.find_interest(1000, 5);
        float ir2 = b2.find_interest(4000, 5);
        System.out.println(ir1);
        System.out.println(ir2);
    }

}
