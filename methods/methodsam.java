import java.io.*;

class fnClass{
    public void addoreven(int a){
       if(a%2==0){
        System.out.println(a+" is even number");
       }
       else{
        System.out.println(a+" is odd number ");
       }
    }
    public void greatest(int a, int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else{
            System.out.println(b+" is greater than "+a);
        }
    }
    public void greatest(int a,int b,int c){
        if(a>b&&a>c){
            System.out.println(a+" is greater than "+b+" & "+c);
        }
        else if (b>a&&b>c) {
            System.out.println(b+" is greater than "+a+" & "+c);
            
        }
        else{
            System.out.println(c+" is greater than "+a+" & "+b);
        }
    }
}
public class methodsam{
    public BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
    public int mainfn()throws IOException{
         System.out.println("Maths operations");
        System.out.println("1. Odd or Even");
        System.out.println("2. Greatest among Two number");
        System.out.println("3. Greatest among Three number");
        System.out.println("Enter your choice : ");
        int c=Integer.parseInt(br1.readLine());
        return c;
    }
    public static void main(String[] args) throws IOException{
        fnClass fn=new fnClass();
        methodsam ms=new methodsam();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char choice;
        do{
            int x=ms.mainfn();
           switch (x) {
            case 1:
                System.out.println("Add or Even");
                System.out.println("Enter number : ");
                int a=Integer.parseInt(br.readLine());
                fn.addoreven(a);
                break;
            case 2:
                System.out.println("Greatest Among 2 number");
                System.out.println("Enter number 1 : ");
                int a1=Integer.parseInt(br.readLine());
                System.out.println("Enteer number 2 : ");
                int a2=Integer.parseInt(br.readLine());
                fn.greatest(a1, a2);
                break;
            case 3:
                System.out.println("Greaest Among 3 Number");
                System.out.println("Enter Number1 : ");
                int n1=Integer.parseInt(br.readLine());
                System.out.println("Enter Number2 : ");
                int n2=Integer.parseInt(br.readLine());
                System.out.println("Enter Number3 : ");
                int n3=Integer.parseInt(br.readLine());
                fn.greatest(n1, n2, n3);
                break;
            default:
                System.out.println("Invalid choice");
                break;
         } 
         System.out.println("Do you want to continue : ");
         choice=br.readLine().charAt(0);

        }while(choice=='y'|| choice=='Y');
        System.out.println("Thank you");
        
    }
} 
