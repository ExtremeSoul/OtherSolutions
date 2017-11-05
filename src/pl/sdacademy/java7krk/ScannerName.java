package pl.sdacademy.java7krk;

import java.util.Scanner;

public class ScannerName {

    public void nameInitial() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("PODAJ IMIE:");
        String name = scanner.nextLine();
//while (name.equals("q")) { lub pętla poniżej
        while (!name.isEmpty()) {

            if (name.endsWith("a")) {
                System.out.println(name + " jest kobieta");
            } else {
                System.out.println(name + " jest mezczyzna");
            }
            System.out.println("PODAJ IMIE:");
            name = scanner.nextLine();
        }
    }

}
