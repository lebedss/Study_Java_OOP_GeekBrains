package Homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GeoTree gt = new GeoTree();
        Scanner scanner = new Scanner(System.in);
        Output.setTree(gt);
        Output.loadFromFile();
        while (true) {
            System.out.println("Выберите действие:\n1. Вывести список людей\n2. Добавить отношение\n3. " +
                    "Найти отношение\n4.Выйти");
            int answer = scanner.nextInt();
            switch (answer) {
                case 1 -> gt.showNames();
                case 2 -> {
                    System.out.println("Введите имя: ");
                    String name = scanner.next();
                    System.out.println("Введите отношение: ");
                    String relation = scanner.next();
                    System.out.println("Введите имя оппонента: ");
                    String nameTwo = scanner.next();
                    Person person = new Person(name);
                    Person person2 = new Person(nameTwo);
                    switch (Relationship.valueOf(relation)) {
                        case sister -> gt.appendSisters(person, person2);
                        case brother -> gt.appendBrothers(person, person2);
                        case parent -> gt.append(person, person2);
                        case motherInLaw -> gt.appendMotherInLaw(person, person2);
                    }
                }
                case 3 -> {
                    gt.showNames();
                    System.out.println("Введите имя человека из списка: ");
                    String name = scanner.next();
                    Person person = new Person(name);
                    for (Relationship r : Relationship.values()) {
                        System.out.println(r);
                    }
                    System.out.println("Выберите отношение: ");
                    String relation = scanner.next();
                    Output.showInConsole(person, Relationship.valueOf(relation));
                }
                case 4 -> {
                    return;
                }
            }

        }


    }

}
