import java.util.*;

public class samiteratorlink {
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<>();list.add("python");
        list.add("c");
        list.add("c++");
        list.add("html");
        list.add("css");
        list.add("javascript");
        list.add("sql");
        list.add("php");
        list.add("ruby");
        list.add("go");
        list.add("rust");
        list.add("swift");
        list.add("kotlin");
        list.add("scala");
        list.add("python");
        list.add("c");
        list.add("c++");
        list.add("html");
        list.add("css");
        list.add("javascript");
        list.add("sql");
        list.add("php");
        list.add("ruby");
        list.add("go");
        list.add("rust");
        list.add("swift");
        list.add("kotlin");
        list.add("scala");
        System.out.println("the list is "+list);
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            String s=itr.next();
            if(s.equals("python")){
            itr.remove();}
        }
        System.out.println(list);
    }
    
}
