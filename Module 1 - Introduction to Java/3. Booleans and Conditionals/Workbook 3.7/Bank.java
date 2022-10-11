import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        //Task 1 - Pick up the user's decision.
        String mortgage = scan.next();


        //Task 2 - Print this if the decision is "yes"
        if (mortgage.equals("yes")) {
            System.out.println("\nGreat! In one line" +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");
                int savings = scan.nextInt();
                int debt = scan.nextInt();

            System.out.println("\nHow many years have you worked for?");
                int year = scan.nextInt();

            System.out.println("What is your name?");
               // Task 5 - Pick up the user's name
                scan.nextLine();
                String name = scan.nextLine();

               if ((savings >= 10000) && (debt <= 5000) && (year >= 2)){
                System.out.println("Congratulations " + name + ", you've been approved!");
               } else{
                System.out.println("Sorry, " + name + " you are not eligible for a mortgage.");
               }
        } else{
            System.out.println("\nOK. Have a nice day dude!");
        }


        scan.close();
    }
}