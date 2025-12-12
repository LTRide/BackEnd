import java.io.*;
import java.util.*;

public class parkingDataManagment {
    public static void main(String[] args) {
        int negativeCount = 0;
        int below15Count = 0;
        int above30Count = 0;
        
        try (Scanner key = new Scanner(new File("/workspaces/BackEnd/Data.csv"))) {
            // Skip header line
            if (key.hasNextLine()) {
                key.nextLine();
            }
            
            while (key.hasNextLine()) {
                String line = key.nextLine();
                String[] parts = line.split(",");
                System.out.println(Arrays.toString(parts));
                
                if (parts.length >= 2) {
                    try {
                        int value = Integer.parseInt(parts[1]);
                        
                        if (value < 0) {
                            negativeCount++;
                        } else if (value < 15) {
                            below15Count++;
                        } else if (value > 30) {
                            above30Count++;
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid number format: " + parts[1]);
                    }
                }
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("Data.csv not found: " + e.getMessage());
        }
    }
}