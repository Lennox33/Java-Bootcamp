import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counter = 0;
        System.out.println("Welcome! thanks for taking this survey");

        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();
        System.out.println("Hi there " + name + "!");
        counter++;

        System.out.println("\nHow much do you spend on coffee a week?");
        Double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow much do you spend on fast food a week?");
        Double foodPrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("\nHow many times a week do you buy fast food?");
        counter++;
        int foodAmount = scan.nextInt();
        
        System.out.println("\nThanks for answering " + counter + " questions " + name + "!");
        System.out.println("\nYour fast food expenses are " + (foodPrice / coffeePrice) + " more times than your cofffee prices.");
        System.out.println("Weekly, you spend $" + (coffeeAmount * coffeePrice) + " on coffee.");
        System.out.println("Weekly, you spend $" + (foodAmount * foodPrice) + " on food.");
            scan.close();
        }
}
