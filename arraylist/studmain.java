import java.io.*;
import java.util.*;

class Student {
    String name;
    int eng;
    int mat;
    int sci;
    String res;
    int tot;
    double avg;

    Student(String name, int eng, int mat, int sci, int tot, double avg, String res) {
        this.name = name;
        this.eng = eng;
        this.mat = mat;
        this.sci = sci;
        this.tot = tot;
        this.avg = avg;
        this.res = res;
    }
}

public class studmain {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char choice;
        boolean found = false;
        do {
            System.out.printf("%-20s\n", "Student Record");
            System.out.printf("1.add record\n");
            System.out.printf("2.display record\n");
            System.out.printf("3.search record\n");
            System.out.printf("4.delete record\n");
            System.out.printf("5.update record\n");
            System.out.printf("6.exit\n");
            System.out.println("Enter your choice :");
            int ch = Integer.parseInt(br.readLine());
            switch (ch) {
                case 1:
                    System.out.println("Add New Student");
                    System.out.println("Enter name");
                    String name = br.readLine();
                    System.out.println("Enter English marks");
                    int eng = Integer.parseInt(br.readLine());
                    System.out.println("Enter Maths marks");
                    int mat = Integer.parseInt(br.readLine());
                    System.out.println("Enter Science marks");
                    int sci = Integer.parseInt(br.readLine());
                    int tot = eng + mat + sci;
                    double avg = tot / 3.0;
                    String res;
                    if (avg > 60) {
                        res = "PASS";
                    } else {
                        res = "FAIL";
                    }
                    students.add(new Student(name, eng, mat, sci, tot, avg, res));
                    System.out.println("Student record added successfully");
                    break;
                case 2:
                    System.out.println("Student MarkList ");
                    System.out.println("---------------------------------------------------------");
                    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s \n", "Name", "Eng", "Mat", "Sci",
                            "Tot", "Avg", "Res");
                    System.out.println("--------------------------------------------------------------------");
                    for (Student s : students) {
                        System.out.printf("%-10s", s.name);
                        System.out.printf("%-10d", s.eng);
                        System.out.printf("%-10d", s.mat);
                        System.out.printf("%-10d", s.sci);
                        System.out.printf("%-10d", s.tot);
                        System.out.printf("%-10.1f", s.avg);
                        System.out.printf("%-10s", s.res);
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Searching records");
                    System.out.println("Enter name to search : ");
                    String srcname = br.readLine();
                    found = false;
                    for (Student s : students) {
                        if (s.name.equals(srcname)) {
                            System.out.println("Record Found");
                            System.out.println("Name : " + s.name);
                            System.out.println("English : " + s.eng);
                            System.out.println("Maths : " + s.mat);
                            System.out.println("Science : " + s.sci);
                            System.out.println("Total : " + s.tot);
                            System.out.println("Average : " + s.avg);
                            System.out.println("Result : " + s.res);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Record not found");
                    }
                    break;
                case 4:
                    System.out.println("Deleting records");
                    System.out.println("Enter name to delete : ");
                    String delname = br.readLine();
                    found = false;
                    Iterator<Student> it = students.iterator();

                    while (it.hasNext()) {

                        Student s = it.next();

                        if (s.name.equals(delname)) {

                            it.remove();

                            System.out.println("Record deleted successfully");

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Record not found");
                    }
                    break;
                case 5:
                    System.out.println("Updating records");
                    System.out.println("Enter name to update : ");
                    String upname = br.readLine();
                    found = false;
                    for (Student s : students) {
                        if (s.name.equals(upname)) {
                            System.out.println("Record Found");
                            System.out.println("Which details you want to update : ");
                            String upfield = br.readLine();
                            if (upfield.equals("name")) {
                                System.out.println("Enter new name : ");
                                String newname = br.readLine();
                                s.name = newname;
                            } else if (upfield.equals("eng")) {
                                System.out.println("Enter new english marks : ");
                                int neweng = Integer.parseInt(br.readLine());
                                s.eng = neweng;
                            } else if (upfield.equals("mat")) {
                                System.out.println("Enter new maths marks : ");
                                int newmat = Integer.parseInt(br.readLine());
                                s.mat = newmat;
                            } else if (upfield.equals("sci")) {
                                System.out.println("Enter new science marks : ");
                                int newsci = Integer.parseInt(br.readLine());
                                s.sci = newsci;
                            }
                            s.tot = s.eng + s.mat + s.sci;
                            s.avg = s.tot / 3.0;

                            if (s.avg > 60) {
                                s.res = "PASS";
                            } else {
                                s.res = "FAIL";
                            }
                            System.out.println("Record updated successfully");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Record not found");
                    }
                    break;
                case 6:
                    System.out.println("6.Exit");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

            System.out.println("Do you want to continue : ");
            choice = br.readLine().charAt(0);

        } while (choice == 'y' || choice == 'Y');

    }
}
