import java.io.IOException;

class b16 {
    public static void main(String[] args) throws IOException {
        String s4 = "MONSOON MAURYA";
        int index1 = s4.indexOf("on");
        System.out.println(index1);
        try {
            if (index1 < 0) {
                throw new LessthanzeroException();
            }
        } catch (LessthanzeroException e) {
            LessthanzeroException obj = new LessthanzeroException();
            System.out.println(obj.getstring());
        }
    }
}

class LessthanzeroException extends Exception {
    public String getstring() {
        return "index not valid";
    }
}