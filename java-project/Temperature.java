import java.util.Scanner;

public class Temperature {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Введите температуру в градусах Цельсия: ");
        double temp = sc.nextDouble();
        System.out.println(temp + " градусов Цельсия, " + ((temp * 9/5) + 32) + " градусов Фаренгейта");
    }
}
