package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a == b && c != b) System.out.print(a + " " + b);//напишите тут ваш код
        if(a == c && c != b) System.out.print(a + " " + c);
        if(b == c && a != b) System.out.print(b + " " + c);
        if(a == b && b == c) {
            System.out.print(a + " " + b + " " + c);

        }
    }
}