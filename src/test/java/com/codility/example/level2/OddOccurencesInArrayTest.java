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
public class OddOccurencesInArrayTest {
    private OddOccurencesInArray oddOccurencesInArray = new OddOccurencesInArray();


    @Test
    public void solution1() {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        int result = oddOccurencesInArray.solution1(A);
        log.info("" + result);
    }

    @Test
    public void solution2() {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        int result = oddOccurencesInArray.solution2(A);
        log.info("" + result);
    }
}
