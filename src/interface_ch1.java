import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

class student {
    int roll;
    void getroll(int n)
    {
        roll =n;
    }
    void putroll()
    {
        System.out.println("roll"+roll);

    }
}
class test extends student{
    float mark1,mark2;
   void getmarks(float m1 , float m2 )
   {
   mark1=m1;
   mark2=m2;
   }
   void putmarks()
        {
        System.out.println("marks1="+mark1+ "\n marks2"+mark2);

    }
}
interface sports
{
    float sportmark= 6.0f;
  public void putsport();
}
class result extends test implements sports {
    float total;

    public void putsport() {
        System.out.println("sports marks=" + sportmark);

    }

    void display() {
        total = mark1 + mark2 + sportmark;
        putroll();
        putmarks();
        putsport();
        System.out.println(total);
    }
}

class interface_ch1
{
    public static void main(String args[])
    {
        result aa=new result();
        aa.getroll(101);
        aa.getmarks(30.5f,35.9f);
        aa.display();
    }
}