package oops.inheritance;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
        super();
        this.weight = 5;
    }
    public BoxWeight(double side){
        super();
        this.weight = 5;
    }
    public BoxWeight(double side,double weight){
        super(side);
        this.weight = weight;
    }
}
