package com.codility.example.level5;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by choonghyun on 21/02/2019.
 */
@Slf4j
@RunWith(SpringRunner.class)
public class PassingCarTest {

    private PassingCar passingCar = new PassingCar();

    @Test
    public void solution1() {
        int A[] = {0, 1, 0, 1, 1};
        int result = passingCar.solution1(A);
        log.info("result {}", result);
    }

    @Test
    public void solution2() {
        int A[] = {0, 1, 0, 1, 1};
        int result = passingCar.solution2(A);
        log.info("result {}", result);
    }
}
