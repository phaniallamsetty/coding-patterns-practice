package com.pallamsetty.arraysandhashing;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class StringEncodeDecodeTest {
    private final StringEncodeDecode sed;

    public StringEncodeDecodeTest() {
        sed = new StringEncodeDecode();
    }

    @Test
    public void testStringEncode1() {
        String[] strs = { "Phanindra", "Allamsetty", "Tejaswi", "Kapala",
                "Avinash", "Damaraju", "Harsha", "Perla", "Sravya", "Y", "Lando" };
        assertEquals("9#Phanindra10#Allamsetty7#Tejaswi6#Kapala7#Avinash8#Damaraju6#Harsha5#Perla6#Sravya1#Y5#Lando",
                sed.encode(List.of(strs)));
    }

    @Test
    public void testStringEncode2() {
        String[] strs = { };
        assertEquals("",
                sed.encode(List.of(strs)));
    }

    @Test
    public void testStringEncode3() {
        String[] strs = { "Fernando", "Alonso", "#14" };
        assertEquals("8#Fernando6#Alonso3##14",
                sed.encode(List.of(strs)));
    }

    @Test
    public void testStringEncode4() {
        String[] strs = { "Fernando", "Alonso", "#14", "Kimi", "Raikkonen#7" };
        assertEquals("8#Fernando6#Alonso3##144#Kimi11#Raikkonen#7",
                sed.encode(List.of(strs)));
    }

    @Test
    public void testStringDecode1() {
        String str = "9#Phanindra10#Allamsetty7#Tejaswi6#Kapala7#Avinash8#Damaraju6#Harsha5#Perla6#Sravya1#Y5#Lando";
        String[] strs = { "Phanindra", "Allamsetty", "Tejaswi", "Kapala",
                "Avinash", "Damaraju", "Harsha", "Perla", "Sravya", "Y", "Lando" };
        List<String> expected = List.of(strs);
        List<String> actual = sed.decode(str);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void testStringDecode2() {
        String str = "";
        String[] strs = { };
        List<String> expected = List.of(strs);
        List<String> actual = sed.decode(str);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void testStringDecode3() {
        String str = "8#Fernando6#Alonso3##14";
        String[] strs = { "Fernando", "Alonso", "#14" };
        List<String> expected = List.of(strs);
        List<String> actual = sed.decode(str);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void testStringDecode4() {
        String str = "8#Fernando6#Alonso3##144#Kimi11#Raikkonen#7";
        String[] strs = { "Fernando", "Alonso", "#14", "Kimi", "Raikkonen#7" };
        List<String> expected = List.of(strs);
        List<String> actual = sed.decode(str);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}
