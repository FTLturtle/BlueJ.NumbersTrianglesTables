 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String row = "";
        
        for (int n = 0; n < numberOfStars; n ++){
            row = row + "*";
        }
        
        return row;
    }
    
    public static String getTriangle(int numberOfRows) {
        String triangle = "";
        int rowNumber = 1;
        
        while (rowNumber <= numberOfRows){
            for (int x = 0; x < rowNumber; x++){
                triangle = triangle + "*";
            }
            
            rowNumber++;
            triangle = triangle + "\n";
        }
        
        return triangle;
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
