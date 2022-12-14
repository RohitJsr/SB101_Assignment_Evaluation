package com.masaiQ2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("d/M/u", Locale.ENGLISH);
        LocalDate today = LocalDate.now();
        boolean valid;

        do {
            valid = true;
            System.out.print("Date of birth DD/MM/YYYY: ");
            String strDate = sc.nextLine();
            LocalDate date = null;
            try {
                date = LocalDate.parse(strDate, parser);
                if (date.isAfter(today)) {
                    System.out.println("The date should not be a future date. Please try again.");
                    valid = false;
                }
            } catch (DateTimeException e) {
                System.out.println("Invalid date/format. Please enter the date in correct format.");
                valid = false;
            }
        } while (!valid);

        System.out.println("Thank you! Processing ...");
    }
}