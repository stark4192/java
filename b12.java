class Bike {
    int speedlimit = 90;
}

class b12 extends Bike {
    int speedlimit = 150;

    public static void main(String args[]) {
        Bike obj = new b12();
        System.out.println(obj.speedlimit);// 90
    }
}