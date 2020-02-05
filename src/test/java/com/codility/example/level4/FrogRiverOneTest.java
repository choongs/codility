package com.codility.example.level4;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by choonghyun on 18/02/2019.
 */
@Slf4j
@RunWith(SpringRunner.class)
public class FrogRiverOneTest {
    private FrogRiverOne frogRiverOne = new FrogRiverOne();

    @Test
    public void solution1() {
        int X = 5;
        int A[] = {1, 3, 1, 4, 2, 3, 5, 4};
        int result = frogRiverOne.solution1(X, A);
        log.info("resutl {}", result);
    }

    @Test
    public void solution2() {
        int X = 3;
        int A[] = {1, 3, 1, 3, 2, 1, 3};
        int result = frogRiverOne.solution2(X, A);
        log.info("resutl {}", result);
    }
}
