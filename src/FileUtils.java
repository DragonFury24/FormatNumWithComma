import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileUtils {
    /**
     * Parses text file
     *
     * @param file Text file
     * @return Queue of elements in file
     */
    public static ArrayList<String> readFile(File file) {
        String             tempInput;
        ArrayList<String> countryInfo = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((tempInput = br.readLine()) != null) {
                countryInfo.add(tempInput);
            }
        } catch (IOException io) {
            io.printStackTrace();
        }

        return countryInfo;
    }
}