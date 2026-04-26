package strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class stringbuild {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char choice;
        do{
            System.out.println("String Operations");
            System.out.println("1. Palindrome");
            System.out.println("2. Reverse");
            System.out.println("3. Length of the string");
            System.out.println("4. Count Vowels");
            System.out.println("5. String Append");
            System.out.println("6. Adding special character");
            System.out.println("Enter your choice : ");
            int ch = Integer.parseInt(br.readLine());
            switch(ch){
                case 1:
                    System.out.println("String Palindrome");
                    System.out.println("Enter String : ");
                    String str=br.readLine();
                    StringBuilder reversestr=new StringBuilder(str);
                    reversestr.reverse();
                    System.out.println("Reversed String : "+reversestr);
                    if(reversestr.toString().equalsIgnoreCase(str)){
                        System.out.println("Given String is palindrome");
                    }                    else{
                        System.out.println("Given String not palindrome");
                    }
                    
                   break; 
                case 2:
                    System.out.println("String Reverse");
                    System.out.println("Enter String to Reversed");
                    String s2=br.readLine();
                    StringBuilder sb=new StringBuilder(s2);
                    sb.reverse();
                    System.out.println("Reversed String is : "+sb);
                    break;
                case 3:
                    System.out.println("Length of the string");
                    System.out.println("Enter String to find length");
                    String s3=br.readLine();
                    System.out.println("Length of the string is : "+s3.length());
                    break;
                case 4:
                    System.out.println("Count Vowels");
                    System.out.println("Enter String to count vowels");
                    String s4=br.readLine();
                    int vowels=0;
                    for(int i=0;i<s4.length();i++){
                        char c=s4.charAt(i);
                        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                            vowels++;
                        }
                    }
                    if(vowels>0){
                        System.out.println("Number of vowels : "+vowels);

                    }else{
                        System.out.println("No vowels found");
                    }

                    break;
                case 5:
                    System.out.println("String Append");
                    System.out.println("Enter String : ");
                    String s5=br.readLine();
                    StringBuilder sb1=new StringBuilder(s5);
                    System.out.println("Enter String to Append");
                    String s6=br.readLine();
                    sb1.append(s6);
                    System.out.println("Appended String is : "+sb1);
                    break;
                case 6:
                    System.out.println("Adding Special Character");
                    System.out.println("Enter String : ");
                    String s7=br.readLine();
                    System.out.println("Enter the character to add : ");
                    char addc=br.readLine().charAt(0);
                    StringBuilder result=new StringBuilder();
                    for(int i=0;i<s7.length();i++){
                        result.append(s7.charAt(i));
                        if(i!=s7.length()-1)
                        {
                            result.append(addc);
                        }
                    }
                    System.out.println("String with added character : "+result.toString());
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;


            }
            System.out.println("Do you want to continue : ");
            choice=br.readLine().charAt(0);
        }while(choice=='y'||choice=='Y');
        System.out.println("Thank you");

    }

}