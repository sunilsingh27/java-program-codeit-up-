import java.util.Scanner;

public class String_palindrome {
    public static void main(String[] args) {

        String s = new String();
        Scanner sc=new Scanner (System.in);
        System.out.println("enter string");
        s =sc.nextLine();
        int i,j,flag=0;
        i=0;
        j=s.length()-1;
        while(i<j&&flag==0)
        {
            if(s.charAt(i)!=s.charAt(j)){
                flag=1;
            }
            else {
                i=i+1;
                j=j-1;
                 }
            if (flag==0)
                System.out.println("palindrom");
            else
                System.out.println("not palindrme");
        }




    }
}
