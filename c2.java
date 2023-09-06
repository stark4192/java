class c2 {
    public static void main(String[] args) {
        kiitian k = new kiitian();
        k.register("CSE", 179);
        k.hostel(false);
        System.out.println("Roll no - " + k.Rollno);
        System.out.println("Course - " + k.course);
        System.out.println("Hostel - " + k.hostel);
    }
}

class student {
    int Rollno;
    String course;

    public void register(String course, int Rollno) {
        this.course = course;
        this.Rollno = Rollno;
    }
}

class kiitian extends student {
    boolean hostel;

    public void hostel(boolean hostel) {
        this.hostel = hostel;
    }
}