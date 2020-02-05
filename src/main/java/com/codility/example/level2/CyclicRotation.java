package com.codility.example.level2;

/**
 * Created by choonghyun on 11/02/2019.
 */
public class CyclicRotation {

    //Task Score 62%
    public int[] solution1(int[] A, int k) {


        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (i + k >= A.length) {
                B[(i + k - A.length)] = A[i];
            } else {
                B[i + k] = A[i];
            }


        }

        return B;
    }

    //Task Score 87%
    public int[] solution2(int[] A, int K) {

        if (A.length == 1 || K == 0 || A.length == K) return A;
        int[] B = new int[A.length];

        if (A.length < K) K = K - A.length;

        for (int i = 0; i < B.length; i++) {
            int j;
            if (i + K >= A.length) j = (i + K - A.length);
            else j = (i + K);

            B[j] = A[i];
        }

        return B;
    }

    //Task Score 87%
    public int[] solution3(int[] A, int K) {
        if (A.length == 1 || K == 0 || A.length == K) return A;
        int[] B = new int[A.length];
        if (A.length < K) K = K % A.length;

        for (int i = 0; i < B.length; i++) {
            int j;
            if (i + K >= A.length) j = (i + K - A.length);
            else j = (i + K);

            B[j] = A[i];
        }

        return B;
    }

    //Task score 100%
    public int[] solution4(int[] A, int K) {

        if (A.length <= 1 || K == 0 || A.length == K) return A;
        int[] B = new int[A.length];
        if (A.length < K) K = K % A.length;

        for (int i = 0; i < B.length; i++) {
            int j;
            if (i + K >= A.length) j = (i + K - A.length);
            else j = (i + K);

            B[j] = A[i];
        }

        return B;
    }
}
