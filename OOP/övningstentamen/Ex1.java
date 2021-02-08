import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex1 {

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
        Path inFile = Path.of(args[0]);
        Path outFile = Path.of(args[1]);

        if (!Files.isReadable(inFile)) {
            System.out.println("The file: " + inFile + " doesn't exist or is not readable!");
            System.exit(-1);
        }

        if (Files.exists(outFile)) {
            System.out.println("The file: " + outFile + " already exists!");
            System.exit(-1);
        }

        try (BufferedReader reader = Files.newBufferedReader(inFile, StandardCharsets.UTF_8);
                BufferedWriter writer = Files.newBufferedWriter(outFile)) {

            List<String> sentenceToWords = new ArrayList<>();
            Map<String, Integer> values = new HashMap<>();
            String words;
            while ((words = reader.readLine()) != null) {
                String[] splitString = words.split("\\s+");
                for (String word : splitString) {
                    if (!checkIfCharacter(word).isBlank())
                    sentenceToWords.add(checkIfCharacter(word).toLowerCase());
                }
            }


            for (String word : sentenceToWords) {
                if (!values.containsKey(word)) {
                    values.put(word, 1);
                } else {
                    values.put(word, values.get(word) + 1);
                }
            }
            
            int uniqueWords = 0;

            for (Map.Entry<String, Integer> entry : values.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

            for (Map.Entry<String, Integer> entry : values.entrySet()) {
                if (entry.getValue() == 1) {
                    uniqueWords++;
                }
            }
            
            LocalDateTime dt = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String date = formatter.format(dt);

            int totalWords = sentenceToWords.size();

            writer.write("Filename: " + inFile.toAbsolutePath().normalize().toString());
            writer.write("\nDate: " + date);
            writer.write("\nWords processed: " + totalWords);
            writer.write("\nTotal unique words: " + uniqueWords);

            
            }
            catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }

            
            