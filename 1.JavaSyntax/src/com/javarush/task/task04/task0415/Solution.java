package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if((a + b) <= c || (b + c) <= a || (c + a) <= b){
            System.out.println("Треугольник не существует.");//напишите тут ваш код
        }else System.out.println("Треугольник существует.");
    }
}