import java.util.LinkedList;
import java.util.ListIterator;
public class samlistitr{
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<>();
        list.add("kirthi");
        list.add("sabari");
        list.add("dhanya");
        list.add("nithilan");
        list.add("nithya");
        list.add("nithilan");
        list.add("nithya");
        list.add("dhanya");
        
        ListIterator<String> itr=list.listIterator();
        System.out.println("------------------------------------------");
        System.out.println("Forward traversal : ");
        while(itr.hasNext()){
            System.out.println(itr.next());
        } 
        System.out.println("------------------------------------------");
        System.out.println("Backward traversal : ");
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
        System.out.println("------------------------------------------");
        System.out.println("Remove Nithilan Elements from list : ");
        while(itr.hasNext()){
            if(itr.next().equals("nithilan")){
                itr.remove();
            }
        }
        System.out.println("After Remove : "+list);  
        ListIterator<String> itr1=list.listIterator();
        System.out.println("Replace dhanya elements into list : ");
        while(itr1.hasNext()){
            if(itr1.next().equals("dhanya")){
                itr1.set("dhanyasabari");
                
            }
        }
        System.out.println("After Replace dhanya : "+list);
        ListIterator<String> itr3=list.listIterator();
        while(itr3.hasNext()){
            if(itr3.next().equals("kirthi")){
                itr3.add("Sabari");
            }
        }
        System.out.println("After add Sabari : "+list);





        


        
    }
}
