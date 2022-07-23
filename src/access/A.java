package access;

import java.util.Arrays;
import java.util.Objects;

public class A {
    public int num;
    String name;
    int[] arr;



    @Override
    public int hashCode() {
        return num;
    }

    public int getNum() {
        System.out.println(num);
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[34];
    }

}
