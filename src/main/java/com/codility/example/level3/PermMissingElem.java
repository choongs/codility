package com.codility.example.level3;

import java.util.Arrays;

/**
 * Created by choonghyun on 12/02/2019.
 */
public class PermMissingElem {
    public int solution1(int[] A) {

        Arrays.sort(A);
        int pre = 0;
        for (int i : A) {
            if (++pre != i) break;
        }
        return pre;
    }

    // 배열의 크기가 0인 경우
    public int solution2(int[] A) {
        int pre = 0;

        if (A.length == 0) return ++pre;

        Arrays.sort(A);

        for (int i : A) {
            if (++pre != i) break;
        }
        return pre;
    }

    // 배열의 크기가 1인 경우
    public int solution3(int[] A) {


        if (A.length == 0) return 1;
        int pre = 1;
        Arrays.sort(A);

        for (int i : A) {
            if (pre != i) break;
            pre++;
        }
        return pre;
    }
}
