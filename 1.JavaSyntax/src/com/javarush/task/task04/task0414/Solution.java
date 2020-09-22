package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        int days;

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if( (x % 4) == 0){
            if( (x % 100) == 0){
                if(x % 400 == 0){
                    days = 366;
                }else days = 365;
            }else days = 366;
        } else days = 365;
        System.out.println("количество дней в году: " + days);
    }
}