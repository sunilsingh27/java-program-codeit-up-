public class Chapter6 {
    public static void main(String[] args) {
        int arr[] = {22, 55, 78, 4, 5,  87};
        int max= 0;
        for (int e : arr) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println(+max);
    }
}

        


//        int arr[] = {22, 55, 78, 4, 5,  87};
//        int min = Integer.MAX_VALUE;
//        for (int e : arr) {
//            if (e < min) {
//                min = e;
//            }
//        }
//        System.out.println(+min);
//    }
//}

//        float[] marks = {20.5f, 70.5f, 30.5f, 40.5f, 20.5f};
//        float sum = 30.5f;
//        boolean isInArray = false;
//        for (float element : marks) {
//            if (sum == element) {
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray) {
//            System.out.println("The value is present in the array");
//        } else {
//            System.out.println("The value is not present in the array");
//        }
//    }
//}