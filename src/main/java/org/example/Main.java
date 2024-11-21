package org.example;

public class Main {
  public static void main(String[] args) {
    // Створення об'єктів різних фігур
    Figure square = new Square(5);
    square.printArea();  // Виведе площу квадрата

    Figure rectangle = new Rectangle(4, 6);
    rectangle.printArea();  // Виведе площу прямокутника

    Figure circle = new Circle(3);
    circle.printArea();  // Виведе площу круга
  }
}