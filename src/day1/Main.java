package day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        List<Integer> measurements;
        measurements = getMeasurementsValues();
        int increased;
        CountMeasurements counting = new CountMeasurements();
        increased = counting.countingMeasurements(measurements);
        System.out.println("The measurements show " + increased + " times an increasing depth");
    }

    private static List<Integer> getMeasurementsValues() {
        Scanner scan = new Scanner(System.in);
        Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        String basePath = "./src/day1/";
        String s;

        System.out.println("Please enter your filename: ");
        String filename = scan.nextLine();
        List<String> input = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(basePath + filename + ".txt"))) {
            while ((s = br.readLine()) != null) {
                input.add(s);
            }
        } catch (IOException e) {
            log.warning("Can't read file");
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (String value : input) {
            try {
                result.add(Integer.valueOf(value));
            } catch (NumberFormatException e) {
                log.warning("Parsing failed!");
                break;
            }
        }
        return result;
    }
}
