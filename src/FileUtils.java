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
    public static ArrayList<Long> readFile(File file) {
        String             tempInput;
        ArrayList<Long> countryInfo = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((tempInput = br.readLine()) != null) {
                countryInfo.add(Long.parseLong(tempInput));
            }
        } catch (IOException io) {
            io.printStackTrace();
        }

        return countryInfo;
    }
}