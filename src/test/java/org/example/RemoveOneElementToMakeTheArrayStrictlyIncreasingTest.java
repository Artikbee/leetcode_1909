package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveOneElementToMakeTheArrayStrictlyIncreasingTest {

    RemoveOneElementToMakeTheArrayStrictlyIncreasing remove = new RemoveOneElementToMakeTheArrayStrictlyIncreasing();

    @Test
    public void canBeIncreasing() {
        boolean result = remove.canBeIncreasing(new int[]{2,3,1,2});
        Assertions.assertFalse(result);
    }
}