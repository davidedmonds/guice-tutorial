package uk.co.lvs.guice.tutorial;

import org.junit.Before;
import org.junit.Test;

import uk.co.lvs.guice.tutorial.HelloWorld;

import static junit.framework.Assert.assertEquals;

public class HelloWorldTest {
    private HelloWorld helloStaticWorld;

    @Before
    public void setUp() {
        helloStaticWorld = new HelloWorld();
    }

    @Test
    public void labelShouldBeSetToA10CharacterLongString() {
        assertEquals(10, helloStaticWorld.getLabel().getText().trim().length());
    }
}
