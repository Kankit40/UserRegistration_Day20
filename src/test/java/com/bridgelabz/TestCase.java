package com.bridgelabz;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class TestCase extends UserRegistration{

    @Test
    public void NameTest(){
        Assert.assertEquals(true, Name("Ankit") );
    }
}
