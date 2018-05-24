import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Long> inputs = FileUtils.readFile(new File(new File("src").exists() ? "src/SampleInput.txt" : "SampleInput.txt"));

        inputs.forEach(input -> System.out.println(formatWithComma(Long.toString(input))));
        inputs.forEach(input -> System.out.println(formatWithComma(input)));
    }

    /**
     * Add commas between every third digit of a number
     * @param input Valid int or long input
     * @return String with commas added in every third digit
     */
    public static String formatWithComma(String input) {
        if (input.length() <= 3)
            return input;

        return formatWithComma(input.substring(0, input.length() - 3)) + "," + input.substring(input.length() - 3);
    }

    public static String formatWithComma(long input) {
        long mod = input % 1000;
        long div = input / 1000;

        if (div == 0)
            return Long.toString(mod);

        if (input <= 100)
            return Long.toString(input);

        if (mod < 10)
            return formatWithComma(div) + "," + "00" + Long.toString(mod);

        if (mod < 100)
            return formatWithComma(div + "," + "0" + Long.toString(mod));

        return formatWithComma(div) + "," + Long.toString(mod);
    }
}
