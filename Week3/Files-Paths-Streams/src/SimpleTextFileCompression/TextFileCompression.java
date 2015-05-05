package SimpleTextFileCompression;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TextFileCompression {

    static Map<Integer, String> map = new HashMap<Integer, String>();
    static String compress = new String();

    public static void compress(Path filePath) throws IOException {
        File file = new File(filePath.toString());
        Scanner input = new Scanner(new FileReader(file));
        StringBuilder compressedResult = new StringBuilder();
        int[] result = null;

        while (input.hasNextLine()) {
            String line;
            line = input.nextLine();

            String[] str = line.split("[^a-zA-Z']+");
            result = new int[str.length];
            for (int k = 0; k < result.length; k++) {
                result[k] = Integer.MAX_VALUE;
            }

            int wordNumbers = 0;
            boolean flag;
            for (int j = 0; j < str.length; j++) {
                flag = false;
                for (int i = str.length - 1; i > j; i--) {
                    if (result[j] < wordNumbers) {
                        break;
                    }
                    result[j] = wordNumbers;
                    map.put(wordNumbers, str[j]);
                    if (str[j].equals(str[i])) {
                        result[i] = wordNumbers;
                    } else {
                        flag = true;
                    }
                }
                if (flag == true) {
                    wordNumbers++;
                }
            }

            for (int l : result) {
                compressedResult.append("~" + l);
            }
            compressedResult.append("\r\n");
        }
        compress = compressedResult.toString();
        writeResultToFile(compress);
        input.close();
    }

    public static void decompress() throws IOException {
        StringBuilder result = new StringBuilder();
        compress = compress.replaceAll("[^-?0-9]+", " ");
        List<String> numberArray = Arrays.asList(compress.trim().split(" "));
        for (String s : numberArray) {
            for (Entry<Integer, String> entry : map.entrySet()) {
                if (Integer.parseInt(s) == entry.getKey()) {
                    result.append(entry.getValue() + "  ");
                }
            }
        }
        writeResultToFile(result.toString());
    }

    private static void writeResultToFile(String compressedResult) throws IOException {

        PrintWriter writer = new PrintWriter(new FileWriter("compressedFile.compr", true));
        writer.println(compressedResult);
        System.out.println("Result written to file !");
        writer.close();
    }

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Ridvan\\workspace\\Files-Paths-Streams\\test.txt");
        try {

            compress(path);
            decompress();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
