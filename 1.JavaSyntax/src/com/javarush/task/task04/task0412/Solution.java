package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if(x > 0) System.out.println(x * 2);//напишите тут ваш код
        if(x < 0) System.out.println(x + 1);
        if(x == 0) System.out.println(x);
    }

}