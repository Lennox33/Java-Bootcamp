public class BooleansComparisons {
    public static void main(String[] args) {
        int chemistryGrade = 95;
        int biologyGrade = 75;
        int englishGrade = 75;
        System.out.println(chemistryGrade >= englishGrade);
        System.out.println(biologyGrade == englishGrade);
        System.out.println(biologyGrade > chemistryGrade);
        
        double sales = 37.55;
        double costs = 5.55;
        System.out.println(sales > costs);

        String sentence = "I love dogs";
        String sentence2 = "I love dogs";
        System.out.println(!sentence.equals(sentence2));
    }
}
