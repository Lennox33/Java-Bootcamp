import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Ox's Dealership!");
        System.out.println(" - Select option 'a' to buy a car");
        System.out.println(" - Select option 'b' to sell a car.");

        String option = scan.nextLine();

        switch (option){
            case "a": 
            System.out.println("What is your budget?");
            int budget = scan.nextInt();
            if (budget >= 10000){
                System.out.println("Great a Nissan Altima is available");

                scan.nextLine();
                System.out.println("\n Do you have insurance? Write 'yes' or 'no'");
                String insurance = scan.nextLine();
                System.out.println("\n Do you have a licence? Write 'yes' or 'no'");
                String license = scan.nextLine();
                System.out.println("\nWhat is your credit score?");
                int creditScore = scan.nextInt();

                if (insurance.equals("yes") && license.equals("yes") && creditScore >= 660){
                    System.out.println("Sold! Pleasure doing business with you!");
                } else{
                    System.out.println("You got work to do buddy.");
                }
                
            } else {
                System.out.println("We don't sell cars less for less than 10,000 dollars. Get your money up");
            }
            break;
            case "b": 
                System.out.println("\nWhat is your car valued at?");
                int value = scan.nextInt();
                System.out.println("\nWhat is your selling price?");
                int price = scan.nextInt();

                if (value > price && price < 30000){
                    System.out.println("\nWe will buy your car! Pleasure doing businness with you");
                } else {
                    System.out.println("\nDamn bro, we ain't interested.");
                }
            break;
            default: System.out.println("invalid option");
        }

        scan.close();
    }
}
