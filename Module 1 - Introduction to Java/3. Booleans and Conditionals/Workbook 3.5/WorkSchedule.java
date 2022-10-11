public class WorkSchedule {
    public static void main(String[] args) {
        int day = 3;   //3rd day of the week...
        boolean holiday = true;
         
        // if it's a holiday, print: "woohoo, no work!");
        // if it's the weekend, print: "it's the weekend, no work!"
        if (holiday){
            System.out.println("Woohoo, no work!");
        } else if (day > 5 && day < 1) {
            System.out.println("It's the weekend, time to work on Java!");
        } else{
            System.out.println("Wake up at 7! Time for another great day!");
        }

    }}
