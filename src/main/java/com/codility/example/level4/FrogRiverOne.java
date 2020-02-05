package com.codility.example.level4;

/**
 * Created by choonghyun on 18/02/2019.
 */
public class FrogRiverOne {

    //1.처음엔 단순 인덱스읽어오는줄 알았다....
    //2.두번째는  X까지 건너다가 마지막 X을 건너는줄 알았다..
    public int solution1(int X, int[] A) {
        int leaf[] = new int[X];

        int result = -1;
        int cnt = 0;
        for (int i = 0; i < A.length; i++) {
            if (X == A[i] && (cnt + 1) == X) {
                result = i;
            } else if (X > A[i] && leaf[A[i]] != 1) {
                leaf[A[i]] = 1;
                cnt++;

            }

        }
        return result;
    }

    //1~X까지 순서에 상관없이 밟아서 가면된다...
    // 영알못이라 해석이 안되고 누가 해석한거를 읽어도 이해가 안됨...슬프다
    public int solution2(int X, int[] A) {
        int leaf[] = new int[X];

        int result = -1;
        int cnt = 0;
        for (int i = 0; i < A.length; i++) {
            if (X >= A[i] && leaf[A[i] - 1] != 1) {
                leaf[A[i] - 1] = 1;
                if (++cnt == X) {
                    result = i;
                    break;
                }

            }

        }
        return result;
    }
}
