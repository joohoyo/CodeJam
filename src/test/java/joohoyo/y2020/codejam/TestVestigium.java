package joohoyo.y2020.codejam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestVestigium {
    @Test
    public void test() {
        Vestigium v = new Vestigium();

        assertArrayEquals(
                new int[]{4, 0, 0},
                v.solution(4, new int[][]{{1, 2, 3, 4}, {2, 1, 4, 3}, {3, 4, 1, 2}, {4, 3, 2, 1}})
        );

        assertArrayEquals(
                new int[]{9, 4, 4},
                v.solution(4, new int[][]{{2, 2, 2, 2}, {2, 3, 2, 3}, {2, 2, 2, 3}, {2, 2, 2, 2}})
        );

        assertArrayEquals(
                new int[]{8, 0, 2},
                v.solution(3, new int[][]{{2, 1, 3}, {1, 3, 2}, {1, 2, 3}})
        );

        assertArrayEquals(
                new int[]{3, 3, 3},
                v.solution(3, new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}})
        );
    }
}
