package oops.inheritance;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(3,4,2);
        Box box2 = new Box(box1);
        int num = 9779;
        String s = Integer.toString(num);
        char[] c = s.toCharArray();
        for (int i = 0; i<c.length;i++){
            if (c[i] == '7'){
                char temp = '9';
                c[i] = temp;
                break;
            }
        }
        int an = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < c.length; i++){
            ans.append(c[i]);
//            an+= (c[i] - '0');
        }
        int hel = Integer.parseInt(ans.toString());
        System.out.println(hel);

//        System.out.println(box2.h);
//        System.out.println(box1.l + " " + box1.h + " " + box1.w);
//        BoxWeight box3 = new BoxWeight(3,4);
//        System.out.println(box3.weight + " " +box3.l + " " + box3.w);
//        Box box3 = new BoxWeight(3,5);

//        Shapes obj = new Shapes();
//        Shapes obj2 = new Circle();
//        Circle circle= new Circle();
//        circle.area();
//        obj2.area();

    }
}
