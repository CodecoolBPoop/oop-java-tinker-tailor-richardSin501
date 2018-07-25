package com.codecool;

import java.util.ArrayList;
import java.util.List;


public class Tinker {

    private List<Integer> tinkerList = new ArrayList<>();
    private final int N;
    private final int K;

    public Tinker(int N, int K) {
        this.N = N;
        this.K = K;
        for (int i = 1; i <= N; i++) {
            tinkerList.add(i);
        }
    }

    public void run() {
        int iterator = K - 1;

        while (!tinkerList.isEmpty()) {
            iterator %= tinkerList.size();
            System.out.println(
                tinkerList.remove(iterator)
            );
            iterator += K - 1;
        }
    }

    public static void main(String[] args) {
        Tinker tinker = new Tinker(5, 3);
        tinker.run();
    }
}
