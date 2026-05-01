class Employee{
    void salary(){
        System.out.println("Salary is "+20000);
      }
}
 class Manager extends Employee{
    void salary(){
        System.out.println("Manager salary is :50000 ");
        
    }

 }

 class peon extends Employee{
    void salary(){
        System.out.println("Peon salary is :5000 ");
    }

    void display(){
      System.out.println("This is Employee peon class");
    }
 }
 
 public class main{
    public static void main(String[] args){
      Employee e1=new Manager();
      Employee e2=new peon();
      e1.salary();
      e2.salary();
      
    }
 }
 
