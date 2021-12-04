package day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * The Main class calls the MovingSubmarine class and is responsible for reading a txt file and convert into an
 * ArrayList of String Arrays to get the commands and values.
 * @author Noxia Lupus
 * @version 04.12.2021
 */
public class Main {
    /**
     * This method is used to run the exercise methods, read the README.md for more informations.
     * @param args
     */
    public static void main(String[] args) {
        task2_1();
    }

    /**
     * This method contains all commands that are needed to calculate the multiplication of the depth and the
     * horizontal values of the submarine
     */
    private static void task2_1() {
        int multipliedValue;
        List<String[]> commands;
        commands = getMeasurementsValues();
        MovingSubmarine move = new MovingSubmarine();
        multipliedValue = move.multiplyCommands(commands);
        System.out.println("The depth and horizontal values multiplied are " + multipliedValue);
    }

    /**
     * This method returns an ArrayList with a String Array which has the commands and numbers for the submarine,
     * mostly copy pasted from day 1
     * @return ArrayList<String[]>
     */
    private static List<String[]> getMeasurementsValues() {
        Scanner scan = new Scanner(System.in);
        Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        String basePath = "./src/day2/";
        String s;

        // User input
        System.out.println("Please enter your filename: ");
        String filename = scan.nextLine();
        List<String[]> input = new ArrayList<>();

        // Reading file as a String[]
        try (BufferedReader br = new BufferedReader(new FileReader(basePath + filename + ".txt"))) {
            while ((s = br.readLine()) != null) {
                input.add(s.split(" "));
            }
        } catch (IOException e) {
            log.warning("Can't read file");
        }
        return input;
    }
}
