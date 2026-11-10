package org.example;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double totalCost(){
        return price * quantity;
    }

    public void addStock(int amount){
        if (amount > 0) {
            quantity += amount;
        } else {
            System.out.println("Ошибка: количество для поступления должно быть положительным");
        }
    }

    public void sell(int amount) {
        if (amount <= 0) {
            System.out.println("Ошибка: количество для продажи должно быть положительным");
        } else if (amount > quantity) {
            System.out.println("Ошибка: недостаточно товара на складе");
        } else {
            quantity -= amount;
        }
    }

    public boolean isAvailable() {
        return quantity > 0;
    }
}
