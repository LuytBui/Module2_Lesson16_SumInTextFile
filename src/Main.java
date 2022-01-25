import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Nhập tên file: ");
        String fileName = scanner.nextLine();

        try {
            System.out.println("Tổng các số trong file: "+ sumInFile(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public static int sumInFile(String fileName) throws IOException {
        int sum = 0;
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null){
            int number = 0;
            try {
                number = Integer.parseInt(line.trim());
                System.out.println(number);
            } catch (NumberFormatException e) {
                //
            } finally {
                sum += number;
            }

        }
        bufferedReader.close();
        fileReader.close();
        return sum;
    }
}
