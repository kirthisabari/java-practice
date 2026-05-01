class vehicle{
    String name;
    double price;
    vehicle(String name,double price){
        this.name=name;
        this.price=price;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Price : "+price);
        
}
class car extends vehicle{
    String brand;
    car(String brand, String name, double price){
        super(name,price);
        this.brand=brand;
    }
    void display(){
        System.out.println("Brand : "+brand);
        super.display();
        System.out.println();
    }
}

public class main{
    public static void main(String[] args){
     car c1=new car("BMW" ," XUV 700",300000);
     car c2=new car("audi","XUV 800",500000);
     c1.display();
     c2.display();
    }
}
