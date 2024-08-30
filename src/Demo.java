import java.util.Scanner;
class  linear{
    int[] a =new int[10];
    int key;
    void getdata ()
    {
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=0;i<10;i++){
          System.out.println("enter number of array");
          a[i]=sc.nextInt();

        }
        System.out.println("enter your key");
        key= sc.nextInt();

    }
     void search()
        {
        int i,flag=0,posi=0;
        for(i=0;i<10&&flag==0;i++)
        {
            if(a[i]==key)
            {
                flag=1;
                posi=i+1;
            }
        }

        if(flag==1)
            System.out.println("number found at=" +posi);
        else
            System.out.println("not found");
    }
}



public class Demo {
    public static void main(String[] args) {
   linear aa=new linear();
        aa.getdata();
        aa.search();
    }
}
