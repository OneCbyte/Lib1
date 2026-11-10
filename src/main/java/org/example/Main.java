package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double calculatePercentage(double part, double total) {
        return (part / total) * 100;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Сумма: " + math.add(7, 2));
        System.out.println("Разность: " + math.subtract(7, 2));
        System.out.println("Произведение: " + math.multiply(7, 2));
        System.out.println("Частное: " + math.divide(7, 2));
        System.out.println("Максимум из 10 и 5: " + findMax(10, 5));
        System.out.println("Максимум из 3 и 8: " + findMax(3, 8));
        System.out.println("Площадь квадрата: " + squareArea(5));
        System.out.println("Периметр квадрата: " + squarePerimeter(5));
        System.out.println("Гипотенуза (3 и 4): " + findHypotenuse(3, 4));
        System.out.println("Гипотенуза (5 и 12): " + findHypotenuse(5, 12));
        System.out.println("Процент: " + calculatePercentage(25, 200));

        BankAccount acc1 = new BankAccount("Анна", 50000.0);
        BankAccount acc2 = new BankAccount("Борис", 15000.0);

        acc1.deposit(100000.0);
        acc2.withdraw(20000.0);

        System.out.println("Владелец: " + acc1.getOwner() + ", баланс: " + acc1.getBalance() + ", богатый счёт: " + acc1.isRich());
        System.out.println("Владелец: " + acc2.getOwner() + ", баланс: " + acc2.getBalance() + ", богатый счёт: " + acc2.isRich());
    }


}