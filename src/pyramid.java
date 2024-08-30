import java.util.Scanner;

public class pyramid {
    public static void main(String args[]) {
        int n, i, j, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number of rows");
        n = sc.nextInt();

//        for (i = 1; i <= n; i++) {
//            for (j = 1; j <= i; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println(" ");
//        }
//    }

//        ****
//        ***
//        **
//        *

//        for (; n>=1; n--) {
//            for (j = 1; j <= n; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println(" ");
//        }
//    }
//}


        for (i = 1; i <= n; i++) {
            for (s = 1; s <= n-i; s++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
            }
        }
    }