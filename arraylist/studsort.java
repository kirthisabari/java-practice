import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class stud {
    String name;
    int eng, mat, sci, tot;
    double avg;

    stud(String name, int eng, int mat, int tot) {
        this.name = name;
        this.eng = eng;
        this.mat = mat;
        this.sci = sci;
        calculate();

    }

    void calculate() {
        tot = eng + mat + sci;
        avg = tot / 3.0;
    }
}

public class Studsort {

    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char choice;
        ArrayList<stud> students=new ArrayList<>();
        do{
            System.out.println("Student Sorting System");
            System.out.println("1. Add Student");
            System.out.println("2. Display");
            System.out.println("3. Sort by Name");
            System.out.println("4. Sort by Total");
            System.out.println("5. Sort by Avg");
            System.out.println("6. Exit");
            System.out.println("Enter your choice : ");
            int ch=Integer.parseInt(br.readLine());
            switch(ch){
                case 1:
                    System.out.println("Add Student");
                    System.out.println("Name : ");
                    String name=br.readLine();
                    System.out.println("English : ");
                    int eng=Integer.parseInt(br.readLine());
                    System.out.println("Math : ");
                    int mat=Integer.parseInt(br.readLine());
                    System.out.println("Science : ");
                    int sci=Integer.parseInt(br.readLine());
                    students.add(new stud(name,eng,mat,sci));
                    System.out.println("Students Added Successfully");
                    break;
                
                 case 2:
                    System.out.println("Student MarkList ");
                    System.out.println("---------------------------------------------------------");
                    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s \n", "Name", "Eng", "Mat", "Sci",
                            "Tot", "Avg", "Res");
                    System.out.println("--------------------------------------------------------------------");
                    for (stud s : students) {
                        System.out.printf("%-10s", s.name);
                        System.out.printf("%-10d", s.eng);
                        System.out.printf("%-10d", s.mat);
                        System.out.printf("%-10d", s.sci);
                        System.out.printf("%-10d", s.tot);
                        System.out.printf("%-10.1f", s.avg);
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Sorting by name");
                    students.sort((s1,s2)->s1.name.compareTo(s2.name));
                    System.out.println("Sorted by name");
                    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s \n", "Name", "Eng", "Mat", "Sci",
                            "Tot", "Avg", "Res");
                    System.out.println("---------------------------------------------------------------------");
                    for (stud s : students) {
                        System.out.printf("%-10s", s.name);
                        System.out.printf("%-10d", s.eng);
                        System.out.printf("%-10d", s.mat);
                        System.out.printf("%-10d", s.sci);
                        System.out.printf("%-10d", s.tot);
                        System.out.printf("%-10.1f", s.avg);
                        System.out.println();
                    }
                    System.out.println("---------------------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("Sorting by total");
                    students.sort((s1,s2)->s2.tot-s1.tot);
                    System.out.println("Sorted by total");
                    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s \n", "Name", "Eng", "Mat", "Sci",
                            "Tot", "Avg", "Res");
                    System.out.println("---------------------------------------------------------------------");
                    for (stud s : students) {
                        System.out.printf("%-10s", s.name);
                        System.out.printf("%-10d", s.eng);
                        System.out.printf("%-10d", s.mat);
                        System.out.printf("%-10d", s.sci);
                        System.out.printf("%-10d", s.tot);
                        System.out.printf("%-10.1f", s.avg);
                        System.out.println();
                    }
                    System.out.println("---------------------------------------------------------------------");
                    break;
                case 5:
                    System.out.println("Sorting by avg");
                    students.sort((s1,s2)->Double.compare(s2.avg,s1.avg));
                    System.out.println("Sorted by avg");
                    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s \n", "Name", "Eng", "Mat", "Sci",
                            "Tot", "Avg", "Res");
                    System.out.println("---------------------------------------------------------------------");
                    for (stud s : students) {
                        System.out.printf("%-10s", s.name);
                        System.out.printf("%-10d", s.eng);
                        System.out.printf("%-10d", s.mat);
                        System.out.printf("%-10d", s.sci);
                        System.out.printf("%-10d", s.tot);
                        System.out.printf("%-10.1f", s.avg);
                        System.out.println();
                    }
                    System.out.println("---------------------------------------------------------------------");
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Do you want to continue");
            choice=br.readLine().charAt(0);
        }
        while(choice=='y'||choice=='Y');
        System.out.println("Exiting");

    }
}
