import java.util.Scanner;

public class bubble {
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
    for(i=0;i<10;i++)
        for(j=0;j<9-i;j++) {
            if (a[j] > a[j + 1]) {
                t = a[j];
                a[j] = a[j + 1];
                a[j + 1] = t;
            }
        }
    }
}
class demo_bubble
{
    public static void main(String[] args) {
        bubble aa= new bubble();
        aa.getdata();
        aa.sort();
        aa.putdata();
    }
}



