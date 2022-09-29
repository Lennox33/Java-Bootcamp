import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        
        System.out.println("What is your first name?");
        String firstName = scan.nextLine();

        System.out.println("What is your last name?");
        String lastName = scan.nextLine();

        System.out.println("How old are you?");
        int age = scan.nextInt();

        /* Ask them to make a username. SIDE NOTE:
           – nextLine() gets "skipped" if you put it ahead of nextInt() , nextDouble(), nextLong().
           – You will understand why this happens when we cover Delimiters in the next section (Booleans and Conditionals).
           – For now, just know that the solution is to add an extra nextLine().
        */
        System.out.println("Create a username: ");
        String username = scan.nextLine();
        username = scan.nextLine();

        System.out.println("What city do you live in?");
        String city = scan.nextLine();
        
        System.out.println("What country is that in?");
        String country = scan.nextLine();

        System.out.println("Your information: ");
        System.out.println("\tFirst name: " + firstName);
        System.out.println("\tLast name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);
        System.out.println("\nThank you for joining JavaGram " + username + "!");

        scan.close();
    }
}
