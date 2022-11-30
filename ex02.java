import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ex02 {
    public static void main(String[] args) {
        sortLog();
    }

    public static void sortLog() {
        
        int[] arr = new int[] { 4, 3, 1, 3, 2, };
        try (FileWriter fw = new FileWriter("log.txt", false)) {
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;

                    try (FileWriter fw = new FileWriter("log.txt", true)) {
                        fw.write(Arrays.toString(arr) + "\n");
                        fw.flush();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }
    }
}