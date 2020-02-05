package com.codility.example.level1;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by choonghyun on 09/02/2019.
 */
@Slf4j
public class Iterations {

    /**
     * 입력받은 십진수를 이진수로 변경 후 나열된 0이 갯수가 가장 큰 값을 리턴
     * 1041 -> 10000010001 -> 갭이 가장큰 값은 5
     *
     * @param n 정수
     * @return
     */
    public int solutions(int n) {

        String b = Integer.toBinaryString(n);
        int cnt = 0;
        int length = b.length();
        int max = 0;
        for (int i = 0; i < length; i++) {
            if ('0' == b.charAt(i)) cnt++;
            else {
                if (max < cnt) max = cnt;
                cnt = 0;
            }

        }

        if (cnt > 0 && max == 0) cnt = max;

        return max;

    }
}
