package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if(1<= month && month <= 2 || month == 12){
            System.out.println("зима");//напишите тут ваш код
        }
        if(2 < month && month < 6){
            System.out.println("весна");
        }
        if(5 < month && month < 9){
            System.out.println("лето");
        }
        if(8 < month && month < 12){
            System.out.println("осень");
        }
    }
}