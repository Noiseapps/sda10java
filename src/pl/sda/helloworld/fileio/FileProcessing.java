package pl.sda.helloworld.fileio;

import java.io.*;

public class FileProcessing {

    public static void main(String[] args) {
        FileProcessing fileProcessing = new FileProcessing();
//        try {
//            fileProcessing.writeToFile("someFile.txt", "test");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        String fileContent = fileProcessing.readFile("someFile.txt");

        System.out.println(fileContent);
    }

    public String readFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void writeToFile(String fileName, String content) throws IOException {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(fileName), "utf-8"))) {
            writer.write(content);
        }

    }
}
