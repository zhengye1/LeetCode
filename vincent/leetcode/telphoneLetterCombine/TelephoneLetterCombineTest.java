package vincent.leetcode.telphoneLetterCombine;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TelephoneLetterCombineTest {
    TelephoneLetterCombine t = new TelephoneLetterCombine();

    @Test
    void testCase1() {
        List<String> res = t.letterCombinations("23");
        List<String> expected = List.of("ad","ae","af","bd","be","bf","cd","ce","cf");
        Collections.sort(res);
        assert(res.equals(expected));
    }

    @Test
    void testCase2() {
        List<String> res = t.letterCombinations("");
        assert(res.isEmpty());
    }

    @Test
    void testCase3() {
        List<String> res = t.letterCombinations("2");
        List<String> expected = List.of("a", "b", "c");
        Collections.sort(res);
        assert(res.equals(expected));
    }
}
