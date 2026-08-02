import java.util.LinkedList;

public class samlink {
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<>();
        list.add("Kirthi");
        list.add("Sabari");
        list.add("Dhanya");
        System.out.println(list);
        list.addFirst("Nithya");
        list.add(2,"Nithilan");
        System.out.println(list);
        System.out.println("Get(1) : "+list.get(1));
        System.out.println("GetFirst() : "+list.getFirst());
        System.out.println("GetLast() : "+list.getLast());
        }
    
}
