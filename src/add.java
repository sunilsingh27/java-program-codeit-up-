import java.util.Scanner;

public class add {
    int a,b;
    void getdata ()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your first number ");
        a= sc.nextInt();

        System.out.println("enter your second number ");
        b= sc.nextInt();

    }
    void putdata()
    {
        System.out.println("addition ="+(a+b));
    }

    public static void main(String[] args) {
        {
            add aa=new add();
            aa.getdata();
            aa.putdata();
        }
    }
}
