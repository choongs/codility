package com.codility.example.level3;

/**
 * Created by choonghyun on 12/02/2019.
 */
public class FrogJmp {
    public int solution1(int X, int Y, int D) {
        if (X == Y) return 0;

        int result = (Y - X) / D;
        result += ((Y - X) % D) == 0 ? 0 : 1;
        return result;
    }
}
