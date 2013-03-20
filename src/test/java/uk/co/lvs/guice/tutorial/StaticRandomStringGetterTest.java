package uk.co.lvs.guice.tutorial;

import org.junit.Test;

import uk.co.lvs.guice.tutorial.StaticRandomStringGetter;

import static junit.framework.Assert.assertEquals;

public class StaticRandomStringGetterTest {
    @Test
    public void getNextWordReturnsA10CharacterString() {
        assertEquals(10, StaticRandomStringGetter.getInstance().getNextWord().trim().length());
    }
}
