package by.itacademy.lessson5.task2;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Size:");
        int n = scan.nextInt();
        Lot group = new Lot(n);
        group.input();
        group.middleAge();
    }
}