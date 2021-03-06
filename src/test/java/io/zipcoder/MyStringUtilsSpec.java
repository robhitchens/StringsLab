package io.zipcoder;

/**
 * Created by roberthitchens3 on 2/21/16.
 */
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
public class MyStringUtilsSpec {
    private MyStringUtils msu = new MyStringUtils();

    @Test
    public void stringCombinerTestStrings(){
        String[] strarr = {"One","punch","man","great"};
        String expected="One,punch,man,great";
        String actual = msu.stringCombiner(strarr);
        assertEquals("expected and actual should be equal",expected,actual);
    }
    @Test
    public void stringCombinerTestCharacters(){
        char[] chrarr = {'a','b','c','d','f','u','z'};
        String expected = "a,b,c,d,f,u,z";
        String actual = msu.stringCombiner(chrarr);
        assertEquals("expected and actual should be equal",expected, actual);
    }
    @Test
    public void stringSeparatorTest(){
        String str = "milli\nvanilli";
        String[] expected = {"milli","vanilli"};
        String[] actual = msu.stringSeparator(str);
        assertTrue("expected and actual should be equal", Arrays.equals(expected, actual));
    }
    @Test
    public void reverseCapitalTest(){
        String str = "hELLO";
        String expected = "Hello";
        String actual = msu.reverseCapital(str);
        assertEquals("expected and actual should be equal",expected,actual);
    }
    @Test
    public void reverseStringTest(){
        String str = "milli vanilli";
        String expected = "illim illinav";
        String actual = msu.reverseString(str);
        assertEquals("expected and actual should be equal", expected, actual);
    }
    @Test
    public void replaceWhiteSpaceTest(){
        String str= "milli vanilli";
        String expected = "milli\nvanilli";
        String actual= msu.replaceWhiteSpace(str);
        assertEquals("expected and actual should be equal", expected, actual);
    }
    @Test
    public void allSubstringsTest(){
        String str = "butt";
        String[] expected = {"b", "bu", "but", "butt", "u", "ut","utt","t","tt","t"};
        String[] actual = msu.allSubstrings(str);
        assertTrue("expected and actual should be equal", Arrays.equals(expected, actual));
    }

}
