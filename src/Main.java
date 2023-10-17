import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 1

        //Task 2
        DecimalFormat df = new DecimalFormat("#.0");
        for (double x = 3; x < 4; x+=0.1){
            double y = 1/Math.pow(x,x);
            System.out.println("y = 1/" + df.format(x) + "^" + df.format(x) + " = " + y);
        }
        //Task 3
        Scanner scanner = new Scanner(System.in);
        double x;
        do {
            System.out.print("Введіть число (введіть 0 для завершення): ");
            x = scanner.nextDouble();
            if (x != 0){
                double roundI = (double)Math.round(x * 1000)/1000;
                System.out.println("Округлене число: " + roundI);
            }
        } while (x != 0);
        System.out.println("Було введене число 0");
        //Task 4
        scanner.nextLine();
        int totalVowels = 0;

        System.out.println("Введіть 10 рядків:");

        for (int i = 0; i < 10; i++){
            System.out.print("Рядок " + (i + 1) + ": ");
            String input = scanner.nextLine();

            int vowelsInString = countVowels(input);
            System.out.println("Кількість голосних літер у рядку: " + vowelsInString);

            totalVowels += vowelsInString;
        }
        System.out.println("Загальна кількість голосних літер у всіх рядках: " + totalVowels);
    }
    private static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouyAEIOUYаеёиоуыэюяіїАЕЁИОУЫЭЮЯІЇ";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }

        return count;
    }
}
