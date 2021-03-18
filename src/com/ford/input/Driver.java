package com.ford.input;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws InputMismatchException {
        String out = "";
        Algorithm alg = new Algorithm();
        System.out.print("Please enter an integer to be converted: ");
        try (Scanner sc = new Scanner(System.in);) {
            int input = sc.nextInt();
            out = alg.convert(input);
            System.out.print("Your output is: ");
        } catch (InputMismatchException e) {
            out = "Please input an integer next time.";
        } finally {
            System.out.println(out);
        }
    }
}
