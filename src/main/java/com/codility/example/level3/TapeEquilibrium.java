package com.codility.example.level3;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created by choonghyun on 12/02/2019.
 */
@Slf4j
public class TapeEquilibrium {

    //한방에 100%
    public int solution1(int[] A) {
        int total = 0;
        for (int i = 0; i < A.length; i++) {
            total += A[i];
        }

        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int P = 0; P < A.length - 1; P++) {
            int temp = Math.abs((sum + A[P]) - (total - A[P]));
            if (temp < min) min = temp;
            sum += A[P];
            total -= A[P];

        }


        return min;
    }

    //소스를 줄여보자
    //소스를 줄이니 퍼포먼스에서 탈락. 아마도 스트림을 이용해서 sum하는 부분...
    public int solution2(int[] A) {

        int post = Arrays.stream(A).sum();

        int min = Integer.MAX_VALUE;
        int pre = 0;
        for (int P = 0; P < A.length - 1; P++) {

            pre += A[P];
            post -= A[P];

            int temp = Math.abs(pre - post);
            if (temp < min) min = temp;
        }

        return min;
    }
}
