public class ReturnValues {
    public static void main(String[] args) {
       double area1 =  calculateArea(2.3, 3.6);
      printArea(2.3, 3.6, area1);

       String englishExplanation = explainArea("English");
       System.out.println(englishExplanation);
    }

public static double calculateArea (double width, double length){
    if (length < 0 || width < 0){
        System.out.println("INVALID DIMENSIONS");
        System.exit(0);
    }
    double area = width * length;
    return area ;
}

public static String explainArea(String language){
    switch (language) {
        case "English": return "Area equals length * width";
        default: return "Language not available";
    }
}

public static void printArea(double length, double width, double area){
    System.out.println("A rectangle with the length of " + length + "and a width of " + width + " has an area of " + area);
}
}
