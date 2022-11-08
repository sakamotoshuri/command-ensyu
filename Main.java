import java.util.Scanner;

public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("身長(m)：");
        double height = scanner.nextDouble();
        System.out.print("体重(kg)：");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);
        double a = ((double)Math.round(bmi * 100))/100;
        System.out.print("BMI："+a);
    }
}
