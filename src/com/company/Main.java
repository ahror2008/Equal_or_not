package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        Scanner SS = new Scanner(in);

        System.out.println("1 son");
        int a = SS.nextInt();
        System.out.println("2 -son");
        int b = SS.nextInt();
        System.out.println("3- son");
        int c = SS.nextInt();
        if (a==b||a==c||c==b ){
            System.out.println(true);

        }else {
            System.out.println(false);
        }
}}
