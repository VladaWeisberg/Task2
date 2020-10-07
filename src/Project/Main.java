package Project;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        startProgram();
    }

    public static void startProgram() {
        int restart = 1;
        while(restart == 1) {
            int value = checkCardValue();
            int suit = checkCardSuit();

            findCardValue(value);
            findCardSuit(suit);

            restart = readInt("1 if you want to continue the program");
        }

    }

    public static int checkCardValue() {
        int value = readInt("'n' card's value from 6 to 14 ");

        for(Scanner scanner = new Scanner(System.in); value < 6 || value > 14; value = scanner.nextInt()) {
            System.out.println("enter another number 'n'");
        }

        return value;
    }

    public static int checkCardSuit() {
        int suit = readInt("'m' card's suit from 1 to 4 ");

        for(Scanner scanner = new Scanner(System.in); suit < 1 || suit > 4; suit = scanner.nextInt()) {
            System.out.println("enter another number 'm'");
        }

        return suit;
    }

    static void findCardValue(int value) {
        switch(value) {
            case 6:
                System.out.print("шестёрка");
                break;
            case 7:
                System.out.print("семёрка");
                break;
            case 8:
                System.out.print("восьмёрка");
                break;
            case 9:
                System.out.print("девятка");
                break;
            case 10:
                System.out.print("десятка");
                break;
            case 11:
                System.out.print("валет");
                break;
            case 12:
                System.out.print("дама");
                break;
            case 13:
                System.out.print("король");
                break;
            case 14:
                System.out.print("туз");
        }

    }

    static void findCardSuit(int suit) {
        switch(suit) {
            case 1:
                System.out.println(" пик");
                break;
            case 2:
                System.out.println(" треф");
                break;
            case 3:
                System.out.println(" бубен");
                break;
            case 4:
                System.out.println(" червей");
        }

    }

    public static int readInt(String name) {
        System.out.printf("Input number %s ", name);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
