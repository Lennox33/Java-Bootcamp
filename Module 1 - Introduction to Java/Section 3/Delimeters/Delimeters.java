import java.util.Scanner;

public class Delimeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter two integers (on the same line)");
        // int num1 = scan.nextInt();
        // int num2 = scan.nextInt();

        // System.out.println("Enter two very large numbers(on the same line)");
        // long largeNum1 = scan.nextLong();
        // long largeNum2 = scan.nextLong();

        // System.out.println("Enter two doubles (on the same line)");
        // double decimal1 = scan.nextDouble();
        // double decimal2 = scan.nextDouble();

        // System.out.println("Enter two text values (on the same line)");
        // String text1 = scan.next();
        // String text2 = scan.next();

        // scan.close();

        // System.out.println("\tIntegers: " + num1 + " " + num2);
        // System.out.println("\tLarge Integers: " + largeNum1 + " " + largeNum2);
        // System.out.println("\tDecimals: " + decimal1 + " " + decimal2);
        // System.out.println("\tWords: " + text1 + " " + text2);

        System.out.println("Please enter a number");
        int num = scan.nextInt();

        scan.nextLine();
        System.out.println("Please write a sentence");
        String sentence = scan.nextLine();

        scan.close();
    }
}
