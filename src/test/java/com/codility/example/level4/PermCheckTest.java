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
public class PermCheckTest {
    private PermCheck permCheck = new PermCheck();

    @Test
    public void solution1() {

        int[] A = {4, 3, 2, 1};

        int result = permCheck.solution1(A);
        log.info("reuslt {}", result);
    }
}
