import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Calculates the average of a set of integers from a file
 * Calculates what percentage of the numbers were above average
 */
public class AverageNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        String inputFilename = "in1.txt";
        String outputFilename = "out1.txt";

        ArrayList<Integer> numbers = getNumbers(inputFilename);

        double avg = average(numbers);
        double percentAboveAvg =    percentAbove(numbers, avg);

        PrintWriter out = new PrintWriter(outputFilename);
        out.println("Average: " + avg);
        out.println("Percent above average: " + percentAboveAvg);
        out.close();
    }

    /**
     * @param filename of a file containing a whitespace-delimited set of integers
     * @return list of integers from the file
     * @throws FileNotFoundException if a file is not found with the given file name
     */
    public static ArrayList<Integer> getNumbers(String filename) throws FileNotFoundException {
        File inputFile = new File(filename);
        Scanner in = new Scanner(inputFile);

        ArrayList<Integer> result = new ArrayList<>();
        // TODO: add type-mismatch checking
        while(in.hasNextInt()){
            result.add(Integer.parseInt(in.next()));
        }
        in.close();
        return result;
    }

    /**
     * @param numbers should not be empty
     * @return The average of the values in numbers
     */
    public static double average(ArrayList<Integer> numbers) {
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        double avg = (float)sum / numbers.size();
        return avg;
    }

    /**
     * @param numbers should not be empty
     * @return The percent of values in numbers that are above threshold
     */
    public static double percentAbove(ArrayList<Integer> numbers, double threshold) {
        int count = 0;
        for(int i=0; i<=numbers.size(); i++){
            int nextNum = numbers.get(i);
            if(nextNum > threshold){
                count++;
            }
        }
        return 100.0 * ((float)count / numbers.size());
    }
}