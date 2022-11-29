package com.bridgelabz;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.regex.Pattern;

public class TestCase {

    @Test
    public void fName(String a){
        TestCase obj = new TestCase();
        obj.
        boolean b1 = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$").matcher(a).matches();
        assertEquals(true, b1);
    }

}
