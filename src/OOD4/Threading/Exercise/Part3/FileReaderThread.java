package OOD4.Threading.Exercise.Part3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderThread extends Thread{
    private AverageCalculator calculator;
    private String fileName;

    public FileReaderThread(AverageCalculator calculator, String fileName) {
        this.calculator = calculator;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        File myObj = new File(fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(myObj);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            String[] arr = data.split(",");
            for (String str  : arr) {
                int res = Integer.parseInt(str);
                calculator.addToTotal(res);
            }
        }
    }
}
