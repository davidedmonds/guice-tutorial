package uk.co.lvs.guice.tutorial;

import org.junit.Test;

import uk.co.lvs.guice.tutorial.HttpRandomStringGetter;

import static junit.framework.Assert.assertEquals;

public class HttpRandomStringGetterTest {
    @Test
    public void getNextWordReturnsA10CharacterString() {
        assertEquals(10, HttpRandomStringGetter.getInstance().getNextWord().trim().length());
    }
}
