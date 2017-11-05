package pl.sdacademy.java7krk;

import java.util.Scanner;

public class CamelCaseCounter {

    public void counter() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("PODAJ ŁAŃCUCH CAMELÓW");
        String camel = scanner.nextLine();
        while (!camel.isEmpty()) {
            int counter = 0;
            for (int i = 0; i < camel.length(); i++) {
                if (i==0) {
                    counter++;
                }
                if (Character.isUpperCase(camel.charAt(i))) {
                    counter++;
                }
            }
            System.out.println(camel + " - " + counter);
            System.out.println("PODAJ ŁAŃCUCH CAMELÓW");
            camel = scanner.nextLine();
        }
    }

}
