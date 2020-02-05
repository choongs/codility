package com.codility.example.level5;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * Created by choonghyun on 21/02/2019.
 */
@Slf4j
@RunWith(SpringRunner.class)
public class GenomicRangeQueryTest {
    private GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();

    @Test
    public void solution1() {
        String s = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] result = genomicRangeQuery.solution1(s, P, Q);
        log.info("result {}", result);
    }

    @Test
    public void solution2() {
        String s = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] result = genomicRangeQuery.solution2(s, P, Q);
        log.info("result {}", result);
    }

    @Test
     public void solution3() {
        String s = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] result = genomicRangeQuery.solution3(s, P, Q);
        log.info("result {}", result);
    }

    @Test
    public void solution4() {
        String s = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] result = genomicRangeQuery.solution4(s, P, Q);
        log.info("result {}", result);
    }

}
