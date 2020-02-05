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
public class PermMissingElemTest {

    private PermMissingElem permMissingElem = new PermMissingElem();

    @Test
    public void solution1() {
        int A[] = {2, 3, 1, 5};

        int result = permMissingElem.solution1(A);
        log.info(result + "");
    }

    @Test
    public void solution2() {
        int A[] = {};

        int result = permMissingElem.solution2(A);
        log.info(result + "");
    }

    @Test
    public void solution3() {
        int A[] = {1};
        int result = permMissingElem.solution3(A);
        log.info(result + "");
    }
}
