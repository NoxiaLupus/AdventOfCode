package day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * The Main Class is responsible for reading a txt file to get the binary numbers from the diagnostic report. For more
 * information, look at the README.md
 * @author Noxia Lupus
 * @version 04.12.2021
 */
public class Main {
    /**
     * The main method contains the call for exercise 3_1
     * @param args
     */
    public static void main(String[] args) {
        task3_1();
    }

    /**
     * This method contains all important method calls to get the calculation of the power consumption.
     */
    private static void task3_1() {
        int result;
        PowerConsumption power = new PowerConsumption();
        List<String> report;

        report = getReportValues();
        result = power.getRates(report);
        System.out.println(result);
    }

    /**
     * This method returns a List of Strings with a txt file given by the user input.
     * @return List of Strings with the report Values
     */
    private static List<String> getReportValues(){
        Scanner scan = new Scanner(System.in);
        Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        String basePath = "./src/day3/";
        String s;
        List<String> report = new ArrayList<>();

        // User input
        System.out.println("Please enter your filename: ");
        String filename = scan.nextLine();

        // Reading file as a String[]
        try (BufferedReader br = new BufferedReader(new FileReader(basePath + filename + ".txt"))) {
            while ((s = br.readLine()) != null) {
                report.add(s);
            }
        } catch (IOException e) {
            log.warning("Can't read file");
        }
        return report;
    }
}
