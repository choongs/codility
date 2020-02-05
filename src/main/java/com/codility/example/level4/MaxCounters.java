package com.codility.example.level4;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by choonghyun on 19/02/2019.
 */
@Slf4j
public class MaxCounters {

    //77%가 나온다.. 퍼포먼스 테스트에서 실패...
    // 도저히 모르겠다 사람들이 푼 답을 보고싶지만....참아야지
    // max count가 연속 발생시 skip처리 88%
    public int[] solution1(int N, int[] A) {

        int result[] = new int[N];
        int max = 0;
        boolean flag = false;
        for (int i = 0, len = A.length; i < len; i++) {
            if (N < A[i]) {
                if (!flag) {
                    flag = true;
                    for (int j = 0, size = result.length; j < size; j++) {
                        result[j] = max;
                    }
                }

            } else {
                flag = false;
                int index = A[i] - 1;
                if (++result[index] > max) max = result[index];
            }

        }
        return result;
    }


    //fail
    public int[] solution2(int N, int[] A) {

        int result[] = new int[N];
        int max = 0;
        boolean flag = false;
        Map<Integer, Integer> maxMap = new HashMap<>();
        ;
        List<Integer> maxList = new ArrayList<>();

        for (int i = 0, len = A.length; i < len; i++) {
            if (N < A[i]) {
                if (!flag) {
                    flag = true;
                    maxList.add(max);
                }

            } else {
                flag = false;
                int index = A[i] - 1;

                if (maxMap != null && maxMap.get(index) == null) {
                    result[index] = max + 1;
                    maxMap.put(index, 0);
                } else result[index] += 1;


                if (result[index] > max) {
                    max = result[index];
                }

            }

            log.info("result {}", result);
        }

        if (maxMap != null) {
            for (int i = 0, len = result.length; i < len; i++) {
                if (maxMap.get(i) == null) result[i] = max;

            }
        }

        return result;
    }
}
