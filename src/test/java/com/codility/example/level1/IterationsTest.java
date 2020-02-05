package com.codility.example.level1;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by choonghyun on 09/02/2019.
 */
@Slf4j
@RunWith(SpringRunner.class)
public class IterationsTest {
    private Iterations iterations = new Iterations();

    @Test
    public void solution() {
        int n = 1041;
        log.info("" + iterations.solutions(n));
    }
}
