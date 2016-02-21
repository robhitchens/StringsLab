package io.zipcoder;

/**
 * Created by roberthitchens3 on 2/21/16.
 */
import org.junit.Before;
import org.junit.Test;
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
}
