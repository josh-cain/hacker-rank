package io.reformanda.semper;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class AppTest {

    @Test
    public void testStuff() {
        final String data = "7\n" +
                "-------\n" +
                "-------\n" +
                "m------\n" +
                "-------\n" +
                "-------\n" +
                "-------\n" +
                "------p\n";
        final InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            App.main(new String[0]);
        } finally {
            System.setIn(stdin);
        }
    }
}
