public class ReturnValues {
    public static void main(String[] args) {
       double area1 =  calculateArea(2.3, 3.6);
       double area2x =  calculateArea(1.9, 2.6);
       double area3 = calculateArea(3.8, 2.4);
    }

public static double calculateArea (double width, double length){
    double area = width * length;
    return area ;
}

}
