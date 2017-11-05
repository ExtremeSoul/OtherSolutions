package pl.sdacademy.java7krk;

import java.util.Scanner;

public class CamelCaseCounter {

    public void counter() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("PODAJ ŁAŃCUCH CAMELÓW");
        String camel = scanner.nextLine();
        while (!camel.isEmpty()) {
            int counter = 0;
            if (camel.isEmpty() || Character.isUpperCase(camel.charAt(0))){
                System.out.println("THIS IS NOT CAMEL CASE");
                return;
            }
            for (int i = 0; i < camel.length(); i++) {
                if (i==0){
                    counter++;
                }
                if (Character.isDigit(camel.charAt(i))){
                    System.out.println("WORD SHOULD NOT CONTAIN DIGITS");
                    return;
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
