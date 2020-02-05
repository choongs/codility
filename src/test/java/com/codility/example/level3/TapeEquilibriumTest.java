package com.codility.example.level3;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by choonghyun on 12/02/2019.
 */
@Slf4j
@RunWith(SpringRunner.class)
public class TapeEquilibriumTest {
    private TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    @Test
    public void solution1() {
        int[] A = {3, 1, 2, 4, 3};
        int result = tapeEquilibrium.solution1(A);
        log.info(result + "");

    }

    @Test
    public void solution2() {
        int[] A = {3, 1, 2, 4, 3};
        int result = tapeEquilibrium.solution2(A);
        log.info(result + "");

    }
}
