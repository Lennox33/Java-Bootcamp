public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        //Task 3 - Call the printTemperatures function. 
        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);
        
    }

    public static double fahrenheitToCelsius(double temperature){
        double celsius = (temperature - 32) * 5/9.;
        return celsius;
    }
     

    public static void printTemperatures(double fahrenheit){
        System.out.println("The temperature in farenheit is " + fahrenheit);
        System.out.println("The temperature in celcius is " + fahrenheitToCelsius(fahrenheit));

    } 
    
}