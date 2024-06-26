package Tasks.task4;

import java.io.BufferedReader;
import java.io.FileReader;

public class Task4 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Необходимо передать путь к файлу в качестве аргумента командной строки.");
            return;
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String line;
            int sum = 0;
            int count = 0;

            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line);
                sum += num;
                count++;
            }

            reader.close();

            int average = sum / count;

            int moves = 0;
            for (int i = 0; i < count; i++) {
                moves += Math.abs(average - Integer.parseInt(line));
            }

            System.out.println("Минимальное количество ходов: " + moves);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

