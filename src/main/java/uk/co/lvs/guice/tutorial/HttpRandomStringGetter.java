package uk.co.lvs.guice.tutorial;

import java.io.IOException;

import us.monoid.web.Resty;

public class HttpRandomStringGetter {
    private static final HttpRandomStringGetter INSTANCE = new HttpRandomStringGetter();

    private HttpRandomStringGetter() {
    }

    public static HttpRandomStringGetter getInstance() {
        return INSTANCE;
    }

    public String getNextWord() {
        System.out.println("HttpRandomStringGetter says: Time to get another random string!");
        try {
            return new Resty()
                    .text("http://www.random.org/strings/?num=1&len=10&digits=on&upperalpha=on&loweralpha=on&unique=off&format=plain&rnd=new")
                    .toString();
        } catch (IOException e) {
            return "ERRORERROR";
        }
    }
}
