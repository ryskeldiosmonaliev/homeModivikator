package com.company;

import java.util.Scanner;

import static com.company.Circle.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      radius=scanner.nextDouble();
        System.out.println(area());
        System.out.println(curcumferense());
    }
}