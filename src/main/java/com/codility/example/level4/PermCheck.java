package com.codility.example.level4;

import java.util.Arrays;

/**
 * Created by choonghyun on 18/02/2019.
 */
public class PermCheck {

    // 순열인지 아닌지 체크.. 사실 순열을 몰랐다 정확히 말하자면 까먹었다..늙었나보다.
    // 순열이면 1 아니면 0
    public int solution1(int[] A) {
        Arrays.sort(A);
        int result = 1;
        for (int i = 0; i < A.length; i++) {
            if ((i + 1) != A[i]) {
                result = 0;
                break;
            }
        }
        return result;
    }
}
