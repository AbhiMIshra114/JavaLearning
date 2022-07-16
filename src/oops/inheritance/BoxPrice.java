package oops.inheritance;

public class BoxPrice extends BoxWeight{
    double price;
    BoxPrice(double side, double price){
        super(side);
        this.price = price;
    }
}
