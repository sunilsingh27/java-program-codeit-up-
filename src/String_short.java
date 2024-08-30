import java.util.Scanner;

public class String_short {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1 = new String();
        System.out.println("enter string");
        str1=sc.nextLine();
        char c,d;
        int i,j;


        i=str1.length()-1;
        while(str1.charAt(i)!=' '){
            {
            i--;}

        j=0;
        while(j<i) {
            if (j == 0)
                System.out.print(str1.charAt(j) + '.');
            else {
                c = str1.charAt(j);
                d = str1.charAt(j + 1);
                if (c == ' ' && d != ' ')
                    System.out.print(d + '.');
                }
            j++;
                    }
            }
            System.out.print(str1.substring(i));


    }
}
