

import java.util.Scanner;

public class oprime {
    int n;

    void getdata() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        n = sc.nextInt();

    }


    void putdata() {
        int i, count = 0;
        for (i = 0; i <= n; i++) {
            if (n % i == 0)
                count = count + 1;

        }
        if (count == 2)
            System.out.println("prime number");
        else
            System.out.println("not prime number");

    }

    public static void main(String[] args) {
        {
            oprime aa = new oprime();
            aa.getdata();
            aa.putdata();
        }
    }

}