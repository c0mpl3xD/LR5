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
        double i;
        do {
            System.out.print("Введіть число (введіть 0 для завершення): ");
            i = scanner.nextDouble();
            if (i != 0){
                double roundI = (double)Math.round(i * 1000)/1000;
                System.out.println("Округлене число: " + roundI);
            }
        } while (i != 0);
        System.out.println("Було введене число 0");


        //Task 4

    }
}
