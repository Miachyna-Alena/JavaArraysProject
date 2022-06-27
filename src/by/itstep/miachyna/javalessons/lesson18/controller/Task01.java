package by.itstep.miachyna.javalessons.lesson18.controller;

import by.itstep.miachyna.javalessons.lesson18.view.Printer;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
    }
}
