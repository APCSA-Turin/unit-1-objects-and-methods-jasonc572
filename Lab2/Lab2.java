package Lab2;
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int count = 0;
        System.out.print("Enter first word: ");
        String str1 = scanner.next();
        count ++;
        while (score < 50) {
            System.out.print("Enter next word: ");
            String str2 = scanner.next();
            count ++;
            if (str2.compareTo(str1) > 0) {
                score = score + 2;
                System.out.println("+2 , " + str2 + " comes after " + str1 + " Score: " + score);
            } else {
                score = score - 5;
                System.out.println("-5 , " + str2 + " comes before " + str1 + " Score: " + score);
            }
            if (str1.equals(str2)) {
                score = score - 10;
                System.out.println("-10 , words can't be the same! Score: " + score);
            }
            if (str2.substring(0, 2).equals(str1.substring((str1.length() - 2), str1.length()))) {
                score = score + 5;
                System.out.println("+5 ," +  str2.substring(0, 2) + " is the last two letters of " + str1 + " Score: " + score);
            }
            if ((str2.indexOf(str1.substring(0, 1)) > 0)) {
                score = score + 3;
                System.out.println("+3 , the starting " + str1.substring(0, 1) + " is found in " + str2 + " Score: " + score );
            }
            str1 = str2;
        }
        scanner.close();
        System.out.println("Congrats it took you " + count + " words!");
    }
}
