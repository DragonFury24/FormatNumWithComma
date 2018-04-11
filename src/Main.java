import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Long> inputs = FileUtils.readFile(new File(new File("src").exists() ? "src/SampleInput.txt" : "SampleInput.txt"));

        inputs.forEach(input -> System.out.println(formatWithComma(Long.toString(input))));

    }

    public static String formatWithComma(String input) {
        if (input.length() <= 3)
            return input;

        return formatWithComma(input.substring(0, input.length() - 3)) + "," + input.substring(input.length() - 3);
    }


}
