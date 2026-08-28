import java.io.*;
import java.util.*;

class Student{
    int id;
    int tam,eng,mat,sci,ss,tot;
    double avg;
    String name;
    String res;

    Student(int id,int tam,int eng,int mat,int sci,int ss,String name){
        this.id=id;
        this.tam=tam;
        this.eng=eng;
        this.mat=mat;
        this.sci=sci;
        this.ss=ss;
        this.name=name;
        this.tot=tam+eng+mat+sci+ss;
        this.avg=(double)this.tot/5.0;
        if(this.avg>=40){
            this.res="pass";
        }
        else{
            this.res="fail";
        }
        
    }
    void display(){
        
        System.out.println("Name : "+name);
        System.out.println("Tamil : "+tam);
        System.out.println("English : "+eng);
        System.out.println("Maths : "+mat);
        System.out.println("Science : "+sci);
        System.out.println("Social Science : "+ss);
        System.out.println("Total : "+tot);
        System.out.println("Average : "+avg);
        System.out.println("Result : "+res);
    }

    

}
    
public class studmain {
    public static void main(String[] args)throws IOException{
        BufferedReader bs=new BufferedReader(new InputStreamReader(System.in));
        HashSet<Student> hs=new HashSet<>();
        char ch1;
        char ch;
        do { 
            System.out.println("Student Management System");
            System.out.println("1.New Student");
            System.out.println("2.Display Records");
            System.out.println("3. Update the record");
            System.out.println("4. Remove the Record");
            System.out.println("5. Search Record");
            System.out.println("6. Sort Record");
            System.out.println("7. Exit");
            System.out.println("Enter your Choice : ");
           int choice=Integer.parseInt(bs.readLine());
           switch(choice){
            case 1 -> {
                System.out.println("Enter Student Details");
                System.out.println("Enter id : ");
                int id=Integer.parseInt(bs.readLine());
                System.out.println("Name : ");
                String name=bs.readLine();
                System.out.println("Tamil : ");
                int tam=Integer.parseInt(bs.readLine());
                System.out.println("English : ");
                int eng=Integer.parseInt(bs.readLine());
                System.out.println("Maths : ");
                int mat=Integer.parseInt(bs.readLine());
                System.out.println("Science : ");
                int sci=Integer.parseInt(bs.readLine());
                System.out.println("Social Science : ");
                int ss=Integer.parseInt(bs.readLine());
                Student s=new Student(id,tam,eng,mat,sci,ss,name);
                hs.add(s);
                System.out.println("Student Added Successfully");
            }
            case 2 -> {
                System.out.println("STUDENT RECORDS");
                if(hs.isEmpty()){
                    System.out.println("No Records");
                }
                else{
                    System.out.println("ID\tNAME\t\tTAM\tENG\tMAT\tSCI\tSS\tTOT\tAVG\tRES");
                    for(Student stud:hs){
                        System.out.println(stud.id+"\t"+stud.name+"\t\t"+stud.tam+"\t"+stud.eng+"\t"+stud.mat+"\t"+stud.sci+"\t"+stud.ss+"\t"+stud.tot+"\t"+stud.avg+"\t"+stud.res);
                    }
                }
            }
            case 3 -> {
                System.out.println("Student update");
                System.out.println("Enter Student name to update : ");
                String upname=bs.readLine();
                boolean found = false;
                for(Student st : hs){
                    if(st.name.equals(upname)){
                        found = true;
                        break;
                    }
                }
                if(found){
                 System.out.println("1.Update name");
                 System.out.println("2. Update marks");
                 System.out.println("Enter your option : ");
                 int op=Integer.parseInt(bs.readLine());
                 switch(op){
                    case 1 -> {
                        System.out.println("Enter new name : ");
                        String newname=bs.readLine();
                        for(Student stud : hs){
                            if(stud.name.equals(upname))
                            stud.name=newname;
                        }
                    }
                    case 2 -> {
                        System.out.println("Which mark you want to update(tam,eng,mat,sci,ss) : ");
                          do { 
                            System.out.println("1.Tamil ");
                            System.out.println("2. English");
                            System.out.println("3. Maths");
                            System.out.println("4.Sciene");
                            System.out.println("5. SocialScience");
                            System.out.println("6. Exit");
                            System.out.println("Enter your option : ");
                            int opt=Integer.parseInt(bs.readLine());
                            switch(opt){
                                case 1 -> { 
                                System.out.println("Enter new Tamil marks : ");
                                int newtam=Integer.parseInt(bs.readLine());
                                for(Student stam: hs){
                                    if(stam.name.equals(upname)){
                                        stam.tam=newtam;
                                        stam.tot=stam.tam+stam.eng+stam.mat+stam.sci+stam.ss;
                                        stam.avg=(double)stam.tot/5.0;
                                        if(stam.avg>=40){
                                            stam.res="pass";
                                        }
                                        else{
                                            stam.res="fail";
                                        }
                                        System.out.println("updated successufuly");
                                        break;
                                    }
                                }
                                }
                                case 2 -> {
                                        System.out.println("Enter new English marks : ");
                                        int neweng=Integer.parseInt(bs.readLine());
                                        for(Student steng: hs){
                                            if(steng.name.equals(upname)){
                                                steng.eng=neweng;
                                                steng.tot=steng.tam+steng.eng+steng.mat+steng.sci+steng.ss;
                                                steng.avg=(double)steng.tot/5.0;
                                                if(steng.avg>=40){
                                                    steng.res="pass";
                                                }
                                                else{
                                                    steng.res="fail";
                                                }
                                                System.out.println("updated successufuly");
                                                break;
                                            }
                                        }
                                }
                                case 3 -> {
                                        System.out.println("Enter new Maths marks : ");
                                        int newmat=Integer.parseInt(bs.readLine());
                                        for(Student stmat: hs){
                                            if(stmat.name.equals(upname)){
                                                stmat.mat=newmat;
                                                stmat.tot=stmat.tam+stmat.eng+stmat.mat+stmat.sci+stmat.ss;
                                                stmat.avg=(double)stmat.tot/5.0;
                                                if(stmat.avg>=40){
                                                    stmat.res="pass";
                                                }
                                                else{
                                                    stmat.res="fail";
                                                }
                                                System.out.println("updated successufuly");
                                                break;
                                            }
                                        }
                                }
                                case 4 -> {
                                        System.out.println("Enter new Science marks : ");
                                        int newsci=Integer.parseInt(bs.readLine());
                                        for(Student stsci: hs){
                                            if(stsci.name.equals(upname)){
                                                stsci.sci=newsci;
                                                stsci.tot=stsci.tam+stsci.eng+stsci.mat+stsci.sci+stsci.ss;
                                                stsci.avg=(double)stsci.tot/5.0;
                                                if(stsci.avg>=40){
                                                    stsci.res="pass";
                                                }
                                                else{
                                                    stsci.res="fail";
                                                }
                                                System.out.println("updated successufuly");
                                                break;
                                            }
                                        }
                                }
                                case 5 -> {
                                        System.out.println("Enter new Social Science marks : ");
                                        int newss=Integer.parseInt(bs.readLine());
                                        for(Student stss: hs){
                                            if(stss.name.equals(upname)){
                                                stss.ss=newss;
                                                stss.tot=stss.tam+stss.eng+stss.mat+stss.sci+stss.ss;
                                                stss.avg=(double)stss.tot/5.0;
                                                if(stss.avg>=40){
                                                    stss.res="pass";
                                                }
                                                else{
                                                    stss.res="fail";
                                                }
                                                System.out.println("updated successufuly");
                                                break;
                                            }
                                        }
                                }
                                case 6 -> System.out.println("Exit");
                                default -> System.out.println("Invalid option");
                            } 
                            System.out.println("\n");
                            for(Student s1:hs){
                                s1.display();
                            }  
                            System.out.println("Do you want to update another option(y/n): ");
                            ch1=bs.readLine().charAt(0);
        
                          } while(ch1=='y'||ch1=='Y'); 

                        } // end case 2
                 } // end switch(op)  
                } // end if(found)
                else{
                    System.out.println("Record not found");
                }
            }
            case 4 -> {
                    System.out.println("Delete Record");
                    System.out.println("Enter student name to be delete : ");
                    String delname=bs.readLine();
                    boolean founddel=false;
                    Iterator<Student> itrstud=hs.iterator();
                    while(itrstud.hasNext()){
                        Student stdel=itrstud.next();
                        if(stdel.name.equals(delname)){
                            itrstud.remove();
                            System.out.println(delname+" Deleted Successfully");
                            founddel=true;
                            break;
                        }
                    }
                    
                    if(founddel==false){
                        System.out.println("Record not found");
                    }                    
            }
            case 5 -> {
                    System.out.println("Retrive Student Records");
                    System.out.println("Enter Student name to search : ");
                    String searchname=bs.readLine();
                    boolean searchfound=false;
                    for(Student searchstud : hs){
                        if(searchstud.name.equals(searchname)){
                            searchfound=true;
                            searchstud.display();
                            break; 
                        }
                    }
                    if(searchfound==false){
                        System.out.println("Record not found");
                    }                
            }
            case 6 -> {
                System.out.println("Sort the Student based on the Average Mark in Descending Order");
                List<Student> list = new ArrayList<>(hs);
                list.sort((s1, s2) -> Double.compare(s2.avg, s1.avg));
                if (list.isEmpty()) {
                    System.out.println("No Records");
                } else {
                    System.out.println("ID\tNAME\tTAM\tENG\tMAT\tSCI\tSS\tTOT\tAVG\tRES");
                    for (Student stud : list) {
                        System.out.println(stud.id + "\t" + stud.name + "\t" + stud.tam + "\t" + stud.eng + "\t" + stud.mat + "\t" + stud.sci + "\t" + stud.ss + "\t" + stud.tot + "\t" + stud.avg + "\t" + stud.res);
                    }
                }
            }
            case 7 -> System.out.println("Exit");
            default -> System.out.println("Invalid option");
        } 
        System.out.println("Do you want to continue (y/n): ");
        ch = bs.readLine().charAt(0);
    }while (ch=='y'||ch=='Y');
        
         
        
        


        


    }
}
