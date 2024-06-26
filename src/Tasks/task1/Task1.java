package Tasks.task1;

public class Task1 {
        public static void main(String[] args) {
            if (args.length < 2) {
                System.out.println("Необходимо передать два аргумента: n и m.");
                return;
            }

            int n = Integer.parseInt(args[0]);
            int m = Integer.parseInt(args[1]);

            StringBuilder circularArray = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                circularArray.append(i);
            }

            StringBuilder path = new StringBuilder();
            int currentIndex = 0;

            while (circularArray.length() > 0) {
                currentIndex = (currentIndex + m - 1) % circularArray.length();
                path.append(circularArray.charAt(currentIndex));
                circularArray.deleteCharAt(currentIndex);
            }

            System.out.println("Полученный путь: " + path.toString());
        }
    }


