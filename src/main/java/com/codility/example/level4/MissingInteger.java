package com.codility.example.level4;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 * <p>
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * <p>
 * Given A = [1, 2, 3], the function should return 4.
 * <p>
 * Given A = [−1, −3], the function should return 1.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 * <p>
 * Created by choonghyun on 19/02/2019.
 */
@Slf4j
public class MissingInteger {

    public int solution(int[] A) {
        int result = 1;
        Arrays.sort(A);
        int pre = Integer.MIN_VALUE;
        for (int i : A) {

            if (i < 1) continue;

            if (pre == i) continue;
            else if (i == result) {
                pre = i;
                result++;
            } else {
                return result;
            }
        }

        return result;
    }
}
