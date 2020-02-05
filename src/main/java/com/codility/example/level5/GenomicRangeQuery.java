package com.codility.example.level5;


import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by choonghyun on 21/02/2019.
 */
@Slf4j
public class GenomicRangeQuery {
    public int[] solution1(String S, int[] P, int[] Q) {

        int[] result = new int[P.length];

        for (int i = 0, len = P.length; i < len; i++) {
            char[] cArray = S.substring(P[i], (Q[i] + 1)).toCharArray();
            Arrays.sort(cArray);
            if (cArray[0] == 65) result[i] = 1;
            else if (cArray[0] == 67) result[i] = 2;
            else if (cArray[0] == 71) result[i] = 3;
            else result[i] = 4;
        }


        return result;
    }

    public int[] solution2(String S, int[] P, int[] Q) {

        int[] result = new int[P.length];

        for (int i = 0, len = P.length; i < len; i++) {
            char[] cArray = S.substring(P[i], (Q[i] + 1)).toCharArray();

            //Arrays.sort(cArray);
            int min = 4;
            for (char c : cArray) {
                int current = 0;
                if (c == 65) current = 1;
                else if (c == 67) current = 2;
                else if (c == 71) current = 3;
                else current = 4;

                if (current == 1) {
                    min = 1;
                    break;
                } else if (min > current) {
                    min = current;
                }
            }

            result[i] = min;
        }


        return result;
    }

    public int[] solution3(String S, int[] P, int[] Q) {

        int[] result = new int[P.length];

        for (int i = 0, len = P.length; i < len; i++) {
            //Stream<char[]> n = Stream.of(cArray).distinct().sorted();
            int min = S.substring(P[i], (Q[i] + 1)).chars().distinct().min().getAsInt();
            if (min == 65) result[i] = 1;
            else if (min == 67) result[i] = 2;
            else if (min == 71) result[i] = 3;
            else result[i] = 4;
        }


        return result;
    }

    public int[] solution4(String S, int[] P, int[] Q) {

        int[] result = new int[P.length];

        //List<Integer> list = new ArrayList<>();
        Integer[] temp = new Integer[S.length()];
        for (int i = 0, len = S.length(); i < len; i++) {
            if (S.charAt(i) == 65) temp[i] =1;
            else if (S.charAt(i) == 67)  temp[i] = 2;
            else if (S.charAt(i) == 71)  temp[i] = 3;
            else  temp[i] = 4;
        }



        return result;
    }
}
