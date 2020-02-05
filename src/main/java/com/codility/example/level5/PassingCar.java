package com.codility.example.level5;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by choonghyun on 21/02/2019.
 */
@Slf4j
public class PassingCar {
    public int solution1(int[] A) {
        if (A.length == 1) return -1;
        int count = 0;
        for (int i = 0, len = A.length; i < len; i++) {
            if (A[i] == 1) continue;
            for (int j = i + 1, len2 = A.length; j < len2; j++) {
                if (A[j] == 1) count++;

            }

        }
        return count;
    }

    //문제 이해가 잘안되었지만 이해하면 참쉽다
    //처음엔 중첩으로 해결, 성능에서 실패 중첩 for문 제거
    //뒤에서부터 1일때만 카운트를 하다가 0을 만나면 sum += count
    public int solution2(int[] A) {
        //사실 이부분도 필요없다.
        if (A.length == 1) return 0;

        long count = 0;

        int[] pair = new int[A.length];

        int cnt = 0;
        for (int i = (pair.length - 1); i >= 0; i--) {
            if (A[i] == 0) {
                count += cnt;
            } else cnt++;
        }

        if (1000000000 < count) return -1;
        return (int) count;

    }
}
