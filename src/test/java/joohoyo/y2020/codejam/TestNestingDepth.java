package joohoyo.y2020.codejam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNestingDepth {
    @Test
    public void test() {
        NestingDepth n = new NestingDepth();

        Assertions.assertEquals("0000", n.solution("0000"));
        Assertions.assertEquals("(1)0(1)", n.solution("101"));
        Assertions.assertEquals("(111)000", n.solution("111000"));
        Assertions.assertEquals("(1)", n.solution("1"));
        Assertions.assertEquals("0((2)1)", n.solution("021"));
        Assertions.assertEquals("(((3))1(2))", n.solution("312"));
        Assertions.assertEquals("((((4))))", n.solution("4"));
        Assertions.assertEquals("((22)1)", n.solution("221"));
    }
}
