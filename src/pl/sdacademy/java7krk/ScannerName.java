package pl.sdacademy.java7krk;

import java.util.Scanner;

public class ScannerName {

    public void nameInitial(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("PODAJ IMIE:");
        String name = scanner.nextLine();

        if (name.endsWith("a")) {
            System.out.println(name + " jest kobieta");
        } else {
            System.out.println(name + " jest mezczyzna");
        }
    }

}
