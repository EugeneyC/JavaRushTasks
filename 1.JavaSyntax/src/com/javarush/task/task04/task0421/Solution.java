package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

        int len1 = name1.length();
        int len2 = name2.length();

        if(name1.equals(name2)){
            System.out.println("Имена идентичны");//напишите тут ваш код
        }else if (len1 == len2){
            System.out.println("Длины имен равны");//напишите тут ваш код
        }
    }
}
