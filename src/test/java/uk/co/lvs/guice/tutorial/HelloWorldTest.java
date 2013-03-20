package uk.co.lvs.guice.tutorial;

import static junit.framework.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
    private HelloWorld helloWorld;

    @Before
    public void setUp() {
        helloWorld = new HelloWorld();
    }

    @Test
    public void labelShouldBeSetToA10CharacterLongString() {
        assertEquals(10, helloWorld.getLabel().getText().trim().length());
    }
}
