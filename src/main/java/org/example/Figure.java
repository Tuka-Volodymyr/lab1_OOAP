package org.example;

abstract class Figure {
  // Конструктор, який виводить повідомлення при створенні об'єкта
  public Figure() {
    System.out.println("Об’єкт створено");
  }

  public abstract double calculateArea();

  // Метод для виведення площі
  public void printArea() {
    System.out.println("Площа фігури: " + calculateArea());
  }
}
