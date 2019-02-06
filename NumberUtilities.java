
import java.lang.Math;

public class NumberUtilities {

    public static String getRange(int stop) {
        String range = "";
        
        for (int n = 0; n < stop; n++){
            range = range + n;
        }
        
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        
        for (int n = start; n < stop; n++){
            range = range + n;
        }
        
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        
        for (int n = start; n < stop; n = n + step){
            range = range + n;
        }
        
        return range;
    }

    public static String getEvenNumbers(int start, int stop) {
        if (start % 2 == 1){
            start++;
        }
        
        return getRange(start, stop, 2);
    }


    public static String getOddNumbers(int start, int stop) {
        if (start % 2 == 0){
            start++;
        }
        
        return getRange(start, stop, 2);
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String expoRange = "";
        
        for (int n = start; n <= stop; n++){
            expoRange = expoRange + Math.round(Math.pow(n, exponent));
        }
        
        return expoRange;
    }
}
