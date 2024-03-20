package org.example;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] firms = {"Гучи", "Диор", "ДиорГучи"};
        String[][] Brands = {{"Гучи гучвотч", "Зара"}, {"Диор диорвотч", "ВкусноИТочка"}, {"ДиорГучи ДиорГучиВотч", "германия"}};
        ArrayList<String[]> customers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите имя покупателя:");
            String fullName = scanner.nextLine();
            System.out.println("Введите почту:");
            String email = scanner.nextLine();
            System.out.println("Введите номер телефона:");
            String phone = scanner.nextLine();
            System.out.println("Ввыберите из списка");
            for (int j = 0; j < firms.length; j++) {
                System.out.println((j + 1) + ". " + Brands[j][0] + " - " + Brands[j][1]);
            }
            System.out.println("Введите подходящую позицию:");
            int position = Integer.parseInt(scanner.nextLine()) - 1;
            System.out.println("Введите какое кол-во вы хотите:");
            int quantity = Integer.parseInt(scanner.nextLine());
            customers.add(new String[]{fullName, email, phone, firms[position], Brands[position][1], String.valueOf(quantity)});
        }
        for (String[] customer : customers) {
            System.out.println("Покупатель: " + customer[0]);
            System.out.println("Почта: " + customer[1]);
            System.out.println("Номер: " + customer[2]);
            System.out.println("Позиция: " + customer[3] + " - " + customer[4]);
            System.out.println("Кол-во: " + customer[5]);
            System.out.println();
        }
        scanner.close();
    }
}
