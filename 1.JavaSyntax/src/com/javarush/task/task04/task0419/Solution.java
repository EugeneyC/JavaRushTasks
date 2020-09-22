package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int ab, cd, max;

        int a = scanner.nextInt();//напишите тут ваш код
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        ab = Math.max(a, b);
        cd = Math.max(c, d);
        System.out.println(max = Math.max(ab, cd));




    }
}
