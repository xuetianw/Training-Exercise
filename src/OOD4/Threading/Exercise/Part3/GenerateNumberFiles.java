package OOD4.Threading.Exercise.Part3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateNumberFiles {
    public static void main(String[] args) {
        System.out.println("Creating first file");
        createNumberFile("records1.txt",500000,100);
        System.out.println("First file completed");
        System.out.println("Creating second file");
        createNumberFile("records2.txt",400000,150);
        System.out.println("Second file completed");
    }

    public static void createNumberFile(String fileName, int numberOfLines, int maxNumber) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(fileName,true);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (int lineNumber = 1; lineNumber <= numberOfLines; lineNumber ++) {
                int numberOfRecords = (int) (Math.random() * 90);
                numberOfRecords += 10;
                String line = "";
                for (int record = 1; record <= numberOfRecords; record++) {
                    int data = (int) (Math.random() * maxNumber);
                    line = line +data+",";
                }
                line = line.substring(0, line.length() - 1);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
