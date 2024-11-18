import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class part2b {
    public static void fileManip(File input, FileWriter output) throws IOException {
        Stack<Integer> numbers = new Stack<>();
        int count = 0;
        int sets = 0;
        int size = 0;
        int initialMarker = 0;
        int result = 0;

        Scanner read = new Scanner(input);
        BufferedWriter writer = new BufferedWriter(output);

        while (read.hasNextLine()) {
            if (count == 0) {
                sets = Integer.parseInt(read.nextLine());
                count++;
                continue;
            } else {
                String line = read.nextLine();
                Scanner readLine = new Scanner(line);
                size = readLine.nextInt();
                System.out.println("Size: " + size);
                initialMarker = readLine.nextInt();
                System.out.println("Initial Marker:" + initialMarker);
                while (readLine.hasNext()) {
                    numbers.push(readLine.nextInt());
                }
                numbers.push(0);
                // for (int i = 0; i < size; i++) {
                // System.out.println(numbers.get(i));
                // }

                result = strikeEdgeZero(numbers, initialMarker);
                // System.out.println(result);
                writer.write(Integer.toString(result));
                writer.newLine();

                for (int i = 0; i < size; i++) {
                    numbers.pop();
                }
            }
        }

        writer.close();
        output.close();
        read.close();

    }

    public static int strikeEdgeZero(Stack<Integer> arr, int index) {
        int count = 0;
        int left = 0;
        int right = 0;
        int size = arr.size();

        if (arr.get(0) == arr.get(size - 1)) {
            return 0;
        }

        while (arr.get(index) != 0) {
            left = index - arr.get(index);
            right = index + arr.get(index);

            if (right < size && left < 0 && count < 2) {
                if (arr.get(index) == arr.get(right)) {
                    count++;
                }
                index = right;
                continue;

            }
            if (right > size && left >= 0 && count < 2) {
                if (arr.get(index) == arr.get(left)) {
                    count++;
                }
                index = left;
                continue;

            }
            if (right < size && left >= 0 && count < 2) {
                if (right + arr.get(right) > size) {
                    index = left;
                } else {
                    index = right;
                }
                continue;

            }

            if (right > size && left < 0) {
                break;
            }
            if (count >= 2) {
                break;
            }

        }

        if (arr.get(index) == 0) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        String inputName = args[0];
        File input = new File(inputName);
        String outputName = args[1];
        FileWriter output = new FileWriter(outputName);

        fileManip(input, output);

    }

}