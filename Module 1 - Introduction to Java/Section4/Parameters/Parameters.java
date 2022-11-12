public class Parameters {
    public static void main(String[] args) {
        calculateArea(2.3, 3.6);
        calculateArea(1.9, 2.6);
        calculateArea(3.8, 2.4);
    }

public static void calculateArea (double width, double length){
    double area = width * length;
    System.out.println("Area " + area);
}
}