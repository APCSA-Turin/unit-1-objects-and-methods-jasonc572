import java.util.Scanner;


public class part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();
        scanner.close();
        if (str1.length() > str2.length()) {
            System.out.println(str1 + " is longer");
        } else if (str2.length() > str1.length()) {
            System.out.println(str2 + " is longer");
        } else {
            System.out.println("Both strings have the same length");
        }
        int half1 = str1.length() / 2;
        System.out.println("First half: " + str1.substring(0, half1));
        System.out.println("Second half: " + str1.substring(half1));
        int half2 = str2.length() / 2;
        System.out.println("First half: " + str2.substring(0, half2));
        System.out.println("Second half: " + str2.substring(half2));
        if (str1.indexOf(str2) == -1) {
            System.out.println(str2 + " is NOT found in " + str1);
        } else {
            System.out.println(str2 + " is found in " + str1 + " in index " + str1.indexOf(str2));
        }
       


        }
}
