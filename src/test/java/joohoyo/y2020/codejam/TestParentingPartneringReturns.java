package joohoyo.y2020.codejam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.Is.is;

public class TestParentingPartneringReturns {
    @Test
    public void test() {
        ParentingPartneringReturns p = new ParentingPartneringReturns();
        assertThat(
                p.solution(3, new int[][]{{360, 480}, {420, 540}, {600, 660}}),
                anyOf(is("CJC"), is("JCC"), is("JCJ"), is("CJJ"))
        );
        Assertions.assertEquals(
                "IMPOSSIBLE",
                p.solution(3, new int[][]{{0, 1440}, {1, 3}, {2, 4}})
        );
        assertThat(
                p.solution(5, new int[][]{{99, 150}, {1, 100}, {100, 301}, {2, 5}, {150, 250}}),
                anyOf(is("JCCJJ"), is("CJJCC"))
        );
        assertThat(
                p.solution(2, new int[][]{{0, 720}, {720, 1440}}),
                anyOf(is("CC"), is("JJ"), is("CJ"), is("JC"))
        );
        assertThat(
                p.solution(3, new int[][]{{100, 200}, {1, 100}, {100, 200}}),
                anyOf(is("CCJ"), is("JJC"))
        );
    }

}
