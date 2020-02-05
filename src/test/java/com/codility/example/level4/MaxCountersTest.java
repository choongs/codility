package com.codility.example.level4;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

/**
 * Created by choonghyun on 19/02/2019.
 */
@Slf4j
@RunWith(SpringRunner.class)
public class MaxCountersTest {
    private MaxCounters maxCounters = new MaxCounters();

    @Test
    public void solution1() {
        int N = 5;
        int A[] = {3, 4, 4, 6, 1, 4, 4};
        int[] result = maxCounters.solution1(N, A);
        for (int i : result) {
            log.info("result {} ", i);
        }
    }

    @Test
    public void solution2() {
        int N = 5;
        int A[] = {6, 6, 6, 6, 6, 6};
        int[] result = maxCounters.solution1(N, A);
        for (int i : result) {
            log.info("result {} ", i);
        }

    }

    @Test
    public void solution3() {
        int N = 2;
        int A[] = {2};
        int[] result = maxCounters.solution2(N, A);
        for (int i : result) {
            log.info("result {} ", i);
        }

    }

    @Test
    public void test() {
        int[] arr = new int[1000];
        Arrays.fill(arr, 0);
        int max = 2;

        for (int i : arr) {
            log.info("int {}", i);
        }
    }
}
