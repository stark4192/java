public class q2lab12{
    public static void main(String[] args) {
    
        try{
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 10;
        arr[3] = 20;
        arr[4] = 10;
        arr[5] = 10;
        
        System.out.println("ArrayIndexOutofBoundsException");

    }
    catch (Exception e) {
        System.out.println(e);
    }
    
    }

}