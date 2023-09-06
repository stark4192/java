abstract class emp {
    emp() {
        System.out.println("abc");
    }

    abstract void display();

    abstract void disp();

}

class t extends emp {
    void display() {
        System.out.println("vi");
    }

    void disp() {
        System.out.println("dd");
    }

    public static void main(String args[]) {

    }
}
