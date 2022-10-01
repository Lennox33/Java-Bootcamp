public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 78;
        int englishGrade = 65;
        String language = "Java";

        if (chemistryGrade > 75 || englishGrade >75 || language.equals("Java")) {
            System.out.println("Congratulations, you got the scholarship!");
        } else {
            System.out.println("You didnt get the scholarship.");
        }

        int credits = 56;
        double GPA = 1.4;
        if (credits >= 40 && GPA >= 2.0){
            System.out.println("You earned your diploma!");
        } else {
            System.out.println("Damn bro, you need a minimum gpa of 2.0");
        }
    }
}
