package Tasks.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Необходимо передать два аргумента: путь к файлу с координатами окружности и путь к файлу с координатами точек.");
            return;
        }

        double centerX = 0, centerY = 0, radius = 0;
        try {
            File circleFile = new File(args[0]);
            Scanner circleScanner = new Scanner(circleFile);
            centerX = circleScanner.nextDouble();
            centerY = circleScanner.nextDouble();
            radius = circleScanner.nextDouble();
            circleScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл с координатами окружности не найден.");
            return;
        }

        try {
            File pointsFile = new File(args[1]);
            Scanner pointsScanner = new Scanner(pointsFile);

            while (pointsScanner.hasNext()) {
                double x = pointsScanner.nextDouble();
                double y = pointsScanner.nextDouble();

                double distance = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2));

                if (distance == radius) {
                    System.out.println("0");
                } else if (distance < radius) {
                    System.out.println("1");
                } else {
                    System.out.println("2");
                }
            }

            pointsScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл с координатами точек не найден.");
            return;
        }
    }
}

