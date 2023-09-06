class sb1 {
    sb1() {
        System.out.println("1st string class");
    }
}

class sb2 {
    sb2() {
        System.out.println("2nd string class");
    }
}

class sb3 {
    sb3() {
        System.out.println("3rd string class");
    }
}

public class b14 {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello ");
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = new StringBuffer();
        sb.append("Java");// now original string is changed
        System.out.println(sb);// Hello Java
    }
}
