package edu.eci.arep.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Main class of CalculatorApp.
 *
 * @Author Carlos Medina
 */
public class CalculatorApp {

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        try {
            String currentDir = System.getProperty("user.dir");
            BufferedReader br = Files.newBufferedReader(Paths.get(currentDir+"/src/main/resources/files/caso2.txt"));
            String line = br.readLine();
            while (line != null) {
                list.add(Double.parseDouble(line));
            }
            br.close();
        } catch (IOException ex) {
            System.err.format("IOException: %s%n", ex);
        }

        System.out.println("For the input data the results are:");
        System.out.println("Mean: "+mean(list));
        System.out.println("Standard Deviation: "+standardDeviation(list));
        
    }
    
    public static double mean(LinkedList list) {
        double mean = 0;
        for (int i = 0; i < list.getSize(); i++) {
            mean += list.get(i);
        }
        mean = mean / list.getSize();
        mean = Math.round(mean * 100.0) / 100.0;
        return mean;
    }
    
    public static double standardDeviation(LinkedList list) {
        double standardDeviation = 0;
        double mean = mean(list);
        for (int i = 0; i < list.getSize(); i++) {
            standardDeviation += Math.pow(list.get(i) - mean, 2);
        }
        standardDeviation = Math.sqrt(standardDeviation / (list.getSize() - 1));
        standardDeviation = Math.round(standardDeviation * 100.0) / 100.0;
        return standardDeviation;
    }
}
