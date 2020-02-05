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
public class FrogJmpTest {

    private FrogJmp frogJmp = new FrogJmp();

    @Test
    public void solution1() {
        int x = 10;
        int y = 85;
        int d = 30;
        int result = frogJmp.solution1(x, y, d);

        log.info("" + result);
    }
}
