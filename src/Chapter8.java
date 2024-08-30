//class cellphone{
//    int ringing;
//    int vibrating ;
//
//    public int getRinging(){
//        return ringing;
//    }
//
//    public int getVibrating(){
//        return vibrating;
//    }
//}

class rectangle{
    int length ;
    int width;

    public int area(){
        return length*width;
    }

    public int parameter(){
        return 2*(length+width);


    }
}

public class Chapter8 {
    public static void main(String[] args) {
        rectangle sq = new rectangle();
        sq.length = 2;
        sq.width = 2;
        System.out.println(sq.area());

        System.out.println(sq.parameter());


    }
}


//
//public class Chapter8 {
//    public static void main(String[] args) {
//        cellphone samsung =new cellphone();
//        samsung.ringing=6;
//        samsung.vibrating=8;
//        System.out.println(samsung.getRinging());
//        System.out.println(samsung.getVibrating());
//    }

//}
