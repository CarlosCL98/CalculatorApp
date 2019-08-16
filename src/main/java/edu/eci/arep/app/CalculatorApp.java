package edu.eci.arep.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Main class of CalculatorApp.
 *
 * @author Carlos Medina
 */
public class CalculatorApp {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        try {
            String currentDir = System.getProperty("user.dir");
            BufferedReader br = Files.newBufferedReader(Paths.get(currentDir + "/src/main/resources/files/caso2.txt"));
            String line = br.readLine();
            while (line != null) {
                //list.add(Double.parseDouble(line));
            }
            br.close();
        } catch (IOException ex) {
            System.err.format("IOException: %s%n", ex);
        }

        System.out.println("For the input data the results are:");
        System.out.println("Mean: " + mean(list));
        System.out.println("Standard Deviation: " + standardDeviation(list));

    }

    /**
     * Calculate the mean of a set of data.
     *
     * @param list with de data.
     * @return double : the mean of the data.
     */
    public static double mean(LinkedList list) {
        double mean = 0;
        for (int i = 0; i < list.getSize(); i++) {
            mean += list.get(i);
        }
        mean = mean / list.getSize();
        mean = Math.round(mean * 100.0) / 100.0;
        return mean;
    }

    /**
     * Calculate the standard deviation of a set of data.
     *
     * @param list with de data.
     * @return double : the standard deviation of the data.
     */
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
