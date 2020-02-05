package com.codility.example.level4;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by choonghyun on 19/02/2019.
 */
@Slf4j
@RunWith(SpringRunner.class)
public class MissingIntegerTest {

    public MissingInteger missingInteger = new MissingInteger();

    @Test
    public void solution1() {
        int A[] = {1, 3, 6, 4, 1, 2};
        int result = missingInteger.solution(A);
        log.info("result {}", result);
    }
}
