public class CtoFTester {
    public static int fahrenheitToCelsius(int F){
        return (F-32) * 5 / 9;
    }
    
    public static int celsiusToFahrenheit(int C){
        return (C * 5.0) / 9.0 + 32.0;
    }
    
    public static void main(String[] args){
    System.out.println(celsiusToFahrenheit(1));}
}

