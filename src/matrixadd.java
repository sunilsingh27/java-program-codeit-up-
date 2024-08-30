import java.util.Scanner;

class addition {
    int[][] a = new int[3][3];
    int[][] b = new int[3][3];
    int[][] c = new int[3][3];

    void getdata() {
        int i, j;
//        i = j = 0;

        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++) {
                System.out.println("enter no");
                a[i][j] = sc.nextInt();
            }
        System.out.println("2nd matrix number");
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++) {
                System.out.println("enter no");
                b[i][j] = sc.nextInt();
            }

    }

    void addnum() {
        int i, j;
//            i=j=0;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
    }

    void putdata() {
        int i, j;
//            i = j = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(c[i][j] + "    ");
            }

            System.out.println();
        }
    }
}

   public class matrixadd {
        public static void main(String[] args)
        {
            addition aa =new addition ();
            aa.getdata();
            aa.addnum();
            aa.putdata();

        }
    }

