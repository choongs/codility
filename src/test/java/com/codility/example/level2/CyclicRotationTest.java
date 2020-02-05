package com.codility.example.level2;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by choonghyun on 11/02/2019.
 */
@Slf4j
@RunWith(SpringRunner.class)
public class CyclicRotationTest {

    private CyclicRotation cyclicRotation = new CyclicRotation();

    @Test
    public void solution1() {
        int[] A = {3, 8, 9, 7, 6};
        int k = 3;
        int[] B = cyclicRotation.solution1(A, k);

        for (int i : B) {
            log.info("" + i);
        }

    }

    @Test
    public void solution2() {
        int[] A = {3, 8, 9, 7, 6};
        int k = 3;
        int[] B = cyclicRotation.solution2(A, k);

        for (int i : B) {
            log.info("" + i);
        }
    }

    @Test
    public void solution3() {
        int[] A = {1, 1, 2, 3, 5};
        int k = 42;
        int[] B = cyclicRotation.solution3(A, k);

        for (int i : B) {
            log.info("" + i);
        }
    }

    @Test
    public void solution4() {
        int[] A = {};
        int k = 4;
        int[] B = cyclicRotation.solution4(A, k);

        for (int i : B) {
            log.info("" + i);
        }
    }
}
