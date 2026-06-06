import java.io.*;
import java.util.HashMap;
import java.util.Map;

class Student{
    int id;
    String name;
    int m1,m2,m3,total;
    double avg;
    String res;

    Student(int id, String name,int m1,int m2,int m3){
        this.id = id;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;   
        this.m3 = m3;
        this.total = m1 + m2 + m3;
        this.avg = total / 3.0;
        if(avg>=40){
            this.res = "PASS";
        }
        else{
            this.res = "FAIL";
        }

    }
}
public class main {
    public void display(Student s){
        System.out.println("ID: "+s.id);
        System.out.println("Name: "+s.name);
        System.out.println("English: "+s.m1+" \n Maths: "+s.m2+" \nScience: "+s.m3);
        System.out.println("Total: "+s.total);
        System.out.println("Average: "+s.avg);
    }
    public void MarklistDisplay(HashMap<Integer,Student> studentMap){
         System.out.println(
        "----------------------------------------------------------------");

        System.out.printf(
        "%-5s %-10s %-5s %-5s %-5s %-5s %-7s %-10s\n",
        "ID","NAME","ENG","MAT",
        "SCI","TOT","AVG","RESULT");

        System.out.println(
        "----------------------------------------------------------------");
        for(Map.Entry<Integer, Student> entry : studentMap.entrySet()){
            Student s=entry.getValue();
            System.out.printf(
            "%-5d %-10s %-5d %-5d %-5d %-5d %-7.1f %-10s\n",

            s.id,
            s.name,
            s.m1,
            s.m2,
            s.m3,
            s.total,
            s.avg,
            s.res);
        }

        System.out.println(
        "----------------------------------------------------------------");
    }

    public static void main(String[] args) throws IOException{
        HashMap<Integer, Student> studentMap = new HashMap<>();
       main obj = new main();
        char option;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         do{
                System.out.println("Student Record");
                System.out.println("1. Add Student");
                System.out.println("2. Display Marklist");
                System.out.println("3. Update Student Record");
                System.out.println("4. Delete Student Record");
                System.out.println("5. Exit");
                System.out.println("Enter Your Choice: ");
                int choice = Integer.parseInt(br.readLine());
                try{
                    switch(choice){
                        case 1:
                            System.out.println("Enter Student Id : ");
                            int id =Integer.parseInt(br.readLine());
                            System.out.println("Enter Student Name : ");
                            String name = br.readLine();
                            System.out.println("Enter Marks in English : ");    
                            int m1 = Integer.parseInt(br.readLine());
                            System.out.println("Enter Marks in Maths : ");
                            int m2 = Integer.parseInt(br.readLine());
                            System.out.println("Enter Marks in Science : ");
                            int m3 = Integer.parseInt(br.readLine());
                            studentMap.put(id,new Student(id, name, m1, m2, m3));
                            Student news= studentMap.get(id);
                            obj.display(news);
                            break;
                        case 2:
                            
                            obj.MarklistDisplay(studentMap);
                            break;                        
                        case 3:
                            System.out.println("Enter Student ID to update : ");
                            int updateId = Integer.parseInt(br.readLine());
                            if(studentMap.containsKey(updateId)){
                                System.out.println("1. Update Name");
                                System.out.println("2. Update Marks");
                                System.out.println("Enter Your Choice : ");
                                int updateChoice = Integer.parseInt(br.readLine());
                                Student s= studentMap.get(updateId);
                                switch(updateChoice){
                                    case 1:
                                        System.out.println("Enter New Name : ");
                                        String newName = br.readLine();
                                        s.name=newName;
                                         obj.display(s);
                                        break;
                                    case 2:
                                        System.out.println("Enter Subject to Update (1. English, 2. Maths, 3. Science) : ");
                                        int subjectChoice = Integer.parseInt(br.readLine());
                                        System.out.println("Enter New Marks : ");
                                        int newMarks = Integer.parseInt(br.readLine());
                                        switch(subjectChoice){
                                            case 1:
                                                s.m1 = newMarks;
                                                break;
                                            case 2:
                                                s.m2 = newMarks;
                                                break;
                                            case 3:
                                                s.m3 = newMarks;
                                                break;
                                        }
                                        s.total = s.m1 + s.m2 + s.m3;
                                        s.avg = s.total / 3.0;
                                        s.res = (s.avg >= 40) ? "PASS" : "FAIL";
                                         obj.display(s);
                                    break;
                                }
                            }
                            else{
                                System.out.println("Student ID not found!");
                            }
                            break;
                        case 4:
                            System.out.println("Enter Student ID to delete : ");
                            int deleteId = Integer.parseInt(br.readLine());
                            if(studentMap.containsKey(deleteId)){
                                studentMap.remove(deleteId);
                                System.out.println("Student record deleted successfully.");
                            }
                            else{
                                System.out.println("Student ID not found!");
                            }
                            break;
                        case 5:
                            System.out.println("Exiting...");
                            return; 
                        default:
                            System.out.println("Invalid Choice! Please try again.");    

                    }
                }
                catch(NumberFormatException e){
                    System.out.println("Invalid input! Please enter a valid number.");
                }
                catch(Exception e){
                    System.out.println("An error occurred: " + e.getMessage());
                }
            System.out.println("Do you want to continue? (Y/N) : ");
            option = br.readLine().charAt(0);
        }while(option=='Y'||option=='y');
    }
}

    

