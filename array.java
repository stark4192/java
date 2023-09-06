import java.util.Scanner;
class array{
    int []arr=new int[5];
    void get(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the elements to the array");
        for(int i=0;i<5;i++)
        {
            arr[i]=s.nextInt();
        }
    }
    void show()
    {
        try{
            for(int i=0;i<=5;i++ ) 
                System.out.println(" "+arr[i]);
        }
        catch(ArrayIndexOutOfBoundsException E)
        {
            System.out.print("Array out of bound exception");
        }
    }
    public static void main(String[] args) {
        array a=new array();
        a.get();
        a.show();
    }
}