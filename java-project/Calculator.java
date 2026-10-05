import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Введите число a:");
        int a = scanner.nextInt();
        System.out.println("Введите число b:");
        int b = scanner.nextInt();
        System.out.println("Выберите операцию: ");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println(addition(a, b));
                break;
            case 2:
                System.out.println(substraction(a, b));
                break;
            case 3:
                System.out.println(multiplication(a, b));
                break;
            case 4:
                System.out.println(division(a, b));
                break;
        }
    }
    public static int addition(int a, int b){
        return a + b;
    }
    
    public static int substraction(int a, int b){
        return a - b;
    }
    
    public static int multiplication(int a, int b){
        return a * b;
    }
    
    public static int division(int a, int b){
        return a / b;
    }
}
