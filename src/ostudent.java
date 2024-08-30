import javax.imageio.stream.ImageInputStream;

public class ostudent {
    int roll;
    String name;
    static String Cname="xyz";
    ostudent(int x,String y)
    {
        roll=x;
        name=y;

    }
    void display()
    {
        System.out.println("roll="+roll +"name="+name+ " "+"collegename="+Cname);
    }

    public static void main(String[] args) {
        ostudent aa=new ostudent(101,"ram");
        ostudent bb=new ostudent(102,"shyam");
        aa.display();
        bb.display();
    }
}
