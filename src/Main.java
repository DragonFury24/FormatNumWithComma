import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> inputs = FileUtils.readFile(new File(new File("src").exists() ? "src/SampleInput.txt" : "SampleInput.txt"));
        for (int i = 0; i < inputs.size(); i++)
            inputs.set(i, formatWithComma(inputs.get(i)));

        inputs.forEach(System.out::println);

    }

    public static String formatWithComma(String input) {
        if (input.length() <= 3)
            return input;

        return formatWithComma(input.substring(0, input.length() - 3)) + "," + input.substring(input.length() - 3);
    }


}
