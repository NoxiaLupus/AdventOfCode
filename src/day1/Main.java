package day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * The Main class calls the CountMeasurements class and is responsible for reading a txt file with only integers to
 * put them in an ArrayList
 * @author Noxia Lupus
 * @version 04.12.2021
 */

public class Main {
    /**
     * If you want to run the first exercise from the Advent of Code, you have to use the task1_1() and if you want
     * to run the second exercise from day 1 you have to run the task1_2(). Look at the README.md for more
     * information about the exercises
     */
    public static void main(String[] args) {
        task1_1();
        task1_2();
    }

    /**
     * This method prints the number of increasing measurements with external methods
     */
    private static void task1_1() {
        int increased;
        List<Integer> measurements;
        measurements = getMeasurementsValues();
        CountMeasurements counting = new CountMeasurements();
        increased = counting.countingMeasurements(measurements);
        System.out.println("The measurements show " + increased + " times an increasing depth");
    }

    /**
     * This method prints the number of increasing measurments with external methods, but three measurements count
     * as one new measurement. Look at the README
     */
    private static void task1_2() {
        int increased;
        List<Integer> measurements;
        measurements = getMeasurementsValues();
        CountMeasurements counting = new CountMeasurements();
        measurements = counting.addingMeasurements(measurements);
        increased = counting.countingMeasurements(measurements);
        System.out.println("The added measurements show " + increased + " times an increasing depth!");
    }

    /**
     * This method asks the User which txt file should be read and converted to a List of Integers. The reader gets
     * the string values from the txt and parse them later to Integer values, so they can be compared later. The
     * input from the User should only be the file name without file ending.
     * @return List of Integers with measurements
     */
    private static List<Integer> getMeasurementsValues() {
        Scanner scan = new Scanner(System.in);
        Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        String basePath = "./src/day1/";
        String s;

        // User input
        System.out.println("Please enter your filename: ");
        String filename = scan.nextLine();
        List<String> input = new ArrayList<>();

        // Reading file as a String
        try (BufferedReader br = new BufferedReader(new FileReader(basePath + filename + ".txt"))) {
            while ((s = br.readLine()) != null) {
                input.add(s);
            }
        } catch (IOException e) {
            log.warning("Can't read file");
        }

        // Parsing ArrayList<String> to ArrayList<Integer>
        ArrayList<Integer> result = new ArrayList<>();
        for (String value : input) {
            try {
                result.add(Integer.valueOf(value));
            } catch (NumberFormatException e) {
                log.warning("Can't parse the file!");
            }
        }
        return result;
    }
}
