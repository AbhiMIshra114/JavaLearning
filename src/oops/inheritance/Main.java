package oops.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(3,4,2);
        Box box2 = new Box(box1);

//        System.out.println(box2.h);
//        System.out.println(box1.l + " " + box1.h + " " + box1.w);
//        BoxWeight box3 = new BoxWeight(3,4);
//        System.out.println(box3.weight + " " +box3.l + " " + box3.w);
        Box box3 = new BoxWeight(3,5);

    }
}
