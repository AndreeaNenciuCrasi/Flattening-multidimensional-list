package com.company;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter list: ");
        String action = scanner.nextLine();
//        [ 1, 3, ["age", 5], "Kraków", [1, [3, [4, 5], "codecool"], 6, 7]]
        String str = action.replaceAll("[(\\[|\\])]", "");
        String[] b = str.split(",");
        List<Object> result = new ArrayList<>();
        for(String s: b){
            result.add(s.substring(1));
//            if(s.matches("^-?\\d+$")){
//                result.add(Integer.parseInt(s));
//            }else{
//                result.add(s);
//            }
        }

        System.out.println(result);
    }
}
