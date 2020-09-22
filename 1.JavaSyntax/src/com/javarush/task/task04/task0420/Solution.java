package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a <= b && b <= c) System.out.println( c + " " + b + " " + a);
        else if (a <= c && c <= b) System.out.print("\n" + b + " " + c + " " + a);
        else if (b <= a && a <= c) System.out.print("\n" + c + " " + a + " " + b);
        else if (b <= c && c <= a) System.out.print("\n" + a + " " + c + " " + b);
        else if (c <= a && a <= b) System.out.print("\n" + b + " " + a + " " + c);
        else if (c <= b && b <= a)System.out.print("\n" + a + " " + b + " " + c);

    }
}
