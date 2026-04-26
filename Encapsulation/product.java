import java.io.*;

class setClass{

    private String name;
    private double price;

public void setName(String name){
    this.name=name;   

}

public void setPrice(double price){
    if(price>0){
        this.price=price;
    }
    else{
        System.out.println("Invalid Price");
    }
}
public String getName(){
    return name;
}
public double getPrice(){
    return price;
}
}
public class product{
    public static void main(String[] args)throws IOException{
        setClass p1=new setClass();
        setClass p2=new setClass();
        p1.setName("laptop");
        p1.setPrice(25000.0);
        p2.setName("mobile");
        p2.setPrice(5000.0);
        System.out.println("Name : "+p1.getName());
        System.out.println("Price : "+p1.getPrice());
        System.out.println("Name : "+p2.getName());
        System.out.println("Price : "+p2.getPrice());
        


    }
}
