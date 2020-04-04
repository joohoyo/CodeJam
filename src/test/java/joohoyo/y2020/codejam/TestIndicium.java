package joohoyo.y2020.codejam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TestIndicium {
    @Test
    public void test() {
        Indicium i = new Indicium();

        Map<String, int[][]> map = new HashMap<>();

        i.solution(2, 3);
        Assertions.assertTrue(i.getAnswer() == null);

        i.solution(3, 6);
        Assertions.assertTrue(i.getAnswer() != null);

        i.solution(4, 4);
        Assertions.assertTrue(i.getAnswer() != null);

        i.solution(5, 5);
        Assertions.assertTrue(i.getAnswer() != null);

        i.solution(5, 25);
        Assertions.assertTrue(i.getAnswer() != null);

        i.solution(5, 9);
        Assertions.assertTrue(i.getAnswer() != null);
    }
}
