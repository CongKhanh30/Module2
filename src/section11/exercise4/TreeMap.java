package section11.exercise4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TreeMap {
    public static void main(String[] args) {
        Map<Character, Integer> maps = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if(maps.containsKey(key)){
                int value = maps.get(key);
                value++;
                maps.put(key, value);
            } else
                maps.put(key, 1);
        }
        System.out.println(maps);
    }
}