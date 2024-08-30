import java.util.Scanner;

 class demo_selectionsort {
    int [] a = new int [10];

    void getdata() {

        int i;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<10;i++) {
            System.out.println("enter no");
            a[i] = sc.nextInt();
        }
    }

    void putdata()

    {
        int i;
        for (i=0;i<10;i++) {
            System.out.println(a[i]);
        }
    }


    void sort()
    {
        int i,j,t;
        for(i=0;i<9;i++)
            for(j=i+1;j<10;j++) {
                if (a[i] > a[j ]) {
                    t = a[i];
                    a[i] = a[j ];
                    a[j ] = t;
                }
            }
    }
}
public class selectionsort
{
    public static void main(String[] args) {
       demo_selectionsort aa= new demo_selectionsort();
        aa.getdata();
        aa.sort();
        aa.putdata();
    }
}



