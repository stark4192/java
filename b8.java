import javax.sound.sampled.SourceDataLine;

class A {
    static {
        System.out.println("this is A");
    }
}

class B {
    static {
        System.out.println("this is B");
    }
}

public class b8 {
    public static void main(String[] args) {
        new B();

    }
}
