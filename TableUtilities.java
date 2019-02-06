 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String multiplicationTable = "";
        int rowCounter = 1;
        int columnCounter = 1;
        
        while (columnCounter <= tableSize){
            rowCounter = 1;
            
            while (rowCounter <= tableSize){
                multiplicationTable = multiplicationTable + String.format("%3d", rowCounter * columnCounter) + " |";
                rowCounter++;
            }
            
            columnCounter++;
            
            multiplicationTable = multiplicationTable + "\n";
        }
        System.out.print(multiplicationTable);
        return multiplicationTable;
    }
}
