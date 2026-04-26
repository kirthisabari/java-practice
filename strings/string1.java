package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class string1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char choice;
        do {
            System.out.println("String Operations");
            System.out.println("1. Palindrome");
            System.out.println("2. Reverse");
            System.out.println("3. Length of the string");
            System.out.println("4. Count Vowels");
            System.out.println("Enter your choice : ");
            int ch = Integer.parseInt(br.readLine());
            switch (ch) {
                case 1:
                    String s;
                    System.out.println("Enter a string ");
                    s = br.readLine();
                    String reversed = "";
                    for (int i = s.length() - 1; i >= 0; i--) {
                        reversed += s.charAt(i);
                    }
                    System.out.println("Reversed String is : " + reversed);
                    if (s.equals(reversed)) {
                        System.out.println("String is Palindrome");
                    } else {
                        System.out.println("String is not an Palindrome");
                    }

                    break;
                case 2:
                    System.out.println("Reversed String");
                    System.out.println("Enter String to Reversed");
                    String s2 = br.readLine();
                    String reversed2 = "";
                    for (int i = s2.length() - 1; i >= 0; i--) {
                        reversed2 += s2.charAt(i);
                    }
                    System.out.println("Reversed String is : " + reversed2);
                    break;
                case 3:
                    System.out.println("Length of the string");
                    System.out.println("Enter String to find length");
                    String s3 = br.readLine();
                    System.out.println("Length of the string is : " + s3.length());
                    break;
                case 4:
                    System.out.println("Count Vowels");
                    System.out.println("Enter String to count vowels");
                    String s4 = br.readLine();
                    int vowels = 0;
                    for (int i = 0; i < s4.length(); i++) {
                        char c = s4.charAt(i);
                        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                            vowels++;
                        }
                    }
                    if (vowels > 0) {
                        System.out.println("Number of vowels : " + vowels);

                    } else {
                        System.out.println("No vowels found");
                    }

                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Do you want to continue : ");
            choice = br.readLine().charAt(0);

        } while (choice == 'y' || choice == 'Y');
        System.out.println("Thank you");

    }
}
