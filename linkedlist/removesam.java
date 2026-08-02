import java.util.LinkedList;
public class removesam {
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<>();
        list.add("Kirthi");
        list.add("Sabari");
        list.add("Dhanya");
        list.add("Nithilan");
        list.add("Nithya");
        list.add("Nithilan");
        list.add("Nithya");
        list.add("Dhanya");
        System.out.println("Before : "+list);
        list.removeFirst();
        System.out.println("List Size at Before Removing : "+list.size());
        System.out.println("After removing first element : "+list);
        list.removeLast();
        System.out.println("After removing last element : "+list);
        list.remove(1);
        System.out.println("After removing element at index 1 : "+list);
        list.removeFirstOccurrence("Nithilan");
        System.out.println("After removing first occurrence of Nithilan : "+list);
        list.removeLastOccurrence("Nithya");
        System.out.println("After removing last occurrence of Nithya : "+list);
        System.out.println("Size : "+list.size());
        list.clear();
        System.out.println("After removing all elements : "+list);
        System.out.println("Size : "+list.size());
        System.out.println("Is empty : "+list.isEmpty());
        list.add("Kirthi");
        list.add("Sabari");
        list.add("Dhanya");
        list.add("Nithilan");
        list.add("Nithya");
        list.add("Nithilan");
        list.add("Nithya");
        list.add("Dhanya");
        System.out.println("Size : "+list.size());
        System.out.println("Is empty : "+list.isEmpty());
    }
    
}
