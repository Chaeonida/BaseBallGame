package com.programmers.java.baseball.engine.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.function.BiConsumer;

//입력 받을 데이터
@AllArgsConstructor
@ToString
public class Numbers {
    private Integer[] nums;

    public void indexedForEach(BiConsumer<Integer, Integer> consumer) {
        for (int i = 0; i < nums.length; i++) {
            consumer.accept(nums[i], i);
        }
    }
}
