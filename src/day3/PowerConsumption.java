package day3;

import java.util.List;

/**
 * The PowerConsumption class is responsible for analysing the diagnostic report and to determine the gamma and epsilon
 * rates, convert them to decimal and calculate the power consumption.
 * @author Noxia Lupus
 * @version 04.12.2021
 */
public class PowerConsumption {

    /**
     * This method counts the zeros and ones in the binary numbers to determine the gamma rate and epsilon rate. This
     * method parse the gammaRate and epsilonRate to a decimal integer. After that this method multiplies them and
     * returns the result.
     * @param report List of Strings with the values from the diagnostic report
     * @return result which has the value of the power consumption
     */
    public int getRates(List<String> report) {
        String gammaRate="", epsilonRate="";
        int gamma, epsilon, result;
        for (int i = 0; i < report.get(0).length(); i++) {
            int ones = 0;
            int zeros = 0;
            for (String number : report) {
                if (number.charAt(i) == '1') {
                    ones++;
                } else if (number.charAt(i) == '0') {
                    zeros++;
                }
            }
            if (zeros > ones) {
                gammaRate = gammaRate.concat("0");
                epsilonRate = epsilonRate.concat("1");
            } else if (ones > zeros) {
                gammaRate = gammaRate.concat("1");
                epsilonRate = epsilonRate.concat("0");
            }
        }
        gamma = Integer.parseInt(gammaRate, 2);
        epsilon = Integer.parseInt(epsilonRate, 2);
        result = gamma * epsilon;
        return result;
    }
}
