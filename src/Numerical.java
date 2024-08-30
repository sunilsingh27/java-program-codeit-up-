//import java.util.Scanner;
//
//public class Numerical {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n , sum=0, pro=1,digit;
//        System.out.println("enter your number ");
//        n=sc.nextInt();
//// sum of even and product of odd
//
//        while(n>0)
//        {
//            digit=n%10;
//            if (digit%2==0)
//                sum=sum+digit;
//            else
//                pro=pro*digit;
//            n=n/10;
//
//        }
//        System.out.println("sum="+sum +"pro="+pro);
//    }
//}

import java.util.Scanner;
public class Numerical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,r, rev = 0, z;
        System.out.println("enter your number ");
        n = sc.nextInt();
        z = n;

        while (n > 0) {
            r =  n % 10;
            rev=(rev * 10)+r ;
            n = n / 10;
        }
        if (n==z)
            System.out.println("palindrom");
        else
            System.out.println("not palindrome");





//        import java.util.Scanner;
//        class PalindromeExample{
//            public static void main(String args[]){
//                int r,sum=0,temp;
//                Scanner sc=new Scanner (System.in);
//                int n;
//                System.out.println("enter ther number ");
//                n=sc.nextInt();
//                //int n=454;//It is the number variable to be checked for palindrome
//
//                temp=n;
//                while(n>0){
//                    r=n%10;  //getting remainder
//                    sum=(sum*10)+r;
//                    n=n/10;
//                }
//                if(temp==sum)
//                    System.out.println("palindrome number ");
//                else
//                    System.out.println("not palindrome");
//            }
//        }

    }
    }

