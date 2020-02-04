import anagram.AnagramChecker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramCheckerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isAnagram() {


        assertTrue(AnagramChecker.isAnagram("table","bleat"));
        assertTrue(AnagramChecker.isAnagram("boy","oyb"));
        assertTrue(AnagramChecker.isAnagram("bbb","bbb"));
        assertTrue(AnagramChecker.isAnagram("student","sdtetun"));


        assertFalse(AnagramChecker.isAnagram("tbdle","bleat"));
        assertFalse(AnagramChecker.isAnagram("byd","oyb"));
        assertFalse(AnagramChecker.isAnagram("bbd","bbb"));
        assertFalse(AnagramChecker.isAnagram("suddent","sdtetun"));
        assertFalse(AnagramChecker.isAnagram("hello","helo"));



        assertTrue(AnagramChecker.isAnagram("table","bleat"));
        assertTrue(AnagramChecker.isAnagram("boy","oyb"));
        assertTrue(AnagramChecker.isAnagram("bbb","bbb"));
        assertTrue(AnagramChecker.isAnagram("student","sdtetun"));


        assertFalse(AnagramChecker.isAnagram("tbdle","bleat"));
        assertFalse(AnagramChecker.isAnagram("byd","oyb"));
        assertFalse(AnagramChecker.isAnagram("bbd","bbb"));
        assertFalse(AnagramChecker.isAnagram("suddent","sdtetun"));
        assertFalse(AnagramChecker.isAnagram("hello","helo"));
    }
}