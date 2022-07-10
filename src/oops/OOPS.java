package oops;

public class OOPS {
    public static void main(String[] args) {
        Student abhi = new Student();
//        System.out.println(abhi.name);

        final Student rahul = new Student();
        rahul.name = "Rahul";
        System.out.println(rahul.name);


    }
    public static void message(){
        System.out.println("I am awesome");
    }
}
class Student{
    int rno;
    String name;
    float marks;
    Student(){
        this(45,"Mishra",20.4f);
    }
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}

