package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты

Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.


Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все байты из файла с максимальным количеством повторов.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        while(fileInputStream.available() > 0){
           arrayList.add(fileInputStream.read());
        }
        fileInputStream.close();
        bufferedReader.close();

        Collections.sort(arrayList);

        integers.addAll(arrayList);

        int count = 0;
        for (int i = 0; i < arrayList.size(); i++){
            for (int j = 0; j < integers.size();j++){
                if( arrayList.get(i) == integers.get(j)){
                    count++;
                }
            }
            hashMap.put(arrayList.get(i), count);
            count = 0;
        }
        int maxValue = Collections.max(hashMap.values());
        for (Map.Entry<Integer, Integer> map :
                hashMap.entrySet()) {
            if (map.getValue() == maxValue) {
                System.out.print(map.getKey() + " ");
            }
        }

    }
}
