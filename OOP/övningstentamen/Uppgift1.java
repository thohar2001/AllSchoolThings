import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class Uppgift1 {

    public static String checkIfCharacter(String word) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (Character.isAlphabetic(word.charAt(i))) {
                builder.append(word.charAt(i));
            }
        }
        return builder.toString();

    }
    public static void main(String[] args) {
        String inFile = args[0];
        String outFile = args[1];
        int totalWords = 0;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(inFile), StandardCharsets.UTF_8));
                BufferedWriter bw = new BufferedWriter(
                        new OutputStreamWriter(new FileOutputStream(outFile), StandardCharsets.UTF_8))) {

            Set<String> uniqueWords = new HashSet<>();

            String[] splitwords;
            String line;
            while (true) {
                if ((line = br.readLine()) != null) {
                    splitwords = line.split("\\s+");

                    for (String word : splitwords) {
                        totalWords++;
                        word.toLowerCase();
                        uniqueWords.add(checkIfCharacter(word));
                    }
                } else {
                    break;
                }
            }

            LocalDateTime ldt = LocalDateTime.parse(LocalDateTime.now().toString());
            DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
            String date = ldt.format(outputFormat);
            Path path = FileSystems.getDefault().getPath(inFile).toAbsolutePath();

            bw.write("Filename: " + path.toString() +"\n");
            bw.write("Date: " + date +"\n");
            bw.write("Words processed: " + totalWords +"\n");
            bw.write("Total unique words: " + uniqueWords.size() +"\n");
        }

        catch (FileNotFoundException ex) {
            System.err.println("File not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("IO input/output error: " + ex.getMessage());
        }
    }
}