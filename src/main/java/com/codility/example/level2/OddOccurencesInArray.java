package com.codility.example.level2;

import java.util.Arrays;

/**
 * 배열의 값을 비교해서 같은값 끼리 묶어서 남는 값을 리턴 해줌
 * <p>
 * Created by choonghyun on 11/02/2019.
 */
public class OddOccurencesInArray {
    public int solution1(int[] A) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) continue;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] == 0) continue;
                if (A[i] == A[j]) {
                    A[i] = 0;
                    A[j] = 0;
                    break;
                }

            }
            if (A[i] != 0) {
                result = A[i];
                break;
            }

        }

        return result;
    }

    public int solution2(int[] A) {

        if (A.length == 1) return A[0];

        Arrays.sort(A);
        int result = 0;
        int i = 0;
        while (i < A.length) {
            if (i == A.length - 1 || A[i] != A[i + 1]) {
                result = A[i];
                break;
            }
            i = i + 2;

        }

        return result;
    }
}
