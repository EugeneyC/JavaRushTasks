package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
       reset();
    }

    public static CanFly result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true){
                String str = reader.readLine();
                if(str.equals("helicopter")){
                    result = new Helicopter();
                    break;
                }if(str.equals("plane")){
                    String str1 = reader.readLine();
                    int count = Integer.parseInt(str1);
                    result = new Plane(count);
                    break;
                }
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        //add your code here - добавьте код тут
    }
}
