package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] str2 = (str.substring(str.indexOf('?')+1).split("&"));//add your code here
        String[] str3 = new String[2];
        boolean b = false;
        boolean obj = false;
        Double doubles = null;
        String stringF = "";

        for (String string: str2){
            str3 = string.split("=");
            System.out.print(str3[0] + " ");
            if(str3[0].equals("obj")) {
                if(str3.length > 1) {
                    obj = true;
                    try {
                        doubles = Double.parseDouble(str3[1]);
                        //
                       b = true;
                    } catch (NumberFormatException nfe) {
                        stringF = str3[1];
                       b = false;
                    }
                }
            }
        } if(b){
            System.out.println();
            alert(doubles);
        }else {
            if(obj) {
                System.out.println();
                alert(stringF);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
