public class Tip {

    public static void main(String[] args) {
        double bill = 53.5;
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Me: Thank you!");
    
        //Task 2: Call a function that tips the waiter.
        tipTheWaiter(bill);
    }

    /**
     * Function name: tipTheWaiter - calculates a tip and prints it.
     * @param bill (double).
     * 
     * Inside the function:
     *  1. Calculates a tip that's 15 percent of bill.
     *  2. Prints: Your service was wonderful! Please, accept this tip: $<tip>
     */
    public static void tipTheWaiter(double bill){
        double tip = .15 * bill;
        System.out.println("Me: Your service was wonderful! Please, accept this tip: " + tip);
    }

}