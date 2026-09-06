import java.io.*;
import java.util.HashMap;
import java.util.Map;

class student{
    int m1,m2,m3,id;
    String name;
    int total;
    double avg;
    String res;
    public student(int id,String name,int m1,int m2,int m3){
        this.id=id;
        this.name=name;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.calculate();
    }
    final void calculate(){
        this.total=this.m1+this.m2+this.m3;
        this.avg=this.total/3.0;
        this.res=(this.avg>=40)? "PASS" : "FAIL";
    }

    void display(){
        System.out.println("Student MarkList");
        System.out.println("ID : "+id+"\n"+"Name : "+name+"\n"+"Tamil : "+m1+"\n"+"English : "+m2+"\n"+"Maths : "+m3+"\n"+"Total : "+total+"\n"+"Average : "+avg+"\n"+"Result : "+res);
    }
 }

public class studmapp{
    
    


      void Marklistdisplay(HashMap<Integer,student> studmap){
        System.out.printf("%-5s %-10s %-5s %-5s %-5s %-5s %-5s %-5s\n",
            "ID","Name","TAMIL","ENGLISH","MATHS","TOTAL","AVG","RESULT");
        System.out.println("-----------------------------------------------------");

        for(Map.Entry<Integer, student> entry:studmap.entrySet()){
            student s=entry.getValue();
            System.out.printf("%-5d %-10s %-5d %-5d %-5d %-5d %-7.1f %-10s\n",
                s.id,
                s.name,
                s.m1,
                s.m2,
                s.m3,
                s.total,
                s.avg,
                s.res);
        }
       System.out.println("-----------------------------------------------------");
     
     }

    public static void main(String[]  args) throws IOException{
        HashMap<Integer, student> studmap=new HashMap<>();
        studmapp studobj=new studmapp();
        char option;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        do { 
            System.out.println("Student Record Management");
            System.out.println("1. New Student");
            System.out.println("2. Display Records");
            System.out.println("3. Update Record");
            System.out.println("4. Remove Record");
            System.out.println("5. Exit");
            System.out.println("Enter your option : ");
            int choice=Integer.parseInt(br.readLine());
            try {
                switch(choice){
                    case 1:
                        char opt;
                        do { 
                            System.out.println("Add New Student");
                            System.out.println("----------------");
                            System.out.println("Enter Student Id : ");
                            int id=Integer.parseInt(br.readLine());
                            System.out.println("Student Name : ");
                            String name=br.readLine();
                            System.out.println("Tamil Marks : ");
                            int tam=Integer.parseInt(br.readLine());
                            System.out.println("English Marks : ");
                            int eng=Integer.parseInt(br.readLine());
                            System.out.println("Maths Marks : ");
                            int mat=Integer.parseInt(br.readLine());
                            studmap.put(id,new student(id,name,tam,eng,mat));
                            studmap.get(id).display();
                            System.out.println("Student Added successfully");
                            System.out.println("Do you want to add More Student? (y/n) : ");
                            opt=br.readLine().charAt(0);
                        } while (opt=='y'||opt=='Y');
                        break;
                    case 2:
                        studobj.Marklistdisplay(studmap);
                        break;
                    case 3:
                        System.out.println("Record Updation");
                        char uptopt;
                        do{
                            System.out.println("Enter id to update : ");
                            int updateid=Integer.parseInt(br.readLine());
                            if(studmap.containsKey(updateid)){
                                System.out.println("Student Found");
                                student updatestud=studmap.get(updateid);
                                char updatechoiceopt;
                                do { 
                                    System.out.println("1.Update name");
                                    System.out.println("2. Update Marks");
                                    System.out.println("3. Exit");
                                    System.out.println("Enter your option : ");
                                    int updatechoice=Integer.parseInt(br.readLine());
                                    switch(updatechoice){
                                        case 1:
                                            System.out.println("Enter Name to update : ");
                                            String newname=br.readLine();
                                            updatestud.name=newname;
                                            studmap.put(updateid,updatestud);
                                            updatestud.display();
                                            break;

                                        case 2:
                                            char updatemarksopt;
                                            do{
                                                System.out.println("Enter Subject to update :");
                                                System.out.println("1. Tamil");
                                                System.out.println("2. English");
                                                System.out.println("3. Maths");
                                                System.out.println("4. Exit");
                                                System.out.println("Enter your option : ");
                                                int updatemarksch=Integer.parseInt(br.readLine());
                                                switch(updatemarksch){
                                                    case 1:
                                                        System.out.println("Enter New Tamil Marks : ");
                                                        int newtam=Integer.parseInt(br.readLine());
                                                        updatestud.m1=newtam;
                                                        updatestud.calculate();
                                                        studmap.put(updateid,updatestud);
                                                        updatestud.display();
                                                        break;
                                                    case 2:
                                                        System.out.println("Enter New English Marks : ");
                                                        int neweng=Integer.parseInt(br.readLine());
                                                        updatestud.m2=neweng;
                                                        updatestud.calculate();
                                                        studmap.put(updateid,updatestud);
                                                        updatestud.display();
                                                        break;
                                                    case 3:
                                                        System.out.println("Enter New Maths Marks : ");
                                                        int newmat=Integer.parseInt(br.readLine());
                                                        updatestud.m3=newmat;
                                                        updatestud.calculate();
                                                        studmap.put(updateid,updatestud);
                                                        updatestud.display();
                                                        break;
                                                    case 4:
                                                        System.out.println("Exit...");
                                                        break;
                                                    default:
                                                        System.out.println("Invalid Option : ");
                                                        break;
                                                }
                                                System.out.println("Do you want change any other marks(y/n) :");
                                                updatemarksopt=br.readLine().charAt(0);
                                            }while(updatemarksopt=='y'||updatemarksopt=='Y');

                                            break;
                                    }

                                    System.out.println("Do you want to update any other details? (y/n) :");
                                    updatechoiceopt=br.readLine().charAt(0);
                                } while (updatechoiceopt=='y'|| updatechoiceopt=='Y');

                            }
                            else{
                                System.out.println("Student Not Found : ");
                            }

                            System.out.println("Do you want to update another record? (y/n) :");
                            uptopt=br.readLine().charAt(0);
                        }while(uptopt=='y'||uptopt=='Y');

                        break;
                        case 4:
                            System.out.println("Record Deletion");
                            System.out.println("Enter id to Delete : ");
                            int deleteid=Integer.parseInt(br.readLine());
                            if(studmap.containsKey(deleteid)){
                                student delstud=studmap.get(deleteid);
                                delstud.display();
                                studmap.remove(deleteid);
                                System.out.println("Student Record Deleted");
                                studobj.Marklistdisplay(studmap);
                            }
                            else{
                                System.out.println("Student Not Found : ");
                            }
                            break;
                        case 5:
                            System.out.println("Exit...");
                            break;
                        default:
                            System.out.println("Invalid Option : ");
                            break;
                }
                
            } 
            catch(NumberFormatException e){
                    System.out.println("Invalid input! Please enter a valid number.");
            }
            catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
            System.out.println("Do you want to continue main menu? (y/n) :");
            option=br.readLine().charAt(0);
        } while (option=='y'|| option=='Y');



        }
 }
