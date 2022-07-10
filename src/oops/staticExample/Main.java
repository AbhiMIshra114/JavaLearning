package oops.staticExample;

public class Main {
    public static void main(String[] args) {
        Human abhi = new Human(19,"Abhisekh",2000,false);
        Human rahul = new Human(34,"Rahul",1500,true);

//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        Main ob = new Main();
//        ob.fun();
        String[] s = {"flower","flow","flight"};
        String prefix = s[0];
        System.out.println(s[1].indexOf(prefix));

    }
    static void greeting(){
        Main obj = new Main();
        obj.fun();

    }

    void fun() {
        System.out.println("this is funny");
    }
}
