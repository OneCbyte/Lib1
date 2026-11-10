package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int difference(int x, int y){
        if (x - y > 0) {
            return x - y;
        }
        else {
            return (x - y) * -1;
        }
    }
    public static double convertSecondsToMinutes(int seconds){
        return (double) seconds / 60;
    }
    public static double circleCircumference(double radius){
        return radius * 2 * Math.PI;
    }
    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Сумма: " + math.add(7, 2));
        System.out.println("Разность: " + math.subtract(7, 2));
        System.out.println("Произведение: " + math.multiply(7, 2));
        System.out.println("Частное: " + math.divide(7, 2));

        System.out.println("Модуль (10 - 4): " + difference(10, 4));
        System.out.println("Модуль (4 - 10): " + difference(4, 10));

        System.out.println("Минут: " + convertSecondsToMinutes(120));
        System.out.println("Минут: " + convertSecondsToMinutes(90));

        System.out.println("Длина окружности (r=5): " + circleCircumference(5.0));
        System.out.println("Длина окружности (r=10): " + circleCircumference(10.0));

        double f = celsiusToFahrenheit(100.0);
        System.out.println("100.0 C = " + f + " F");
        System.out.println(f + " F = " + fahrenheitToCelsius(f) + " C");

        Product p1 = new Product("Ноутбук", 50000.0, 10);
        Product p2 = new Product("Телефон", 30000.0, 5);

        p1.addStock(5);
        p1.sell(3);
        p2.sell(10);

        System.out.println("Товар: " + p1.getName() + ", количество: " + p1.getQuantity() + ", общая стоимость: " + p1.totalCost() + ", доступен: " + p1.isAvailable());
        System.out.println("Товар: " + p2.getName() + ", quantity: " + p2.getQuantity() + ", общая стоимость: " + p2.totalCost() + ", доступен: " + p2.isAvailable());
    }


}